package com.codesroots.live_venodr.presentation.current_order_fragment.mvi


import com.codesroots.live_venodr.helper.UserError
import com.codesroots.live_venodr.models.current_orders.CurrentOrderModel


data class MainViewState(
    var data: CurrentOrderModel?=null,
    var noOrderYet : Boolean? = false,
    var progress:  Boolean? = null,
    var error: UserError?=null,
    var cliendLatitude :Double ? = null,
    var cliendLongitude :Double ? = null,
    var PlaceId_2: String?=null,
    var PlaceId_3: String?=null,
    var UserId: Int?=null,
)