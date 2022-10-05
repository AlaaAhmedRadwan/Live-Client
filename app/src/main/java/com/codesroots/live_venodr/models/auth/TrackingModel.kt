package com.codesroots.live_venodr.models.auth

data class TrackingModel(
    var roomID: String?=null,
    var location: Coordinates?=null,
)
data class Coordinates(
    var latitude: Double?=null,
    var longitude: Double?=null,
)