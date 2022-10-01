package com.codesroots.live.models.ordermodel

import com.codesroots.live.models.current_orders.Branches
import com.codesroots.live.models.ordermodel.OrderDetail

data class OrderModel(
    var id: Int?=null,
    var branch_id: Int?=null,
    var branches: Branches?=null,
    var delivery_serivce: Int?=null,
    var total: Double?=null,
    )