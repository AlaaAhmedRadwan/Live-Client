package com.codesroots.live_venodr.models.current_orders

import com.codesroots.live_venodr.models.MenuCategoriesItems
import com.codesroots.live_venodr.models.OrderDetailsOption

data class OrderDetail(
    var amount: Int?=null,
    var created: String?=null,
    var id: Int?=null,
    var menu_categories_itemId: Int?=null,
    var menu_categories_items: MenuCategoriesItems?=null,
    var modified: String?=null,
    var notes: String?=null,
    var orderId: Int?=null,
    var order_details_options: List<OrderDetailsOption>?=null,
    var total: Float?=null,
)