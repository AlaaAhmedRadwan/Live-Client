package com.codesroots.live_venodr.helper

import android.content.Context
import com.codesroots.live_venodr.R
import com.codesroots.live_venodr.databinding.DeliveryItemBinding


class FormValidationLogin {


     fun passwordFocusListener(context: Context,binding: DeliveryItemBinding)
    {
        binding.deliveryServiceContainer .setOnFocusChangeListener { _, focused ->
            if(!focused)
            {
         //       binding.totalContainer.helperText = validDeliveryService(context ,binding)
            }
        }
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
      //  binding.deliveryServiceContainer.helperText = validDeliveryService(context,binding)
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