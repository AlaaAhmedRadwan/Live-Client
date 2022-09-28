package com.codesroots.live.models.current_orders

import com.codesroots.live.models.Branches
import com.codesroots.live.models.Drivers
import com.codesroots.live.models.Offers
import com.codesroots.live.models.Users
import java.io.Serializable


data class OrdersItem(
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
    var drivers: Any?=null,
    var id: Int?=null,
    var modified: String?=null,
    var notes: String?=null,
    var offer_discount: Int?=null,
    var offer_id: Int?=null,
    var offers: Any?=null,
    var order_details: List<OrderDetail>?=null,
    var order_status: OrderStatus?=null,
    var order_status_id: Int?=null,
    var paymenttype: PaymenttypeX?=null,
    var paymenttype_id: Int?=null,
    var takeway: Int?=null,
    var taxes: Int?=null,
    var test_orders: Int?=null,
    var total: Double?=null,
    var user_id: Int?=null,
    var users: Users?=null,
    var wallet_discount: Int?=null,
    var wallets: Any?=null,
    var wallets_id: Int?=null,
):Serializable{

}
data class SetorderToDelivery(
    var order: OrdersItem?= null,
    var roomId: String? = null,
):Serializable