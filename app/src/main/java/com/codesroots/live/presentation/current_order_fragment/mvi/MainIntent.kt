package com.codesroots.live.presentation.current_order_fragment.mvi


sealed class MainIntent(open val viewState: MainViewState? = null, open val vendorId: Int? = null) {

    data class Initialize(override val viewState: MainViewState,override val vendorId: Int?) : MainIntent()

    data class getLatLong(override val viewState: MainViewState) : MainIntent()
    data class GetPlaceId(override val viewState: MainViewState) : MainIntent()
    data class EditDeliveryLocation(override val viewState: MainViewState) : MainIntent()

    data class ErrorDisplayed(override val viewState: MainViewState) : MainIntent()

}
