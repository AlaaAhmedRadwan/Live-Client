package com.codesroots.live.databinding;
import com.codesroots.live.R;
import com.codesroots.live.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DetailsOrderAdapterBindingImpl extends DetailsOrderAdapterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guidlinehorizental5, 6);
        sViewsWithIds.put(R.id.item_img, 7);
        sViewsWithIds.put(R.id.plus_layout, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DetailsOrderAdapterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private DetailsOrderAdapterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (android.widget.TextView) bindings[2]
            );
        this.itemDescription.setTag(null);
        this.itemName.setTag(null);
        this.itemPrice.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.notes.setTag(null);
        this.quantity.setTag(null);
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
        java.lang.String dataMenuCategoriesItemsPriceJavaLangStringJavaLangString = null;
        java.lang.String dataMenuCategoriesItemsName = null;
        com.codesroots.live.models.current_orders.OrderDetail data = mData;
        java.lang.Integer dataMenuCategoriesItemsPrice = null;
        java.lang.String javaLangStringJavaLangStringJavaLangStringDataAmount = null;
        java.lang.String dataMenuCategoriesItemsPriceJavaLangString = null;
        java.lang.String dataMenuCategoriesItemsDescriptions = null;
        java.lang.String dataNotes = null;
        com.codesroots.live.models.MenuCategoriesItems dataMenuCategoriesItems = null;
        java.lang.Integer dataAmount = null;

        if ((dirtyFlags & 0xcL) != 0) {



                if (data != null) {
                    // read data.notes
                    dataNotes = data.getNotes();
                    // read data.menu_categories_items
                    dataMenuCategoriesItems = data.getMenu_categories_items();
                    // read data.amount
                    dataAmount = data.getAmount();
                }


                if (dataMenuCategoriesItems != null) {
                    // read data.menu_categories_items.name
                    dataMenuCategoriesItemsName = dataMenuCategoriesItems.getName();
                    // read data.menu_categories_items.price
                    dataMenuCategoriesItemsPrice = dataMenuCategoriesItems.getPrice();
                    // read data.menu_categories_items.descriptions
                    dataMenuCategoriesItemsDescriptions = dataMenuCategoriesItems.getDescriptions();
                }
                // read (((" ") + ("الكمية المطلوبة")) + (" ")) + (data.amount)
                javaLangStringJavaLangStringJavaLangStringDataAmount = (((" ") + ("الكمية المطلوبة")) + (" ")) + (dataAmount);


                // read (data.menu_categories_items.price) + (" ")
                dataMenuCategoriesItemsPriceJavaLangString = (dataMenuCategoriesItemsPrice) + (" ");


                // read ((data.menu_categories_items.price) + (" ")) + ("ج.م")
                dataMenuCategoriesItemsPriceJavaLangStringJavaLangString = (dataMenuCategoriesItemsPriceJavaLangString) + ("ج.م");
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemDescription, dataMenuCategoriesItemsDescriptions);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemName, dataMenuCategoriesItemsName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemPrice, dataMenuCategoriesItemsPriceJavaLangStringJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.notes, dataNotes);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.quantity, javaLangStringJavaLangStringJavaLangStringDataAmount);
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