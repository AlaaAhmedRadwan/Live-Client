package com.codesroots.live.presentation.history_order_fragment.mvi


import com.codesroots.live.helper.UserError
import com.codesroots.live.models.current_orders.OrdersItem


data class MainViewState(
    var data: ArrayList<OrdersItem>?=null,
    var filterData : ArrayList<OrdersItem>?=null,
    var noOrderYet : Boolean? = false,
    val progress:  Boolean? = null,
    var error: UserError?=null
)