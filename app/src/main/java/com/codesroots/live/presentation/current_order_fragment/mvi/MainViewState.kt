package com.codesroots.live.presentation.current_order_fragment.mvi


import com.codesroots.live.helper.UserError
import com.codesroots.live.models.current_orders.CurrentOrderModel
import com.codesroots.live.models.current_orders.OrdersItem


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