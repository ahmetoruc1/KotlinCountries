package com.example.kotlincountries.model

import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("name")
    val countryName: String?,
    @SerializedName("region")
    val countryRegion: String?,
    @SerializedName("flag")
    val countryFlag:String?,
    @SerializedName("capital")
    val countryCapital:String?,
    @SerializedName("currency")
    val countryCurrency:String?,
    @SerializedName("language")
    val countryLanguage:String?
)