package com.codesroots.live.databinding;
import com.codesroots.live.R;
import com.codesroots.live.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CurrentOrderItemBindingImpl extends CurrentOrderItemBinding implements com.codesroots.live.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.sort_recycle, 4);
        sViewsWithIds.put(R.id.cardView, 5);
        sViewsWithIds.put(R.id.appCompatImageView, 6);
        sViewsWithIds.put(R.id.details_button, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CurrentOrderItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private CurrentOrderItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            );
        this.address.setTag(null);
        this.call.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
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
        com.codesroots.live.presentation.map_activity.MapActivity context = mContext;
        com.codesroots.live.models.current_orders.BillingAddress dataBillingAddress = null;
        java.lang.String dataBillingAddressFirstNameJavaLangStringDataBillingAddressLastName = null;
        java.lang.String dataBillingAddressFirstName = null;
        java.lang.String dataBillingAddressFirstNameJavaLangString = null;
        com.codesroots.live.helper.ClickHandler listener = mListener;
        java.lang.String dataBillingAddressAddress = null;
        java.lang.String dataBillingAddressLastName = null;
        com.codesroots.live.models.current_orders.OrdersItem data = mData;

        if ((dirtyFlags & 0xcL) != 0) {



                if (data != null) {
                    // read data.billing_address
                    dataBillingAddress = data.getBilling_address();
                }


                if (dataBillingAddress != null) {
                    // read data.billing_address.first_name
                    dataBillingAddressFirstName = dataBillingAddress.getFirst_name();
                    // read data.billing_address.address
                    dataBillingAddressAddress = dataBillingAddress.getAddress();
                    // read data.billing_address.last_name
                    dataBillingAddressLastName = dataBillingAddress.getLast_name();
                }


                // read (data.billing_address.first_name) + (" ")
                dataBillingAddressFirstNameJavaLangString = (dataBillingAddressFirstName) + (" ");


                // read ((data.billing_address.first_name) + (" ")) + (data.billing_address.last_name)
                dataBillingAddressFirstNameJavaLangStringDataBillingAddressLastName = (dataBillingAddressFirstNameJavaLangString) + (dataBillingAddressLastName);
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.address, dataBillingAddressAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, dataBillingAddressFirstNameJavaLangStringDataBillingAddressLastName);
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