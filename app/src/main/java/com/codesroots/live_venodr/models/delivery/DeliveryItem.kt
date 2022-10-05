package com.codesroots.live_venodr.models.delivery

import com.codesroots.live_venodr.models.current_orders.Branches

data class DeliveryItem(
    var approval: Int?=null,
    var branch_id: Int?=null,
    var branches: Branches?=null,
    var created: Any?=null,
    var department_message: String?=null,
    var id: Int?=null,
    var is_online: Int?=null,
    var mobile: String?=null,
    var modified: String?=null,
    var name: String?=null,
    var photo: String?=null,
    var room_id: String?=null,
    var admivstrative_area_3: String?=null,
    var admivstrative_area_2: String?=null,
    var salary: Int?=null,
    var user: User?=null,
    var user_id: Int?=null,
)