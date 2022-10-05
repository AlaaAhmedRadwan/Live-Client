package com.codesroots.live_venodr.models.current_orders

data class CurrentOrderModel(
    var results: List<OrdersItem>?=null,
    var total: Float?=null,
)