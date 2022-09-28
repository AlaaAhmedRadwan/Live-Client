package com.codesroots.live.databinding;
import com.codesroots.live.R;
import com.codesroots.live.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CurrentItemBindingImpl extends CurrentItemBinding implements com.codesroots.live.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guid2, 8);
        sViewsWithIds.put(R.id.sort_recycle, 9);
        sViewsWithIds.put(R.id.iv_image, 10);
        sViewsWithIds.put(R.id.details_button, 11);
        sViewsWithIds.put(R.id.ButtonClick, 12);
        sViewsWithIds.put(R.id.confirm_button, 13);
        sViewsWithIds.put(R.id.progress, 14);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CurrentItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private CurrentItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (android.view.View) bindings[8]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (android.widget.FrameLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            );
        this.address.setTag(null);
        this.addressDetails.setTag(null);
        this.apartmentNum.setTag(null);
        this.call.setTag(null);
        this.mView.setTag(null);
        this.name.setTag(null);
        this.paymentWay.setTag(null);
        this.price.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.codesroots.live.generated.callback.OnClickListener(this, 1);
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
        java.lang.String dataBillingAddressApartmentNumber = null;
        com.codesroots.live.presentation.map_activity.MapActivity context = mContext;
        com.codesroots.live.models.current_orders.BillingAddress dataBillingAddress = null;
        java.lang.String dataBillingAddressFirstNameJavaLangStringDataBillingAddressLastName = null;
        java.lang.String dataBillingAddressFirstNameJavaLangString = null;
        com.codesroots.live.helper.ClickHandler listener = mListener;
        com.codesroots.live.models.current_orders.OrdersItem data = mData;
        java.lang.String javaLangStringJavaLangStringDataBillingAddressFloorNumber = null;
        java.lang.String dataBillingAddressFloorNumber = null;
        java.lang.String javaLangStringPriceDataOrderDetailsGetInt0Total = null;
        java.lang.String dataBillingAddressAddress = null;
        java.lang.String javaLangStringPriceDataOrderDetailsGetInt0TotalJavaLangString = null;
        com.codesroots.live.models.current_orders.OrderDetail dataOrderDetailsGetInt0 = null;
        java.lang.String javaLangStringPriceDataOrderDetailsGetInt0TotalJavaLangStringJavaLangString = null;
        java.lang.String javaLangStringJavaLangStringDataBillingAddressApartmentNumber = null;
        java.lang.String dataBillingAddressLastName = null;
        java.lang.String paymentWayAndroidStringPaymentMethodJavaLangStringDataPaymenttypeName = null;
        java.lang.String dataPaymenttypeName = null;
        java.lang.Float dataOrderDetailsGetInt0Total = null;
        com.codesroots.live.models.current_orders.PaymenttypeX dataPaymenttype = null;
        java.lang.String dataBillingAddressFirstName = null;
        java.util.List<com.codesroots.live.models.current_orders.OrderDetail> dataOrderDetails = null;

        if ((dirtyFlags & 0xcL) != 0) {



                if (data != null) {
                    // read data.billing_address
                    dataBillingAddress = data.getBilling_address();
                    // read data.paymenttype
                    dataPaymenttype = data.getPaymenttype();
                    // read data.order_details
                    dataOrderDetails = data.getOrder_details();
                }


                if (dataBillingAddress != null) {
                    // read data.billing_address.apartment_number
                    dataBillingAddressApartmentNumber = dataBillingAddress.getApartment_number();
                    // read data.billing_address.floor_number
                    dataBillingAddressFloorNumber = dataBillingAddress.getFloor_number();
                    // read data.billing_address.address
                    dataBillingAddressAddress = dataBillingAddress.getAddress();
                    // read data.billing_address.last_name
                    dataBillingAddressLastName = dataBillingAddress.getLast_name();
                    // read data.billing_address.first_name
                    dataBillingAddressFirstName = dataBillingAddress.getFirst_name();
                }
                if (dataPaymenttype != null) {
                    // read data.paymenttype.name
                    dataPaymenttypeName = dataPaymenttype.getName();
                }
                if (dataOrderDetails != null) {
                    // read data.order_details.get(0)
                    dataOrderDetailsGetInt0 = dataOrderDetails.get(0);
                }


                // read (("شقة") + (" : ")) + (data.billing_address.apartment_number)
                javaLangStringJavaLangStringDataBillingAddressApartmentNumber = (("شقة") + (" : ")) + (dataBillingAddressApartmentNumber);
                // read (("الدور") + (" : ")) + (data.billing_address.floor_number)
                javaLangStringJavaLangStringDataBillingAddressFloorNumber = (("الدور") + (" : ")) + (dataBillingAddressFloorNumber);
                // read (data.billing_address.first_name) + (" ")
                dataBillingAddressFirstNameJavaLangString = (dataBillingAddressFirstName) + (" ");
                // read ((@android:string/payment_method) + (" ")) + (data.paymenttype.name)
                paymentWayAndroidStringPaymentMethodJavaLangStringDataPaymenttypeName = ((paymentWay.getResources().getString(R.string.payment_method)) + (" ")) + (dataPaymenttypeName);
                if (dataOrderDetailsGetInt0 != null) {
                    // read data.order_details.get(0).total
                    dataOrderDetailsGetInt0Total = dataOrderDetailsGetInt0.getTotal();
                }


                // read ((data.billing_address.first_name) + (" ")) + (data.billing_address.last_name)
                dataBillingAddressFirstNameJavaLangStringDataBillingAddressLastName = (dataBillingAddressFirstNameJavaLangString) + (dataBillingAddressLastName);
                // read ("Price : ") + (data.order_details.get(0).total)
                javaLangStringPriceDataOrderDetailsGetInt0Total = ("Price : ") + (dataOrderDetailsGetInt0Total);


                // read (("Price : ") + (data.order_details.get(0).total)) + (" ")
                javaLangStringPriceDataOrderDetailsGetInt0TotalJavaLangString = (javaLangStringPriceDataOrderDetailsGetInt0Total) + (" ");


                // read ((("Price : ") + (data.order_details.get(0).total)) + (" ")) + ("ج.م")
                javaLangStringPriceDataOrderDetailsGetInt0TotalJavaLangStringJavaLangString = (javaLangStringPriceDataOrderDetailsGetInt0TotalJavaLangString) + ("ج.م");
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.address, dataBillingAddressAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addressDetails, javaLangStringJavaLangStringDataBillingAddressFloorNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.apartmentNum, javaLangStringJavaLangStringDataBillingAddressApartmentNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, dataBillingAddressFirstNameJavaLangStringDataBillingAddressLastName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.paymentWay, paymentWayAndroidStringPaymentMethodJavaLangStringDataPaymenttypeName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.price, javaLangStringPriceDataOrderDetailsGetInt0TotalJavaLangStringJavaLangString);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.call.setOnClickListener(mCallback3);
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
    flag mapping end*/
    //end
}