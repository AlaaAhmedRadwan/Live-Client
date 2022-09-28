package com.codesroots.live.databinding;
import com.codesroots.live.R;
import com.codesroots.live.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CurrentOrdersAdapterBindingImpl extends CurrentOrdersAdapterBinding implements com.codesroots.live.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_order, 5);
        sViewsWithIds.put(R.id.tv_price, 6);
        sViewsWithIds.put(R.id.btn_details, 7);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CurrentOrdersAdapterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private CurrentOrdersAdapterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (android.widget.ImageView) bindings[4]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[3]
            );
        this.imageView.setTag(null);
        this.rowCurrentOrder.setTag(null);
        this.tvAddress.setTag(null);
        this.tvName.setTag(null);
        this.tvStatus.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.codesroots.live.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fragment == variableId) {
            setFragment((com.codesroots.live.presentation.current_item.CurrentItemFragment) variable);
        }
        else if (BR.status == variableId) {
            setStatus((java.lang.String) variable);
        }
        else if (BR.mainFragment == variableId) {
            setMainFragment((com.codesroots.live.presentation.current_order_fragment.CurrentOrderFragment) variable);
        }
        else if (BR.Context == variableId) {
            setContext((com.codesroots.live.presentation.map_activity.MapActivity) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.codesroots.live.helper.ClickHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((com.codesroots.live.models.current_orders.OrdersItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.codesroots.live.presentation.current_item.CurrentItemFragment Fragment) {
        this.mFragment = Fragment;
    }
    public void setStatus(@Nullable java.lang.String Status) {
        this.mStatus = Status;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.status);
        super.requestRebind();
    }
    public void setMainFragment(@Nullable com.codesroots.live.presentation.current_order_fragment.CurrentOrderFragment MainFragment) {
        this.mMainFragment = MainFragment;
    }
    public void setContext(@Nullable com.codesroots.live.presentation.map_activity.MapActivity Context) {
        this.mContext = Context;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.Context);
        super.requestRebind();
    }
    public void setListener(@Nullable com.codesroots.live.helper.ClickHandler Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }
    public void setData(@Nullable com.codesroots.live.models.current_orders.OrdersItem Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String status = mStatus;
        com.codesroots.live.presentation.map_activity.MapActivity context = mContext;
        com.codesroots.live.models.current_orders.BillingAddress dataBillingAddress = null;
        java.lang.String dataBillingAddressFirstNameJavaLangStringDataBillingAddressLastName = null;
        java.lang.String dataBillingAddressFirstNameJavaLangString = null;
        com.codesroots.live.helper.ClickHandler listener = mListener;
        java.lang.String tvStatusAndroidStringOrderStatusStatus = null;
        java.lang.String dataBillingAddressLastName = null;
        com.codesroots.live.models.current_orders.OrdersItem data = mData;
        java.lang.String dataBillingAddressFirstName = null;
        java.lang.String dataBillingAddressAddress = null;

        if ((dirtyFlags & 0x42L) != 0) {



                // read (@android:string/order_status) + (status)
                tvStatusAndroidStringOrderStatusStatus = (tvStatus.getResources().getString(R.string.order_status)) + (status);
        }
        if ((dirtyFlags & 0x60L) != 0) {



                if (data != null) {
                    // read data.billing_address
                    dataBillingAddress = data.getBilling_address();
                }


                if (dataBillingAddress != null) {
                    // read data.billing_address.last_name
                    dataBillingAddressLastName = dataBillingAddress.getLast_name();
                    // read data.billing_address.first_name
                    dataBillingAddressFirstName = dataBillingAddress.getFirst_name();
                    // read data.billing_address.address
                    dataBillingAddressAddress = dataBillingAddress.getAddress();
                }


                // read (data.billing_address.first_name) + (" ")
                dataBillingAddressFirstNameJavaLangString = (dataBillingAddressFirstName) + (" ");


                // read ((data.billing_address.first_name) + (" ")) + (data.billing_address.last_name)
                dataBillingAddressFirstNameJavaLangStringDataBillingAddressLastName = (dataBillingAddressFirstNameJavaLangString) + (dataBillingAddressLastName);
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.imageView.setOnClickListener(mCallback5);
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAddress, dataBillingAddressAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, dataBillingAddressFirstNameJavaLangStringDataBillingAddressLastName);
        }
        if ((dirtyFlags & 0x42L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvStatus, tvStatusAndroidStringOrderStatusStatus);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // data.billing_address.phone
        java.lang.String dataBillingAddressPhone = null;
        // data.billing_address != null
        boolean dataBillingAddressJavaLangObjectNull = false;
        // data.billing_address
        com.codesroots.live.models.current_orders.BillingAddress dataBillingAddress = null;
        // Context
        com.codesroots.live.presentation.map_activity.MapActivity context = mContext;
        // listener != null
        boolean listenerJavaLangObjectNull = false;
        // data != null
        boolean dataJavaLangObjectNull = false;
        // listener
        com.codesroots.live.helper.ClickHandler listener = mListener;
        // data
        com.codesroots.live.models.current_orders.OrdersItem data = mData;



        listenerJavaLangObjectNull = (listener) != (null);
        if (listenerJavaLangObjectNull) {



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {


                dataBillingAddress = data.getBilling_address();

                dataBillingAddressJavaLangObjectNull = (dataBillingAddress) != (null);
                if (dataBillingAddressJavaLangObjectNull) {


                    dataBillingAddressPhone = dataBillingAddress.getPhone();


                    listener.callNumber(dataBillingAddressPhone, context);
                }
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fragment
        flag 1 (0x2L): status
        flag 2 (0x3L): mainFragment
        flag 3 (0x4L): Context
        flag 4 (0x5L): listener
        flag 5 (0x6L): data
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}