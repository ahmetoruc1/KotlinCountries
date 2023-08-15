package com.example.kotlincountries.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlincountries.model.Country

class FeedViewModel: ViewModel() {
    val countries=MutableLiveData<List<Country>>()
    val countryError=MutableLiveData<Boolean>()
    val countryLoading=MutableLiveData<Boolean>()

    fun refreshData(){
        val country=Country(
            "Turkey",
            "Europe",
            "www.sss.com",
            "Ankara",
            "TRY",
            "Turkish"
        )
        val country2=Country(
            "France",
            "Europe",
            "www.sss.com",
            "Paris",
            "EURO",
            "French"
        )
        val country3=Country(
            "Germany",
            "Europe",
            "www.sss.com",
            "Berlin",
            "EURO",
            "German"
        )
        val countryList= arrayListOf<Country>(country,country2,country3)
        countries.value=countryList
        countryError.value=false
        countryLoading.value=false
    }

}