package com.codesroots.live_venodr.repository

import com.codesroots.live_venodr.models.auth.AuthModel
import com.codesroots.live_venodr.models.auth.Driver
import com.codesroots.live_venodr.models.auth.User
import com.codesroots.live_venodr.models.current_orders.*
import com.codesroots.live_venodr.models.delivery.Delivery
import com.codesroots.live_venodr.models.delivery.DeliveryItem
import com.codesroots.live_venodr.models.ordermodel.OrderModel
import com.satafood.core.entities.token.Token
import okhttp3.MultipartBody

import retrofit2.Response


/**
Created by Prokash Sarkar on Tue, January 19, 2021
 **/


interface DataSource {

    suspend fun getLoginResponse(loginModel: User): Response<AuthModel>

    suspend fun registerToken(loginModel: AuthModel): Response<AuthModel>
    suspend fun sendNotificationToDevice(loginModel: AuthModel): Response<AuthModel>

    suspend fun getDeliveris(deliveryItem: DeliveryItem): ArrayList<DeliveryItem>
    suspend fun AddOrder(orderInfo: OrderModel): Response<OrderModel>

    suspend fun getCurrentOrders(id :Int?): CurrentOrderModel

    suspend fun updateUserToken(userId: Int, token: Token): Int

    suspend fun getDeliveryOrdersByDate(dateModel: DateModel?): ArrayList<OrdersItem>
    suspend fun changeOrderStatus(order_id:Int,data: OrderStatus) : OrderStatus

    suspend fun editDeliveryData(img: MultipartBody.Part?, name : String?, phone:String?,id :Int?) : Driver

    suspend fun getBranchData(id :Int?) : Response<Delivery>

    suspend fun deliversOrdersCanceled(data:OrdersItem) : OrdersItem

    suspend fun getGoogleLocationByLatLng(latlng: String): GoogleLocation


    suspend fun editDeliveryPlaceId(
        admin_place_2: String?,
        admin_place_3: String?,
        id: Int?
    ): Driver
}

