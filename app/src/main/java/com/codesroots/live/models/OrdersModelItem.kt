package com.codesroots.live.models

import com.codesroots.live.models.current_orders.Branches

data class OrdersModelItem(
    var billing_address: BillingAddress?=null,
    var billing_address_id: Int?=null,
    var branch_id: Int?=null,
    var branches: Branches?=null,
    var canceled_reason: String?=null,
    var commission: Double?=null,
    var created: String?=null,
    var delivery_comment: String?=null,
    var delivery_id: Int?=null,
    var delivery_serivce: Int?=null,
    var delivery_time: Int?=null,
    var discount: Int?=null,
    var drivers: Drivers?=null,
    var id: Int?=null,
    var modified: String?=null,
    var notes: String?=null,
    var offer_id: Int?=null,
    var offers: Offers?=null,
    var order_details: List<OrderDetail>?=null,
    var order_status: OrderStatus?=null,
    var order_status_id: Int?=null,
    var paymenttype: Paymenttype?=null,
    var paymenttype_id: Int?=null,
    var takeway: Int?=null,
    var taxes: Int?=null,
    var total: Int?=null,
    var user_id: Int?=null,
    var users: Users?=null,
    var wallets: Any?=null,
    var wallets_id: Int?=null,
)

