package com.codesroots.live.databinding;
import com.codesroots.live.R;
import com.codesroots.live.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NavHeaderMainBindingImpl extends NavHeaderMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.switch1, 2);
        sViewsWithIds.put(R.id.view, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public NavHeaderMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private NavHeaderMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.SwitchCompat) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.view.View) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.userName.setTag(null);
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
        else if (BR.pref == variableId) {
            setPref((com.codesroots.live.helper.PreferenceHelper) variable);
        }
        else if (BR.data == variableId) {
            setData((com.codesroots.live.models.delivery.DeliveryItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setContext(@Nullable com.codesroots.live.presentation.map_activity.MapActivity Context) {
        this.mContext = Context;
    }
    public void setPref(@Nullable com.codesroots.live.helper.PreferenceHelper Pref) {
        this.mPref = Pref;
    }
    public void setData(@Nullable com.codesroots.live.models.delivery.DeliveryItem Data) {
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
        java.lang.String dataName = null;
        com.codesroots.live.models.delivery.DeliveryItem data = mData;

        if ((dirtyFlags & 0xcL) != 0) {



                if (data != null) {
                    // read data.name
                    dataName = data.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userName, dataName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): Context
        flag 1 (0x2L): pref
        flag 2 (0x3L): data
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}