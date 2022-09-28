package com.codesroots.live.repository


import com.codesroots.live.datalayer.APIServices
import com.codesroots.live.models.auth.AuthModel
import com.codesroots.live.models.auth.Driver
import com.codesroots.live.models.auth.User
import com.codesroots.live.models.current_orders.*
import com.codesroots.live.models.delivery.Delivery
import com.codesroots.live.models.delivery.DeliveryItem
import com.satafood.core.entities.token.Token
import okhttp3.MultipartBody

import retrofit2.Response
import javax.inject.Inject

/**
Created by Prokash Sarkar on Tue, January 19, 2021
 **/

class RemoteDataSource @Inject constructor(private val ApiService: APIServices)
    : DataSource {


    override suspend fun getLoginResponse(loginModel: User): Response<AuthModel> {
        return ApiService.login(loginModel)
    }


    override suspend fun registerToken(loginModel: AuthModel): Response<AuthModel> {
        return ApiService.registerToken(loginModel)
    }

    override suspend fun sendNotificationToDevice(loginModel: AuthModel): Response<AuthModel> {
        return ApiService.sendNotificationToDevice(loginModel)
    }



    override suspend fun getDeliveris(delivery: DeliveryItem):ArrayList<DeliveryItem>{
        return ApiService.getDeliveris(delivery)
    }


    override suspend fun getCurrentOrders(id:Int?): CurrentOrderModel =
       runCatching { ApiService.getCurrentOrders(id!!) }
           .getOrElse { throw it }


    override suspend fun getDeliveryOrdersByDate(dateModel: DateModel?): ArrayList<OrdersItem> =
       runCatching { ApiService.getDeliveryOrdersByDate(dateModel) }
           .getOrElse { throw it }

    override suspend fun changeOrderStatus(order_id:Int,data: OrderStatus): OrderStatus {
        return ApiService.changeOrderStatus(order_id,data)
    }

    override suspend fun updateUserToken(userId: Int, token: Token): Int {
        return ApiService.updateUserToken(userId, token)
    }



    //changeDeliveryStatus
    override suspend fun editDeliveryData(file: MultipartBody.Part?,name : String?,phone:String? ,id: Int?): Driver {
        return ApiService.editDeliveryData(file!!,name!!,phone!!,id!!)
    }

    override suspend fun getBranchData(branchId: Int?): Response<Delivery>  {
        return ApiService.getBranchData(branchId!!)
    }


    //deliversOrdersCanceled
    override suspend fun deliversOrdersCanceled(data: OrdersItem): OrdersItem  {
        return ApiService.deliversOrdersCanceled(data)

    }
    override suspend fun getGoogleLocationByLatLng(latlng: String) : GoogleLocation {
        return ApiService.getLocationByLatLng(latlng = latlng)
    }

    override suspend fun editDeliveryPlaceId(admin_place_2 : String?,admin_place_3:String? ,id: Int?): Driver {
        return ApiService.changeDeliveryPlaceId(id!!,admin_place_2!!,admin_place_3!!)
    }
}