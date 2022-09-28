package com.codesroots.live.models.current_orders

import com.google.gson.annotations.SerializedName

data class GoogleLocation(
    val results: List<AddressResult>,
    val status: String
)

data class AddressResult (
    @SerializedName("formatted_address")
    val formattedAddress: String,

    val geometry: Geometry,

    @SerializedName("place_id")
    val placeID: String,

    val types: List<String>,
)

data class Geometry (
    val location: Location,
)

data class Location (
    val lat: Double,
    val lng: Double
)