package com.codesroots.live.helper

import android.content.Context
import android.content.SharedPreferences


class PreferenceHelper(context: Context) {

    private var app_prefs: SharedPreferences? = null
    private val app_ref = "userdetails"
    var latitude: String?
        get() = app_prefs!!.getString("latitude", "")
        set(latitude) {
            val edit = app_prefs!!.edit()

            edit.putString("latitude", latitude)
            edit.apply()
        }
    var longitude: String?
        get() = app_prefs!!.getString("longitude", "")
        set(longitude) {
            val edit = app_prefs!!.edit()

            edit.putString("longitude", longitude)
            edit.apply()
        }
    var  placeId_3: String?
        get() = app_prefs!!.getString("placeId_3", "")
        set(placeId_3) {
            val edit = app_prefs!!.edit()

            edit.putString("placeId_3", placeId_3)
            edit.apply()
        }

    var placeId_2: String?
        get() = app_prefs!!.getString("placeId_2", "")
        set(placeId_2) {
            val edit = app_prefs!!.edit()
            edit.putString("placeId_2", placeId_2)
            edit.apply()
        }




    var userName: String?
        get() = app_prefs!!.getString("userName", "Alaa")
        set(userName) {
            val edit = app_prefs!!.edit()
            edit.putString("userName", userName)
            edit.apply()
        }
    var photo: String?
        get() = app_prefs!!.getString("photo", "")
        set(photo) {
            val edit = app_prefs!!.edit()
            edit.putString("photo", photo)
            edit.apply()
        }

    var UserToken: String?
        get() = app_prefs!!.getString("UserToken", "")
        set(UserToken) {
            val edit = app_prefs!!.edit()
            edit.putString("UserToken", UserToken)
            edit.apply()
        }
    var code: String?
        get() = app_prefs!!.getString("code", "")
        set(code) {
            val edit = app_prefs!!.edit()
            edit.putString("code", code)
            edit.apply()
        }
    var room_id: String?
        get() = app_prefs!!.getString("room_id", "")
        set(room_id) {
            val edit = app_prefs!!.edit()
            edit.putString("room_id", room_id)
            edit.apply()
        }

    var restaurantLat: String?
        get() = app_prefs!!.getString("restaurantLat", "")
        set(restaurantLat) {
            val edit = app_prefs!!.edit()
            edit.putString("restaurantLat", restaurantLat)
            edit.apply()
        }

    var restaurantLong: String?
        get() = app_prefs!!.getString("restaurantLong", "")
        set(restaurantLong) {
            val edit = app_prefs!!.edit()
            edit.putString("restaurantLong", restaurantLong)
            edit.apply()
        }


    var userPhone: String?
        get() = app_prefs!!.getString("userPhone", "0")
        set(userPhone) {
            val edit = app_prefs!!.edit()
            edit.putString("userPhone", userPhone)
            edit.apply()
        }


    var userId: Int
        get() = app_prefs!!.getInt("userId", 0)
        set(userId) {
            var edit = app_prefs!!.edit()
            edit.putInt("userId", userId)
            edit.apply()
        }

    var restaurantName: String?
        get() = app_prefs!!.getString("restaurantName", "")
        set(restaurantName) {
            val edit = app_prefs!!.edit()
            edit.putString("restaurantName", restaurantName)
            edit.apply()
        }

    var VendorId: Int?
        get() = app_prefs!!.getInt("VendorId", 0)
        set(VendorId) {
            val edit = app_prefs!!.edit()
            edit.putInt("VendorId", VendorId!!)
            edit.apply()
        }


    init {
        try {
            app_prefs = context.getSharedPreferences(
                app_ref,
                Context.MODE_PRIVATE
            )
        } catch (e: NullPointerException) {
        }
    }
}