package com.codesroots.live.models.current_orders

data class CurrentOrderModel(
    var results: List<OrdersItem>?=null,
    var total: Float?=null,
)