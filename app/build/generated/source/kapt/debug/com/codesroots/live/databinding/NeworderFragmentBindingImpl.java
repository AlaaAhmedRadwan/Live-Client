package com.codesroots.live.databinding;
import com.codesroots.live.R;
import com.codesroots.live.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NeworderFragmentBindingImpl extends NeworderFragmentBinding implements com.codesroots.live.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guid, 7);
        sViewsWithIds.put(R.id.sort_recycle, 8);
        sViewsWithIds.put(R.id.iv_image, 9);
        sViewsWithIds.put(R.id.paymentWayText, 10);
        sViewsWithIds.put(R.id.details_button, 11);
        sViewsWithIds.put(R.id.ButtonClick, 12);
        sViewsWithIds.put(R.id.confirm_button, 13);
        sViewsWithIds.put(R.id.cancel_button, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public NeworderFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private NeworderFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (android.view.View) bindings[7]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            );
        this.address.setTag(null);
        this.call.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        this.paymentWay.setTag(null);
        this.tvAddressDetails.setTag(null);
        this.tvPrice.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.codesroots.live.generated.callback.OnClickListener(this, 1);
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
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.Context);
        super.requestRebind();
    }
    public void setListener(@Nullable com.codesroots.live.helper.ClickHandler Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
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
        int androidxDatabindingViewDataBindingSafeUnboxDataTakeway = 0;
        java.lang.String dataBillingAddressApartmentNumber = null;
        boolean dataTakewayInt0 = false;
        com.codesroots.live.presentation.map_activity.MapActivity context = mContext;
        com.codesroots.live.models.current_orders.BillingAddress dataBillingAddress = null;
        java.lang.String tvAddressDetailsAndroidStringFloorNumberDataBillingAddressFloorNumber = null;
        com.codesroots.live.helper.ClickHandler listener = mListener;
        com.codesroots.live.models.current_orders.OrdersItem data = mData;
        java.lang.String dataBillingAddressFloorNumber = null;
        java.lang.String javaLangStringPriceDataOrderDetailsGetInt0Total = null;
        java.lang.String tvAddressDetailsAndroidStringFloorNumberDataBillingAddressFloorNumberJavaLangStringTvAddressDetailsAndroidStringFlatNumber = null;
        java.lang.String dataBillingAddressAddress = null;
        java.lang.String tvAddressDetailsAndroidStringFloorNumberDataBillingAddressFloorNumberJavaLangStringTvAddressDetailsAndroidStringFlatNumberDataBillingAddressApartmentNumber = null;
        java.lang.String javaLangStringPriceDataOrderDetailsGetInt0TotalJavaLangString = null;
        com.codesroots.live.models.current_orders.OrderDetail dataOrderDetailsGetInt0 = null;
        java.lang.String tvAddressDetailsAndroidStringFloorNumberDataBillingAddressFloorNumberJavaLangString = null;
        java.lang.String javaLangStringPriceDataOrderDetailsGetInt0TotalJavaLangStringJavaLangString = null;
        java.lang.String dataTakewayInt0TvAddressDetailsAndroidStringFloorNumberDataBillingAddressFloorNumberJavaLangStringTvAddressDetailsAndroidStringFlatNumberDataBillingAddressApartmentNumberTvAddressDetailsAndroidStringTakeAway = null;
        java.lang.Integer dataTakeway = null;
        java.lang.String dataPaymenttypeName = null;
        java.lang.String dataPaymenttypeNameJavaLangString = null;
        java.lang.Float dataOrderDetailsGetInt0Total = null;
        com.codesroots.live.models.current_orders.PaymenttypeX dataPaymenttype = null;
        java.lang.String dataBillingAddressFirstName = null;
        java.util.List<com.codesroots.live.models.current_orders.OrderDetail> dataOrderDetails = null;

        if ((dirtyFlags & 0xcL) != 0) {



                if (data != null) {
                    // read data.billing_address
                    dataBillingAddress = data.getBilling_address();
                    // read data.takeway
                    dataTakeway = data.getTakeway();
                    // read data.paymenttype
                    dataPaymenttype = data.getPaymenttype();
                    // read data.order_details
                    dataOrderDetails = data.getOrder_details();
                }


                if (dataBillingAddress != null) {
                    // read data.billing_address.address
                    dataBillingAddressAddress = dataBillingAddress.getAddress();
                    // read data.billing_address.first_name
                    dataBillingAddressFirstName = dataBillingAddress.getFirst_name();
                }
                // read androidx.databinding.ViewDataBinding.safeUnbox(data.takeway)
                androidxDatabindingViewDataBindingSafeUnboxDataTakeway = androidx.databinding.ViewDataBinding.safeUnbox(dataTakeway);
                if (dataPaymenttype != null) {
                    // read data.paymenttype.name
                    dataPaymenttypeName = dataPaymenttype.getName();
                }
                if (dataOrderDetails != null) {
                    // read data.order_details.get(0)
                    dataOrderDetailsGetInt0 = dataOrderDetails.get(0);
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.takeway) == 0
                dataTakewayInt0 = (androidxDatabindingViewDataBindingSafeUnboxDataTakeway) == (0);
                // read (data.paymenttype.name) + (" ")
                dataPaymenttypeNameJavaLangString = (dataPaymenttypeName) + (" ");
            if((dirtyFlags & 0xcL) != 0) {
                if(dataTakewayInt0) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
                if (dataOrderDetailsGetInt0 != null) {
                    // read data.order_details.get(0).total
                    dataOrderDetailsGetInt0Total = dataOrderDetailsGetInt0.getTotal();
                }


                // read ("Price : ") + (data.order_details.get(0).total)
                javaLangStringPriceDataOrderDetailsGetInt0Total = ("Price : ") + (dataOrderDetailsGetInt0Total);


                // read (("Price : ") + (data.order_details.get(0).total)) + (" ")
                javaLangStringPriceDataOrderDetailsGetInt0TotalJavaLangString = (javaLangStringPriceDataOrderDetailsGetInt0Total) + (" ");


                // read ((("Price : ") + (data.order_details.get(0).total)) + (" ")) + ("ج.م")
                javaLangStringPriceDataOrderDetailsGetInt0TotalJavaLangStringJavaLangString = (javaLangStringPriceDataOrderDetailsGetInt0TotalJavaLangString) + ("ج.م");
        }
        // batch finished

        if ((dirtyFlags & 0x20L) != 0) {

                if (dataBillingAddress != null) {
                    // read data.billing_address.apartment_number
                    dataBillingAddressApartmentNumber = dataBillingAddress.getApartment_number();
                    // read data.billing_address.floor_number
                    dataBillingAddressFloorNumber = dataBillingAddress.getFloor_number();
                }


                // read (@android:string/floor_number) + (data.billing_address.floor_number)
                tvAddressDetailsAndroidStringFloorNumberDataBillingAddressFloorNumber = (tvAddressDetails.getResources().getString(R.string.floor_number)) + (dataBillingAddressFloorNumber);


                // read ((@android:string/floor_number) + (data.billing_address.floor_number)) + (" ")
                tvAddressDetailsAndroidStringFloorNumberDataBillingAddressFloorNumberJavaLangString = (tvAddressDetailsAndroidStringFloorNumberDataBillingAddressFloorNumber) + (" ");


                // read (((@android:string/floor_number) + (data.billing_address.floor_number)) + (" ")) + (@android:string/flat_number)
                tvAddressDetailsAndroidStringFloorNumberDataBillingAddressFloorNumberJavaLangStringTvAddressDetailsAndroidStringFlatNumber = (tvAddressDetailsAndroidStringFloorNumberDataBillingAddressFloorNumberJavaLangString) + (tvAddressDetails.getResources().getString(R.string.flat_number));


                // read ((((@android:string/floor_number) + (data.billing_address.floor_number)) + (" ")) + (@android:string/flat_number)) + (data.billing_address.apartment_number)
                tvAddressDetailsAndroidStringFloorNumberDataBillingAddressFloorNumberJavaLangStringTvAddressDetailsAndroidStringFlatNumberDataBillingAddressApartmentNumber = (tvAddressDetailsAndroidStringFloorNumberDataBillingAddressFloorNumberJavaLangStringTvAddressDetailsAndroidStringFlatNumber) + (dataBillingAddressApartmentNumber);
        }

        if ((dirtyFlags & 0xcL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.takeway) == 0 ? ((((@android:string/floor_number) + (data.billing_address.floor_number)) + (" ")) + (@android:string/flat_number)) + (data.billing_address.apartment_number) : @android:string/takeAway
                dataTakewayInt0TvAddressDetailsAndroidStringFloorNumberDataBillingAddressFloorNumberJavaLangStringTvAddressDetailsAndroidStringFlatNumberDataBillingAddressApartmentNumberTvAddressDetailsAndroidStringTakeAway = ((dataTakewayInt0) ? (tvAddressDetailsAndroidStringFloorNumberDataBillingAddressFloorNumberJavaLangStringTvAddressDetailsAndroidStringFlatNumberDataBillingAddressApartmentNumber) : (tvAddressDetails.getResources().getString(R.string.takeAway)));
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.address, dataBillingAddressAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, dataBillingAddressFirstName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.paymentWay, dataPaymenttypeNameJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAddressDetails, dataTakewayInt0TvAddressDetailsAndroidStringFloorNumberDataBillingAddressFloorNumberJavaLangStringTvAddressDetailsAndroidStringFlatNumberDataBillingAddressApartmentNumberTvAddressDetailsAndroidStringTakeAway);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrice, javaLangStringPriceDataOrderDetailsGetInt0TotalJavaLangStringJavaLangString);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.call.setOnClickListener(mCallback1);
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
        flag 0 (0x1L): Context
        flag 1 (0x2L): listener
        flag 2 (0x3L): data
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(data.takeway) == 0 ? ((((@android:string/floor_number) + (data.billing_address.floor_number)) + (" ")) + (@android:string/flat_number)) + (data.billing_address.apartment_number) : @android:string/takeAway
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(data.takeway) == 0 ? ((((@android:string/floor_number) + (data.billing_address.floor_number)) + (" ")) + (@android:string/flat_number)) + (data.billing_address.apartment_number) : @android:string/takeAway
    flag mapping end*/
    //end
}