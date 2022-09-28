package com.codesroots.live.databinding;
import com.codesroots.live.R;
import com.codesroots.live.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DailyOrdersAdapterBindingImpl extends DailyOrdersAdapterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mView, 8);
        sViewsWithIds.put(R.id.iv_image, 9);
        sViewsWithIds.put(R.id.orderNumberText, 10);
        sViewsWithIds.put(R.id.deliveryTimeText, 11);
        sViewsWithIds.put(R.id.totalText, 12);
        sViewsWithIds.put(R.id.paymentWayText, 13);
        sViewsWithIds.put(R.id.details_button, 14);
        sViewsWithIds.put(R.id.tv_history, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DailyOrdersAdapterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private DailyOrdersAdapterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (android.widget.TextView) bindings[15]
            );
        this.address.setTag(null);
        this.deliveryTime.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        this.orderNumber.setTag(null);
        this.paymentWay.setTag(null);
        this.total.setTag(null);
        this.tvDeliveryPrice.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.Context == variableId) {
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

    public void setContext(@Nullable com.codesroots.live.presentation.map_activity.MapActivity Context) {
        this.mContext = Context;
    }
    public void setListener(@Nullable com.codesroots.live.helper.ClickHandler Listener) {
        this.mListener = Listener;
    }
    public void setData(@Nullable com.codesroots.live.models.current_orders.OrdersItem Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
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
        int androidxDatabindingViewDataBindingSafeUnboxDataBillingAddressId = 0;
        java.lang.String dataBillingAddressCreatedAt = null;
        java.lang.Double dataTotal = null;
        com.codesroots.live.models.current_orders.BillingAddress dataBillingAddress = null;
        java.lang.String stringValueOfDataTotal = null;
        com.codesroots.live.models.current_orders.OrdersItem data = mData;
        double androidxDatabindingViewDataBindingSafeUnboxDataTotal = 0.0;
        java.lang.Integer dataBillingAddressId = null;
        java.lang.String dataPaymenttypeName = null;
        java.lang.Integer dataDeliverySerivce = null;
        java.lang.String tvDeliveryPriceAndroidStringDeliveryFeeJavaLangStringDataDeliverySerivce = null;
        com.codesroots.live.models.current_orders.PaymenttypeX dataPaymenttype = null;
        java.lang.String dataBillingAddressFirstName = null;
        java.lang.String dataBillingAddressAddress = null;
        java.lang.String stringValueOfDataBillingAddressId = null;

        if ((dirtyFlags & 0xcL) != 0) {



                if (data != null) {
                    // read data.total
                    dataTotal = data.getTotal();
                    // read data.billing_address
                    dataBillingAddress = data.getBilling_address();
                    // read data.delivery_serivce
                    dataDeliverySerivce = data.getDelivery_serivce();
                    // read data.paymenttype
                    dataPaymenttype = data.getPaymenttype();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.total)
                androidxDatabindingViewDataBindingSafeUnboxDataTotal = androidx.databinding.ViewDataBinding.safeUnbox(dataTotal);
                // read ((@android:string/delivery_fee) + (" ")) + (data.delivery_serivce)
                tvDeliveryPriceAndroidStringDeliveryFeeJavaLangStringDataDeliverySerivce = ((tvDeliveryPrice.getResources().getString(R.string.delivery_fee)) + (" ")) + (dataDeliverySerivce);
                if (dataBillingAddress != null) {
                    // read data.billing_address.created_at
                    dataBillingAddressCreatedAt = dataBillingAddress.getCreated_at();
                    // read data.billing_address.id
                    dataBillingAddressId = dataBillingAddress.getId();
                    // read data.billing_address.first_name
                    dataBillingAddressFirstName = dataBillingAddress.getFirst_name();
                    // read data.billing_address.address
                    dataBillingAddressAddress = dataBillingAddress.getAddress();
                }
                if (dataPaymenttype != null) {
                    // read data.paymenttype.name
                    dataPaymenttypeName = dataPaymenttype.getName();
                }


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(data.total))
                stringValueOfDataTotal = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxDataTotal);
                // read androidx.databinding.ViewDataBinding.safeUnbox(data.billing_address.id)
                androidxDatabindingViewDataBindingSafeUnboxDataBillingAddressId = androidx.databinding.ViewDataBinding.safeUnbox(dataBillingAddressId);


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(data.billing_address.id))
                stringValueOfDataBillingAddressId = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxDataBillingAddressId);
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.address, dataBillingAddressAddress);
            com.codesroots.live.helper.Public_usecaseKt.setDatetext(this.deliveryTime, dataBillingAddressCreatedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, dataBillingAddressFirstName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.orderNumber, stringValueOfDataBillingAddressId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.paymentWay, dataPaymenttypeName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.total, stringValueOfDataTotal);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDeliveryPrice, tvDeliveryPriceAndroidStringDeliveryFeeJavaLangStringDataDeliverySerivce);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): Context
        flag 1 (0x2L): listener
        flag 2 (0x3L): data
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}