package com.codesroots.live.helper

import android.content.Context
import android.util.Patterns
import androidx.appcompat.app.AlertDialog
import com.codesroots.live.R
import com.codesroots.live.databinding.DeliveryItemBinding
import com.codesroots.live.presentation.deliveries_fragment.DeliveriesAdapter


class FormValidationLogin {


     fun passwordFocusListener(context: Context,binding: DeliveryItemBinding)
    {
        binding.deliveryServiceContainer .setOnFocusChangeListener { _, focused ->
            if(!focused)
            {
                binding.totalContainer.helperText = validDeliveryService(context ,binding)
            }
        }
    }

    private fun validDeliveryService(context: Context,binding: DeliveryItemBinding): String?
    {

        val deliveryService = binding.deliveryService.text.toString()
        if(deliveryService.isEmpty())
        {
        return context.getString(R.string.validDelivery)
        }
        return null
    }

    private fun validTotal(context: Context,binding: DeliveryItemBinding): String?
    {
        val total = binding.total.text.toString()
        if(total.isEmpty())
        {
            return context.getString(R.string.validTotal)

        }

        return null
    }




     fun submitForm(binding: DeliveryItemBinding,context: Context): Boolean {

        binding.totalContainer.helperText = validTotal(context,binding)
        binding.deliveryServiceContainer.helperText = validDeliveryService(context,binding)
        val validtotal = binding.totalContainer.helperText == null
        val validdelivery =  binding.deliveryServiceContainer.helperText == null

        return validtotal && validdelivery
    }


    fun nameFocusListener(context: Context,binding: DeliveryItemBinding)
    {
        binding.total.setOnFocusChangeListener { _, focused ->
            if(!focused)
            {
                binding.totalContainer.helperText = validTotal(context,binding)
            }
        }
    }




    fun invalidForm(binding: DeliveryItemBinding, context: Context) {

        passwordFocusListener(context, binding)
        nameFocusListener(context, binding)

    }
}