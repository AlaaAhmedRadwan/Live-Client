package com.codesroots.live;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.codesroots.live.databinding.BottomDialogBindingImpl;
import com.codesroots.live.databinding.CancelDialogBindingImpl;
import com.codesroots.live.databinding.CurrentItemBindingImpl;
import com.codesroots.live.databinding.CurrentOrderFragmentBindingImpl;
import com.codesroots.live.databinding.CurrentOrderItemBindingImpl;
import com.codesroots.live.databinding.CurrentOrdersAdapterBindingImpl;
import com.codesroots.live.databinding.DailyOrdersAdapterBindingImpl;
import com.codesroots.live.databinding.DailyOrdersFragmentBindingImpl;
import com.codesroots.live.databinding.DeliveriesFragmentBindingImpl;
import com.codesroots.live.databinding.DeliveryItemBindingImpl;
import com.codesroots.live.databinding.DeliveryLoginFragmentBindingImpl;
import com.codesroots.live.databinding.DetailsOrderAdapterBindingImpl;
import com.codesroots.live.databinding.DetailsOrderFragmentBindingImpl;
import com.codesroots.live.databinding.HistoryOrderAdapterBindingImpl;
import com.codesroots.live.databinding.HistoryOrdersFragmentBindingImpl;
import com.codesroots.live.databinding.LayoutDialogOrderTimeBindingImpl;
import com.codesroots.live.databinding.MapActivityBindingImpl;
import com.codesroots.live.databinding.NavHeaderMainBindingImpl;
import com.codesroots.live.databinding.NeworderFragmentBindingImpl;
import com.codesroots.live.databinding.ProfileFragmentBindingImpl;
import com.codesroots.live.databinding.RowItemOrderTimeBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_BOTTOMDIALOG = 1;

  private static final int LAYOUT_CANCELDIALOG = 2;

  private static final int LAYOUT_CURRENTITEM = 3;

  private static final int LAYOUT_CURRENTORDERFRAGMENT = 4;

  private static final int LAYOUT_CURRENTORDERITEM = 5;

  private static final int LAYOUT_CURRENTORDERSADAPTER = 6;

  private static final int LAYOUT_DAILYORDERSADAPTER = 7;

  private static final int LAYOUT_DAILYORDERSFRAGMENT = 8;

  private static final int LAYOUT_DELIVERIESFRAGMENT = 9;

  private static final int LAYOUT_DELIVERYITEM = 10;

  private static final int LAYOUT_DELIVERYLOGINFRAGMENT = 11;

  private static final int LAYOUT_DETAILSORDERADAPTER = 12;

  private static final int LAYOUT_DETAILSORDERFRAGMENT = 13;

  private static final int LAYOUT_HISTORYORDERADAPTER = 14;

  private static final int LAYOUT_HISTORYORDERSFRAGMENT = 15;

  private static final int LAYOUT_LAYOUTDIALOGORDERTIME = 16;

  private static final int LAYOUT_MAPACTIVITY = 17;

  private static final int LAYOUT_NAVHEADERMAIN = 18;

  private static final int LAYOUT_NEWORDERFRAGMENT = 19;

  private static final int LAYOUT_PROFILEFRAGMENT = 20;

  private static final int LAYOUT_ROWITEMORDERTIME = 21;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(21);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.bottom_dialog, LAYOUT_BOTTOMDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.cancel_dialog, LAYOUT_CANCELDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.current_item, LAYOUT_CURRENTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.current_order_fragment, LAYOUT_CURRENTORDERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.current_order_item, LAYOUT_CURRENTORDERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.current_orders_adapter, LAYOUT_CURRENTORDERSADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.daily_orders_adapter, LAYOUT_DAILYORDERSADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.daily_orders_fragment, LAYOUT_DAILYORDERSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.deliveries_fragment, LAYOUT_DELIVERIESFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.delivery_item, LAYOUT_DELIVERYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.delivery_login_fragment, LAYOUT_DELIVERYLOGINFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.details_order_adapter, LAYOUT_DETAILSORDERADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.details_order_fragment, LAYOUT_DETAILSORDERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.history_order_adapter, LAYOUT_HISTORYORDERADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.history_orders_fragment, LAYOUT_HISTORYORDERSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.layout_dialog_order_time, LAYOUT_LAYOUTDIALOGORDERTIME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.map_activity, LAYOUT_MAPACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.nav_header_main, LAYOUT_NAVHEADERMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.neworder_fragment, LAYOUT_NEWORDERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.profile_fragment, LAYOUT_PROFILEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codesroots.live.R.layout.row_item_order_time, LAYOUT_ROWITEMORDERTIME);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_BOTTOMDIALOG: {
          if ("layout/bottom_dialog_0".equals(tag)) {
            return new BottomDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for bottom_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_CANCELDIALOG: {
          if ("layout/cancel_dialog_0".equals(tag)) {
            return new CancelDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for cancel_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_CURRENTITEM: {
          if ("layout/current_item_0".equals(tag)) {
            return new CurrentItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for current_item is invalid. Received: " + tag);
        }
        case  LAYOUT_CURRENTORDERFRAGMENT: {
          if ("layout/current_order_fragment_0".equals(tag)) {
            return new CurrentOrderFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for current_order_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_CURRENTORDERITEM: {
          if ("layout/current_order_item_0".equals(tag)) {
            return new CurrentOrderItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for current_order_item is invalid. Received: " + tag);
        }
        case  LAYOUT_CURRENTORDERSADAPTER: {
          if ("layout/current_orders_adapter_0".equals(tag)) {
            return new CurrentOrdersAdapterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for current_orders_adapter is invalid. Received: " + tag);
        }
        case  LAYOUT_DAILYORDERSADAPTER: {
          if ("layout/daily_orders_adapter_0".equals(tag)) {
            return new DailyOrdersAdapterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for daily_orders_adapter is invalid. Received: " + tag);
        }
        case  LAYOUT_DAILYORDERSFRAGMENT: {
          if ("layout/daily_orders_fragment_0".equals(tag)) {
            return new DailyOrdersFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for daily_orders_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_DELIVERIESFRAGMENT: {
          if ("layout/deliveries_fragment_0".equals(tag)) {
            return new DeliveriesFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for deliveries_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_DELIVERYITEM: {
          if ("layout/delivery_item_0".equals(tag)) {
            return new DeliveryItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delivery_item is invalid. Received: " + tag);
        }
        case  LAYOUT_DELIVERYLOGINFRAGMENT: {
          if ("layout/delivery_login_fragment_0".equals(tag)) {
            return new DeliveryLoginFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delivery_login_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_DETAILSORDERADAPTER: {
          if ("layout/details_order_adapter_0".equals(tag)) {
            return new DetailsOrderAdapterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for details_order_adapter is invalid. Received: " + tag);
        }
        case  LAYOUT_DETAILSORDERFRAGMENT: {
          if ("layout/details_order_fragment_0".equals(tag)) {
            return new DetailsOrderFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for details_order_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_HISTORYORDERADAPTER: {
          if ("layout/history_order_adapter_0".equals(tag)) {
            return new HistoryOrderAdapterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for history_order_adapter is invalid. Received: " + tag);
        }
        case  LAYOUT_HISTORYORDERSFRAGMENT: {
          if ("layout/history_orders_fragment_0".equals(tag)) {
            return new HistoryOrdersFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for history_orders_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTDIALOGORDERTIME: {
          if ("layout/layout_dialog_order_time_0".equals(tag)) {
            return new LayoutDialogOrderTimeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_dialog_order_time is invalid. Received: " + tag);
        }
        case  LAYOUT_MAPACTIVITY: {
          if ("layout/map_activity_0".equals(tag)) {
            return new MapActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for map_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_NAVHEADERMAIN: {
          if ("layout/nav_header_main_0".equals(tag)) {
            return new NavHeaderMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for nav_header_main is invalid. Received: " + tag);
        }
        case  LAYOUT_NEWORDERFRAGMENT: {
          if ("layout/neworder_fragment_0".equals(tag)) {
            return new NeworderFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for neworder_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_PROFILEFRAGMENT: {
          if ("layout/profile_fragment_0".equals(tag)) {
            return new ProfileFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for profile_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWITEMORDERTIME: {
          if ("layout/row_item_order_time_0".equals(tag)) {
            return new RowItemOrderTimeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_item_order_time is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(8);

    static {
      sKeys.put(1, "Context");
      sKeys.put(0, "_all");
      sKeys.put(2, "data");
      sKeys.put(3, "fragment");
      sKeys.put(4, "listener");
      sKeys.put(5, "mainFragment");
      sKeys.put(6, "pref");
      sKeys.put(7, "status");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(21);

    static {
      sKeys.put("layout/bottom_dialog_0", com.codesroots.live.R.layout.bottom_dialog);
      sKeys.put("layout/cancel_dialog_0", com.codesroots.live.R.layout.cancel_dialog);
      sKeys.put("layout/current_item_0", com.codesroots.live.R.layout.current_item);
      sKeys.put("layout/current_order_fragment_0", com.codesroots.live.R.layout.current_order_fragment);
      sKeys.put("layout/current_order_item_0", com.codesroots.live.R.layout.current_order_item);
      sKeys.put("layout/current_orders_adapter_0", com.codesroots.live.R.layout.current_orders_adapter);
      sKeys.put("layout/daily_orders_adapter_0", com.codesroots.live.R.layout.daily_orders_adapter);
      sKeys.put("layout/daily_orders_fragment_0", com.codesroots.live.R.layout.daily_orders_fragment);
      sKeys.put("layout/deliveries_fragment_0", com.codesroots.live.R.layout.deliveries_fragment);
      sKeys.put("layout/delivery_item_0", com.codesroots.live.R.layout.delivery_item);
      sKeys.put("layout/delivery_login_fragment_0", com.codesroots.live.R.layout.delivery_login_fragment);
      sKeys.put("layout/details_order_adapter_0", com.codesroots.live.R.layout.details_order_adapter);
      sKeys.put("layout/details_order_fragment_0", com.codesroots.live.R.layout.details_order_fragment);
      sKeys.put("layout/history_order_adapter_0", com.codesroots.live.R.layout.history_order_adapter);
      sKeys.put("layout/history_orders_fragment_0", com.codesroots.live.R.layout.history_orders_fragment);
      sKeys.put("layout/layout_dialog_order_time_0", com.codesroots.live.R.layout.layout_dialog_order_time);
      sKeys.put("layout/map_activity_0", com.codesroots.live.R.layout.map_activity);
      sKeys.put("layout/nav_header_main_0", com.codesroots.live.R.layout.nav_header_main);
      sKeys.put("layout/neworder_fragment_0", com.codesroots.live.R.layout.neworder_fragment);
      sKeys.put("layout/profile_fragment_0", com.codesroots.live.R.layout.profile_fragment);
      sKeys.put("layout/row_item_order_time_0", com.codesroots.live.R.layout.row_item_order_time);
    }
  }
}
