package com.codesroots.live.helper

import android.content.Context
import com.codesroots.live.R
import com.codesroots.live.databinding.DeliveryLoginFragmentBinding
import com.codesroots.live.presentation.auth.LoginActivity
import kotlinx.android.synthetic.main.delivery_login_fragment.*
import kotlinx.android.synthetic.main.nav_header_main.*


class Validation {
    fun checkAllFields(view:  DeliveryLoginFragmentBinding, context: Context): Boolean {
        context as LoginActivity
        if (view.username.length() == 0) {
            view.username.error = context.getString(R.string.required);
            return false;
        }

        if (view.password.length() == 0) {
            view.password.error = context.getString(R.string.required);
            return false;
        }


        return true;
    }
}