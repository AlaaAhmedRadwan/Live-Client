package com.codesroots.live.presentation.deliveries_fragment

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.codesroots.live.R
import com.codesroots.live.databinding.DeliveryItemBinding
import com.codesroots.live.helper.ClickHandler
import com.codesroots.live.helper.Error_MotionToast
import com.codesroots.live.helper.SUCCESS_MotionToast
import com.codesroots.live.models.auth.AuthModel
import com.codesroots.live.models.auth.Driver
import com.codesroots.live.models.current_orders.SetorderToDelivery
import com.codesroots.live.models.delivery.DeliveryItem
import com.codesroots.live.presentation.map_activity.MapActivity
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.delivery_login_fragment.*


class DeliveriesAdapter(
    var context: Context,
    var data: ArrayList<DeliveryItem>,
    var frag: DeliveriesFragment,
) : RecyclerView.Adapter<DeliveriesAdapter.CustomViewHolders>() {


    override fun getItemCount(): Int {
        return data.size
    }


    override fun onBindViewHolder(p0: CustomViewHolders, position: Int) {
        p0.bind(data[position], context)
        ////////////// Socket ///////////////////////
        p0.binding.mView.setOnClickListener {
            p0.sendNotificationToDevice(frag.data.delivery_id!!,
                "طلب جديد",
                "لديك طلب جديد يحتاج التوصيل")
//                if(itemClickable) {
            val gson = Gson()
            val gsonPretty = GsonBuilder().setPrettyPrinting().create()
            val socketObject = SetorderToDelivery(frag.data, (context as MapActivity).Pref.room_id)
            val jsonTut: String = gson.toJson(socketObject)

            println(jsonTut)

            val jsonTutPretty: String = gsonPretty.toJson(socketObject)

            println(jsonTutPretty)

            (context as MapActivity).mSocket?.emit("CreateDeliveryOrder", jsonTutPretty)
            (context as MapActivity).mSocket?.emit("CreateDeliveryRoom",
                (context as MapActivity).Pref.room_id)
            val user_id = data[position].user?.id!!
            Log.d("TAG", "socket// $user_id")
            Log.d("TAG", "socket// $jsonTutPretty")

            frag.view.progress.isVisible = true


        }

        (context as MapActivity).mSocket?.on("OrderCanceled") {
            val gson = Gson()
            val json = it.first().toString()

            val type = object : TypeToken<Driver?>() {}.type
            val newitem = gson.fromJson<Driver>(json, type)
            if (newitem.delivery_information == 1) {
                Handler(Looper.getMainLooper()).post {
                    Log.d("TAG", "socket// orderDelivery " + json)
                    SUCCESS_MotionToast("تم قبول الاوردر", context as MapActivity)
                    frag.view.progress.isVisible = false
                    frag.dismiss()
                }
            } else {
                Handler(Looper.getMainLooper()).post {
                    Error_MotionToast(" تم رفض الاوردر اختار مندوب  أخر ", context as MapActivity)

                }
                Log.d("TAG", "socket// orderCanceled " + json)
            }
        }

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomViewHolders {
        val binding: DeliveryItemBinding =
            DataBindingUtil.inflate(
                LayoutInflater.from(p0.context),
                R.layout.delivery_item, p0, false
            )

        return CustomViewHolders(binding)
    }

    inner class CustomViewHolders(
        var binding: DeliveryItemBinding,
    ) : RecyclerView.ViewHolder(binding.root) {


        fun bind(data: DeliveryItem, context: Context?) {
            binding.data = data
            binding.listener = ClickHandler()
            binding.context = context as MapActivity
        }

        fun sendNotificationToDevice(user_id: Int, title: String, message: String) {
            val notificationInfo = AuthModel(
                title = title, user_id = user_id, message = message)
            frag.viewModel.sendNotificationToDevice(notificationInfo)

        }
    }


}

