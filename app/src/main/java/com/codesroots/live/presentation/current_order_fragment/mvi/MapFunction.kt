package com.codesroots.live.presentation.current_order_fragment.mvi



import android.util.Log
import com.codesroots.live.helper.UserError
import com.codesroots.live.models.auth.Driver
import com.codesroots.live.models.current_orders.CurrentOrderModel
import com.codesroots.live.models.current_orders.GoogleLocation
import com.codesroots.live.models.current_orders.OrdersItem
import com.codesroots.live.presentation.deliveries_fragment.DeliveriesFragment.Companion.TAG
import com.codesroots.live.repository.DataRepo

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first


/**
 * this is the model function in MVI, it's responsibility is to convert intents into views states
 */
suspend fun mapIntentToViewState(
    intent: MainIntent,
    Datarepo: DataRepo,
    loadMainData: suspend () -> Flow<Result<CurrentOrderModel>> = { Datarepo.getOrders(intent.vendorId) },
    GetPlaceId: suspend () -> Flow<Result<GoogleLocation>> = { Datarepo.getGoogleLocationByLatLng(intent.viewState!!.cliendLatitude!!,intent.viewState!!.cliendLongitude!!) },
    EditDeliveryLocation: suspend () -> Flow<Result<Driver>> = { Datarepo.EditDeliveryLocation(intent!!.viewState!!.UserId!!,intent.viewState!!.PlaceId_2!!,intent.viewState!!.PlaceId_3!!) },

    ) = when (intent) {
    is MainIntent.Initialize -> proceedWithInitialize(loadMainData, intent)
    is MainIntent.ErrorDisplayed -> intent.viewState.copy(error = null)
    is MainIntent.getLatLong -> intent.viewState.copy()
    is MainIntent.GetPlaceId -> proceedWithGetPlaceId(GetPlaceId, intent)
    is MainIntent.EditDeliveryLocation -> proceedEditDelivery(EditDeliveryLocation, intent)



}


private suspend fun proceedWithInitialize(
    loadCart: suspend () -> Flow<Result<CurrentOrderModel>>,
    intent: MainIntent,
): MainViewState {
    val response = loadCart()
    val data = response.first()
    return runCatching {
        intent.viewState!!.copy(data = (data.getOrThrow()),
            noOrderYet = false,
            error = null,
            progress = false)
    }
        .getOrElse {
            intent.viewState!!.copy(error = UserError.NetworkError(it))
        }

}


private suspend fun proceedEditDelivery(
    loadCart: suspend () -> Flow<Result<Driver>>,
    intent: MainIntent,
): MainViewState {
    val response = loadCart()
    val data = response.first()
    return runCatching {
        intent.viewState!!.copy(progress = false,
            noOrderYet = false,
        )
    }
        .getOrElse {
            intent.viewState!!.copy(error = UserError.NetworkError(it))
        }

}


private suspend fun proceedWithGetPlaceId(
    loadCart: suspend () -> Flow<Result<GoogleLocation>>,
    intent: MainIntent,
): MainViewState {
    val response = loadCart()
    val data = response.first()
    Log.i(TAG, "proceedWithGetPlaceId: "+data)
    var PlaceId_2 :String? = null
    var PlaceId_3:String? = null

    return runCatching {
        if(data.getOrThrow() != null){
            if (data.getOrThrow().results.isNotEmpty()) {
                PlaceId_3 = data.getOrThrow().results[0].placeID

            }
            if (data.getOrThrow().results.size > 1) {
                PlaceId_2 = data.getOrThrow().results[1].placeID

            }
        }
        intent.viewState!!.copy(PlaceId_2 = PlaceId_2,PlaceId_3 = PlaceId_3,
            noOrderYet = false,
            error = null,
            progress = false)
    }
        .getOrElse {
            intent.viewState!!.copy(error = UserError.NetworkError(it))
        }

}



