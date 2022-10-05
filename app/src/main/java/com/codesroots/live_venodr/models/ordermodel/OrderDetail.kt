package com.codesroots.live_venodr.models.ordermodel


data class OrderDetail(
    var amount: Int?=null,
    var menu_categories_itemId: Int?=null,
    var order_details_options: List<OrderDetailsOption>?=null,
    var total: Int?=null,
    var notes: String?=null,
    var created: String?=null,
    var id: Int?=null,
    var modified: String?=null,
    var orderId: Int?=null,

    )
