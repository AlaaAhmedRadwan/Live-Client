package com.codesroots.live.datalayer

import com.codesroots.live.helper.Constants.Companion.GOOGLE_GEOCODE_URL
import com.codesroots.live.models.auth.AuthModel
import com.codesroots.live.models.auth.Driver
import com.codesroots.live.models.auth.User
import com.codesroots.live.models.current_orders.*

import com.codesroots.live.models.delivery.Delivery
import com.codesroots.live.models.delivery.DeliveryItem
import com.codesroots.live.models.ordermodel.OrderModel
import com.satafood.core.entities.token.Token
import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.*


interface APIServices {

    ////////////// Authentication
    @POST("login")
    suspend fun login(@Body loginModel: User?): Response<AuthModel>

    ////////////// delivers
    @POST("delivers/indexForBranch")
    suspend fun getDeliveris(@Body delivery: DeliveryItem?): ArrayList<DeliveryItem>

    ////////////// notifications
    @POST("users/registerToken")
    suspend fun registerToken(@Body user: AuthModel?): Response<AuthModel>


    @POST("notification/sendToDevice")
    suspend fun sendNotificationToDevice(@Body user: AuthModel?): Response<AuthModel>


    ////////////// make order
    @POST("Orders/add")
    @Headers("Accept: Application/json", "cache-control: no-cache")
    suspend fun AddOrder(@Body orderModel: OrderModel?): Response<OrderModel>


    //delivers/GetDliveryOrders
    @POST("users/edituser/{id}")
    suspend fun updateUserToken(@Path("id") id: Int, @Body token: Token): Int

    @GET("orders/currentorders/{id}/0")
    suspend fun getCurrentOrders(@Path("id") id: Int): CurrentOrderModel

    @POST("branches/view/{branchId}")
    suspend fun getBranchData(@Path("branchId") id: Int): Response<Delivery>

    //Delivery Orders By Date
    @POST("orders/GetBranchOrdersByDate")
    suspend fun getDeliveryOrdersByDate(@Body dateModel: DateModel?): ArrayList<OrdersItem>

    // order_status_id
    // قبول 3
    // تسليم 4
    // رفض 5

    @POST("orders/edit/{order_id}")
    suspend fun changeOrderStatus(
        @Path("order_id") orderId: Int, @Body  data: OrderStatus): OrderStatus


    //deliversOrdersCanceled/add
    @POST("deliversOrdersCanceled/add")
    suspend fun deliversOrdersCanceled(@Body data: OrdersItem): OrdersItem

    @Multipart
    @POST("delivers/edit/{id}")
    suspend fun editDeliveryData(
        @Part img: MultipartBody.Part,
        @Part("name") name: String,
        @Part("mobile") phone: String,
        @Path("id") id: Int,
    ): Driver

    @FormUrlEncoded
    @POST("delivers/edit/{id}")
    suspend fun changeDeliveryPlaceId(
        @Path("id") id: Int,
        @Field("admivstrative_area_2") admivstrative_area_2: String,
        @Field("admivstrative_area_3") admivstrative_area_3: String,

        ): Driver

    @GET
    suspend fun getLocationByLatLng(
        @Url url: String = GOOGLE_GEOCODE_URL,
        @Query("latlng")
        latlng: String,
        @Query("key")
        apiKey: String = "AIzaSyBgPlLlB6uJSbGBAhlircYKudeeuGVtWfs",
        @Query("result_type")
        result_type: String = "administrative_area_level_3|administrative_area_level_2"
    ): GoogleLocation


}


