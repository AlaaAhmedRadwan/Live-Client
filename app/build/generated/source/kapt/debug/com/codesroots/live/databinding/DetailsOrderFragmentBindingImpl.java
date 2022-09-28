package com.codesroots.live.databinding;
import com.codesroots.live.R;
import com.codesroots.live.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DetailsOrderFragmentBindingImpl extends DetailsOrderFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.details_button, 2);
        sViewsWithIds.put(R.id.guid, 3);
        sViewsWithIds.put(R.id.dailyOrderRecycle, 4);
        sViewsWithIds.put(R.id.constraintLayout, 5);
        sViewsWithIds.put(R.id.orderPriceText, 6);
        sViewsWithIds.put(R.id.deliveryTotalText, 7);
        sViewsWithIds.put(R.id.totalText, 8);
        sViewsWithIds.put(R.id.orderPriceValue, 9);
        sViewsWithIds.put(R.id.deliveryTotal, 10);
        sViewsWithIds.put(R.id.total, 11);
        sViewsWithIds.put(R.id.close_button, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DetailsOrderFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private DetailsOrderFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (android.view.View) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.orderNumber.setTag(null);
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
            setData((com.codesroots.live.models.current_orders.OrderDetail) variable);
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
    public void setData(@Nullable com.codesroots.live.models.current_orders.OrderDetail Data) {
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
        java.lang.Integer dataOrderId = null;
        int androidxDatabindingViewDataBindingSafeUnboxDataOrderId = 0;
        java.lang.String stringValueOfDataOrderId = null;
        com.codesroots.live.models.current_orders.OrderDetail data = mData;

        if ((dirtyFlags & 0xcL) != 0) {



                if (data != null) {
                    // read data.orderId
                    dataOrderId = data.getOrderId();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.orderId)
                androidxDatabindingViewDataBindingSafeUnboxDataOrderId = androidx.databinding.ViewDataBinding.safeUnbox(dataOrderId);


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(data.orderId))
                stringValueOfDataOrderId = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxDataOrderId);
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.orderNumber, stringValueOfDataOrderId);
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