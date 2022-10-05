package com.codesroots.live_venodr.models.current_orders

data class OrderStatus(
    var id: Int?=null,
    var order_status_id: Int?=null,
    var delivery_comment :String?=null,
    var delivery_time : Int?=null,
    var name: String?=null,
    var name_en: String?=null,
)