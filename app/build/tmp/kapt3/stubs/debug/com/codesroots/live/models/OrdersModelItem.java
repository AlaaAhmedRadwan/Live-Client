package com.codesroots.live.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bz\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00f3\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010,J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00102J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00102J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00102J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003J\u0012\u0010\u008d\u0001\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u00c6\u0003J\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00102J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00102J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\"H\u00c6\u0003J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0011\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0011\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0011\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0011\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00102J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010)H\u00c6\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0011\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0011\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00102J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0011\u0010\u009d\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0011\u0010\u00a0\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u00fe\u0002\u0010\u00a1\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00a2\u0001J\u0016\u0010\u00a3\u0001\u001a\u00030\u00a4\u00012\t\u0010\u00a5\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00a6\u0001\u001a\u00020\u0005H\u00d6\u0001J\n\u0010\u00a7\u0001\u001a\u00020\nH\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\b6\u00102\"\u0004\b7\u00104R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010D\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010\r\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010=\"\u0004\bF\u0010?R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010=\"\u0004\bH\u0010?R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\bI\u00102\"\u0004\bJ\u00104R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\bK\u00102\"\u0004\bL\u00104R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\bM\u00102\"\u0004\bN\u00104R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\bO\u00102\"\u0004\bP\u00104R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\bU\u00102\"\u0004\bV\u00104R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010=\"\u0004\bX\u0010?R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010=\"\u0004\bZ\u0010?R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\b[\u00102\"\u0004\b\\\u00104R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001e\u0010 \u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\bi\u00102\"\u0004\bj\u00104R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001e\u0010#\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\bo\u00102\"\u0004\bp\u00104R\u001e\u0010$\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\bq\u00102\"\u0004\br\u00104R\u001e\u0010%\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\bs\u00102\"\u0004\bt\u00104R\u001e\u0010&\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\bu\u00102\"\u0004\bv\u00104R\u001e\u0010\'\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\bw\u00102\"\u0004\bx\u00104R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u001d\u0010*\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R \u0010+\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u00105\u001a\u0005\b\u0081\u0001\u00102\"\u0005\b\u0082\u0001\u00104\u00a8\u0006\u00a8\u0001"}, d2 = {"Lcom/codesroots/live/models/OrdersModelItem;", "", "billing_address", "Lcom/codesroots/live/models/BillingAddress;", "billing_address_id", "", "branch_id", "branches", "Lcom/codesroots/live/models/current_orders/Branches;", "canceled_reason", "", "commission", "", "created", "delivery_comment", "delivery_id", "delivery_serivce", "delivery_time", "discount", "drivers", "Lcom/codesroots/live/models/Drivers;", "id", "modified", "notes", "offer_id", "offers", "Lcom/codesroots/live/models/Offers;", "order_details", "", "Lcom/codesroots/live/models/OrderDetail;", "order_status", "Lcom/codesroots/live/models/OrderStatus;", "order_status_id", "paymenttype", "Lcom/codesroots/live/models/Paymenttype;", "paymenttype_id", "takeway", "taxes", "total", "user_id", "users", "Lcom/codesroots/live/models/Users;", "wallets", "wallets_id", "(Lcom/codesroots/live/models/BillingAddress;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/codesroots/live/models/current_orders/Branches;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/codesroots/live/models/Drivers;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/codesroots/live/models/Offers;Ljava/util/List;Lcom/codesroots/live/models/OrderStatus;Ljava/lang/Integer;Lcom/codesroots/live/models/Paymenttype;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/codesroots/live/models/Users;Ljava/lang/Object;Ljava/lang/Integer;)V", "getBilling_address", "()Lcom/codesroots/live/models/BillingAddress;", "setBilling_address", "(Lcom/codesroots/live/models/BillingAddress;)V", "getBilling_address_id", "()Ljava/lang/Integer;", "setBilling_address_id", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBranch_id", "setBranch_id", "getBranches", "()Lcom/codesroots/live/models/current_orders/Branches;", "setBranches", "(Lcom/codesroots/live/models/current_orders/Branches;)V", "getCanceled_reason", "()Ljava/lang/String;", "setCanceled_reason", "(Ljava/lang/String;)V", "getCommission", "()Ljava/lang/Double;", "setCommission", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getCreated", "setCreated", "getDelivery_comment", "setDelivery_comment", "getDelivery_id", "setDelivery_id", "getDelivery_serivce", "setDelivery_serivce", "getDelivery_time", "setDelivery_time", "getDiscount", "setDiscount", "getDrivers", "()Lcom/codesroots/live/models/Drivers;", "setDrivers", "(Lcom/codesroots/live/models/Drivers;)V", "getId", "setId", "getModified", "setModified", "getNotes", "setNotes", "getOffer_id", "setOffer_id", "getOffers", "()Lcom/codesroots/live/models/Offers;", "setOffers", "(Lcom/codesroots/live/models/Offers;)V", "getOrder_details", "()Ljava/util/List;", "setOrder_details", "(Ljava/util/List;)V", "getOrder_status", "()Lcom/codesroots/live/models/OrderStatus;", "setOrder_status", "(Lcom/codesroots/live/models/OrderStatus;)V", "getOrder_status_id", "setOrder_status_id", "getPaymenttype", "()Lcom/codesroots/live/models/Paymenttype;", "setPaymenttype", "(Lcom/codesroots/live/models/Paymenttype;)V", "getPaymenttype_id", "setPaymenttype_id", "getTakeway", "setTakeway", "getTaxes", "setTaxes", "getTotal", "setTotal", "getUser_id", "setUser_id", "getUsers", "()Lcom/codesroots/live/models/Users;", "setUsers", "(Lcom/codesroots/live/models/Users;)V", "getWallets", "()Ljava/lang/Object;", "setWallets", "(Ljava/lang/Object;)V", "getWallets_id", "setWallets_id", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/codesroots/live/models/BillingAddress;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/codesroots/live/models/current_orders/Branches;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/codesroots/live/models/Drivers;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/codesroots/live/models/Offers;Ljava/util/List;Lcom/codesroots/live/models/OrderStatus;Ljava/lang/Integer;Lcom/codesroots/live/models/Paymenttype;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/codesroots/live/models/Users;Ljava/lang/Object;Ljava/lang/Integer;)Lcom/codesroots/live/models/OrdersModelItem;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class OrdersModelItem {
    @org.jetbrains.annotations.Nullable()
    private com.codesroots.live.models.BillingAddress billing_address;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer billing_address_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer branch_id;
    @org.jetbrains.annotations.Nullable()
    private com.codesroots.live.models.current_orders.Branches branches;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String canceled_reason;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double commission;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String created;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String delivery_comment;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer delivery_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer delivery_serivce;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer delivery_time;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer discount;
    @org.jetbrains.annotations.Nullable()
    private com.codesroots.live.models.Drivers drivers;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String modified;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String notes;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer offer_id;
    @org.jetbrains.annotations.Nullable()
    private com.codesroots.live.models.Offers offers;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.codesroots.live.models.OrderDetail> order_details;
    @org.jetbrains.annotations.Nullable()
    private com.codesroots.live.models.OrderStatus order_status;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer order_status_id;
    @org.jetbrains.annotations.Nullable()
    private com.codesroots.live.models.Paymenttype paymenttype;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer paymenttype_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer takeway;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer taxes;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer total;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer user_id;
    @org.jetbrains.annotations.Nullable()
    private com.codesroots.live.models.Users users;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object wallets;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer wallets_id;
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.models.OrdersModelItem copy(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.BillingAddress billing_address, @org.jetbrains.annotations.Nullable()
    java.lang.Integer billing_address_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer branch_id, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.current_orders.Branches branches, @org.jetbrains.annotations.Nullable()
    java.lang.String canceled_reason, @org.jetbrains.annotations.Nullable()
    java.lang.Double commission, @org.jetbrains.annotations.Nullable()
    java.lang.String created, @org.jetbrains.annotations.Nullable()
    java.lang.String delivery_comment, @org.jetbrains.annotations.Nullable()
    java.lang.Integer delivery_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer delivery_serivce, @org.jetbrains.annotations.Nullable()
    java.lang.Integer delivery_time, @org.jetbrains.annotations.Nullable()
    java.lang.Integer discount, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.Drivers drivers, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String modified, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer offer_id, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.Offers offers, @org.jetbrains.annotations.Nullable()
    java.util.List<com.codesroots.live.models.OrderDetail> order_details, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.OrderStatus order_status, @org.jetbrains.annotations.Nullable()
    java.lang.Integer order_status_id, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.Paymenttype paymenttype, @org.jetbrains.annotations.Nullable()
    java.lang.Integer paymenttype_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer takeway, @org.jetbrains.annotations.Nullable()
    java.lang.Integer taxes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer total, @org.jetbrains.annotations.Nullable()
    java.lang.Integer user_id, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.Users users, @org.jetbrains.annotations.Nullable()
    java.lang.Object wallets, @org.jetbrains.annotations.Nullable()
    java.lang.Integer wallets_id) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public OrdersModelItem() {
        super();
    }
    
    public OrdersModelItem(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.BillingAddress billing_address, @org.jetbrains.annotations.Nullable()
    java.lang.Integer billing_address_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer branch_id, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.current_orders.Branches branches, @org.jetbrains.annotations.Nullable()
    java.lang.String canceled_reason, @org.jetbrains.annotations.Nullable()
    java.lang.Double commission, @org.jetbrains.annotations.Nullable()
    java.lang.String created, @org.jetbrains.annotations.Nullable()
    java.lang.String delivery_comment, @org.jetbrains.annotations.Nullable()
    java.lang.Integer delivery_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer delivery_serivce, @org.jetbrains.annotations.Nullable()
    java.lang.Integer delivery_time, @org.jetbrains.annotations.Nullable()
    java.lang.Integer discount, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.Drivers drivers, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String modified, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer offer_id, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.Offers offers, @org.jetbrains.annotations.Nullable()
    java.util.List<com.codesroots.live.models.OrderDetail> order_details, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.OrderStatus order_status, @org.jetbrains.annotations.Nullable()
    java.lang.Integer order_status_id, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.Paymenttype paymenttype, @org.jetbrains.annotations.Nullable()
    java.lang.Integer paymenttype_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer takeway, @org.jetbrains.annotations.Nullable()
    java.lang.Integer taxes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer total, @org.jetbrains.annotations.Nullable()
    java.lang.Integer user_id, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.Users users, @org.jetbrains.annotations.Nullable()
    java.lang.Object wallets, @org.jetbrains.annotations.Nullable()
    java.lang.Integer wallets_id) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.BillingAddress component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.BillingAddress getBilling_address() {
        return null;
    }
    
    public final void setBilling_address(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.BillingAddress p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBilling_address_id() {
        return null;
    }
    
    public final void setBilling_address_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBranch_id() {
        return null;
    }
    
    public final void setBranch_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.current_orders.Branches component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.current_orders.Branches getBranches() {
        return null;
    }
    
    public final void setBranches(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.current_orders.Branches p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCanceled_reason() {
        return null;
    }
    
    public final void setCanceled_reason(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCommission() {
        return null;
    }
    
    public final void setCommission(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreated() {
        return null;
    }
    
    public final void setCreated(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDelivery_comment() {
        return null;
    }
    
    public final void setDelivery_comment(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDelivery_id() {
        return null;
    }
    
    public final void setDelivery_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDelivery_serivce() {
        return null;
    }
    
    public final void setDelivery_serivce(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDelivery_time() {
        return null;
    }
    
    public final void setDelivery_time(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDiscount() {
        return null;
    }
    
    public final void setDiscount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.Drivers component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.Drivers getDrivers() {
        return null;
    }
    
    public final void setDrivers(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.Drivers p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getModified() {
        return null;
    }
    
    public final void setModified(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNotes() {
        return null;
    }
    
    public final void setNotes(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOffer_id() {
        return null;
    }
    
    public final void setOffer_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.Offers component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.Offers getOffers() {
        return null;
    }
    
    public final void setOffers(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.Offers p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.codesroots.live.models.OrderDetail> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.codesroots.live.models.OrderDetail> getOrder_details() {
        return null;
    }
    
    public final void setOrder_details(@org.jetbrains.annotations.Nullable()
    java.util.List<com.codesroots.live.models.OrderDetail> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.OrderStatus component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.OrderStatus getOrder_status() {
        return null;
    }
    
    public final void setOrder_status(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.OrderStatus p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOrder_status_id() {
        return null;
    }
    
    public final void setOrder_status_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.Paymenttype component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.Paymenttype getPaymenttype() {
        return null;
    }
    
    public final void setPaymenttype(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.Paymenttype p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPaymenttype_id() {
        return null;
    }
    
    public final void setPaymenttype_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTakeway() {
        return null;
    }
    
    public final void setTakeway(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTaxes() {
        return null;
    }
    
    public final void setTaxes(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotal() {
        return null;
    }
    
    public final void setTotal(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUser_id() {
        return null;
    }
    
    public final void setUser_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.Users component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.Users getUsers() {
        return null;
    }
    
    public final void setUsers(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.Users p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getWallets() {
        return null;
    }
    
    public final void setWallets(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWallets_id() {
        return null;
    }
    
    public final void setWallets_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
}