package com.example.kotlincountries.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlincountries.R
import com.example.kotlincountries.adapter.CountryAdapter
import com.example.kotlincountries.databinding.FragmentFeedBinding
import com.example.kotlincountries.viewmodel.FeedViewModel


class FeedFragment : Fragment() {
    private lateinit var binding: FragmentFeedBinding

    private lateinit var viewModel: FeedViewModel
    private val countryAdapter=CountryAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_feed,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        viewModel=ViewModelProvider(this).get(FeedViewModel::class.java)
        viewModel.refreshData()
        binding.countryList.layoutManager=LinearLayoutManager(context)
        binding.countryList.adapter=countryAdapter


        binding.refreshLayout.setOnRefreshListener {
            binding.countryList.visibility=View.GONE
            binding.countryError.visibility=View.GONE
            binding.ErrorBar.visibility=View.VISIBLE

            viewModel.refreshData()
            binding.refreshLayout.isRefreshing=false
        }


        observeLiveData()

    }

    private fun observeLiveData(){
        viewModel.countries.observe(viewLifecycleOwner, Observer {countries->
            countries?.let {
                binding.countryList.visibility=View.VISIBLE
                countryAdapter.updateCountryList(countries)
            }
        })

        viewModel.countryError.observe(viewLifecycleOwner, Observer {error->
            error?.let {
                if (it){
                    binding.countryError.visibility=View.VISIBLE
                }else{
                    binding.countryError.visibility=View.GONE
                }
            }
        })

        viewModel.countryLoading.observe(viewLifecycleOwner, Observer {loading->
            loading?.let {
                if (it){
                    binding.ErrorBar.visibility=View.VISIBLE
                    binding.countryError.visibility=View.GONE
                    binding.countryList.visibility=View.GONE
                }else{
                    binding.ErrorBar.visibility=View.GONE
                }
            }
        })
    }


}


