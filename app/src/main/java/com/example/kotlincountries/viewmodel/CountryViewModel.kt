package com.example.kotlincountries.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlincountries.model.Country

class CountryViewModel:ViewModel() {
    val countries=MutableLiveData<Country>()
    fun getDataFromRoom(){
        val country=Country(
            "Turkey",
            "Europe",
            "www.sss.com",
            "Ankara",
            "TRY",
            "Turkish"
        )
        countries.value=country
    }
}