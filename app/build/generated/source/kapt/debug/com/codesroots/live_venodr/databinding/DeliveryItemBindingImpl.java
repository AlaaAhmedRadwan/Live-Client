package com.codesroots.live_venodr.databinding;
import com.codesroots.live_venodr.R;
import com.codesroots.live_venodr.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DeliveryItemBindingImpl extends DeliveryItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mView, 3);
        sViewsWithIds.put(R.id.deliveryServiceContainer, 4);
        sViewsWithIds.put(R.id.totalContainer, 5);
        sViewsWithIds.put(R.id.total, 6);
        sViewsWithIds.put(R.id.send, 7);
        sViewsWithIds.put(R.id.progress, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DeliveryItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private DeliveryItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (android.widget.FrameLayout) bindings[8]
            , (androidx.appcompat.widget.AppCompatButton) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            );
        this.ivImage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
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
            setContext((com.codesroots.live_venodr.presentation.map_activity.MapActivity) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.codesroots.live_venodr.helper.ClickHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((com.codesroots.live_venodr.models.delivery.DeliveryItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setContext(@Nullable com.codesroots.live_venodr.presentation.map_activity.MapActivity Context) {
        this.mContext = Context;
    }
    public void setListener(@Nullable com.codesroots.live_venodr.helper.ClickHandler Listener) {
        this.mListener = Listener;
    }
    public void setData(@Nullable com.codesroots.live_venodr.models.delivery.DeliveryItem Data) {
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
        java.lang.String dataPhoto = null;
        java.lang.String dataName = null;
        com.codesroots.live_venodr.models.delivery.DeliveryItem data = mData;
        java.lang.String dataNameJavaLangString = null;

        if ((dirtyFlags & 0xcL) != 0) {



                if (data != null) {
                    // read data.photo
                    dataPhoto = data.getPhoto();
                    // read data.name
                    dataName = data.getName();
                }


                // read (data.name) + (" ")
                dataNameJavaLangString = (dataName) + (" ");
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            com.codesroots.live_venodr.helper.Public_usecaseKt.setImageResource(this.ivImage, dataPhoto);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, dataNameJavaLangString);
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