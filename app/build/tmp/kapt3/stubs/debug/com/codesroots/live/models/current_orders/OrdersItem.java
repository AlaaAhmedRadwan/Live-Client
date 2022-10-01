package com.codesroots.live.models.current_orders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0003\b\u0080\u0001\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010.J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0012\u0010\u0093\u0001\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u00c6\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\u0011\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\"H\u00c6\u0003J\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0011\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0011\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0011\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010CJ\u0011\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0011\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010*H\u00c6\u0003J\u0011\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\f\u0010\u00a0\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u0011\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\f\u0010\u00a2\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0011\u0010\u00a4\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010CJ\f\u0010\u00a5\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\f\u0010\u00a6\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0011\u0010\u00a7\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u00a2\u0003\u0010\u00a8\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00a9\u0001J\u0016\u0010\u00aa\u0001\u001a\u00030\u00ab\u00012\t\u0010\u00ac\u0001\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0005H\u00d6\u0001J\n\u0010\u00ae\u0001\u001a\u00020\nH\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010F\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001c\u0010\r\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010?\"\u0004\bH\u0010AR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010?\"\u0004\bJ\u0010AR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\bK\u00104\"\u0004\bL\u00106R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\bM\u00104\"\u0004\bN\u00106R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\bO\u00104\"\u0004\bP\u00106R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\bQ\u00104\"\u0004\bR\u00106R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\bW\u00104\"\u0004\bX\u00106R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010?\"\u0004\bZ\u0010AR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010?\"\u0004\b\\\u0010AR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b]\u00104\"\u0004\b^\u00106R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b_\u00104\"\u0004\b`\u00106R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010T\"\u0004\bb\u0010VR\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001e\u0010 \u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\bk\u00104\"\u0004\bl\u00106R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001e\u0010#\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\bq\u00104\"\u0004\br\u00106R\u001e\u0010$\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\bs\u00104\"\u0004\bt\u00106R\u001e\u0010%\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\bu\u00104\"\u0004\bv\u00106R\u001e\u0010&\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\bw\u00104\"\u0004\bx\u00106R\u001e\u0010\'\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010F\u001a\u0004\by\u0010C\"\u0004\bz\u0010ER\u001e\u0010(\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b{\u00104\"\u0004\b|\u00106R\u001d\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R \u0010+\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u00107\u001a\u0005\b\u0081\u0001\u00104\"\u0005\b\u0082\u0001\u00106R\u001e\u0010,\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010T\"\u0005\b\u0084\u0001\u0010VR \u0010-\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u00107\u001a\u0005\b\u0085\u0001\u00104\"\u0005\b\u0086\u0001\u00106\u00a8\u0006\u00af\u0001"}, d2 = {"Lcom/codesroots/live/models/current_orders/OrdersItem;", "Ljava/io/Serializable;", "billing_address", "Lcom/codesroots/live/models/current_orders/BillingAddress;", "billing_address_id", "", "branch_id", "branches", "Lcom/codesroots/live/models/current_orders/Branches;", "canceled_reason", "", "commission", "", "created", "delivery_comment", "delivery_id", "delivery_serivce", "delivery_time", "discount", "drivers", "", "id", "modified", "notes", "offer_discount", "offer_id", "offers", "order_details", "", "Lcom/codesroots/live/models/current_orders/OrderDetail;", "order_status", "Lcom/codesroots/live/models/current_orders/OrderStatus;", "order_status_id", "paymenttype", "Lcom/codesroots/live/models/current_orders/PaymenttypeX;", "paymenttype_id", "takeway", "taxes", "test_orders", "total", "user_id", "users", "Lcom/codesroots/live/models/Users;", "wallet_discount", "wallets", "wallets_id", "(Lcom/codesroots/live/models/current_orders/BillingAddress;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/codesroots/live/models/current_orders/Branches;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/util/List;Lcom/codesroots/live/models/current_orders/OrderStatus;Ljava/lang/Integer;Lcom/codesroots/live/models/current_orders/PaymenttypeX;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Lcom/codesroots/live/models/Users;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;)V", "getBilling_address", "()Lcom/codesroots/live/models/current_orders/BillingAddress;", "setBilling_address", "(Lcom/codesroots/live/models/current_orders/BillingAddress;)V", "getBilling_address_id", "()Ljava/lang/Integer;", "setBilling_address_id", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBranch_id", "setBranch_id", "getBranches", "()Lcom/codesroots/live/models/current_orders/Branches;", "setBranches", "(Lcom/codesroots/live/models/current_orders/Branches;)V", "getCanceled_reason", "()Ljava/lang/String;", "setCanceled_reason", "(Ljava/lang/String;)V", "getCommission", "()Ljava/lang/Double;", "setCommission", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getCreated", "setCreated", "getDelivery_comment", "setDelivery_comment", "getDelivery_id", "setDelivery_id", "getDelivery_serivce", "setDelivery_serivce", "getDelivery_time", "setDelivery_time", "getDiscount", "setDiscount", "getDrivers", "()Ljava/lang/Object;", "setDrivers", "(Ljava/lang/Object;)V", "getId", "setId", "getModified", "setModified", "getNotes", "setNotes", "getOffer_discount", "setOffer_discount", "getOffer_id", "setOffer_id", "getOffers", "setOffers", "getOrder_details", "()Ljava/util/List;", "setOrder_details", "(Ljava/util/List;)V", "getOrder_status", "()Lcom/codesroots/live/models/current_orders/OrderStatus;", "setOrder_status", "(Lcom/codesroots/live/models/current_orders/OrderStatus;)V", "getOrder_status_id", "setOrder_status_id", "getPaymenttype", "()Lcom/codesroots/live/models/current_orders/PaymenttypeX;", "setPaymenttype", "(Lcom/codesroots/live/models/current_orders/PaymenttypeX;)V", "getPaymenttype_id", "setPaymenttype_id", "getTakeway", "setTakeway", "getTaxes", "setTaxes", "getTest_orders", "setTest_orders", "getTotal", "setTotal", "getUser_id", "setUser_id", "getUsers", "()Lcom/codesroots/live/models/Users;", "setUsers", "(Lcom/codesroots/live/models/Users;)V", "getWallet_discount", "setWallet_discount", "getWallets", "setWallets", "getWallets_id", "setWallets_id", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/codesroots/live/models/current_orders/BillingAddress;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/codesroots/live/models/current_orders/Branches;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/util/List;Lcom/codesroots/live/models/current_orders/OrderStatus;Ljava/lang/Integer;Lcom/codesroots/live/models/current_orders/PaymenttypeX;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Lcom/codesroots/live/models/Users;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;)Lcom/codesroots/live/models/current_orders/OrdersItem;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class OrdersItem implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    private com.codesroots.live.models.current_orders.BillingAddress billing_address;
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
    private java.lang.Object drivers;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String modified;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String notes;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer offer_discount;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer offer_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object offers;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.codesroots.live.models.current_orders.OrderDetail> order_details;
    @org.jetbrains.annotations.Nullable()
    private com.codesroots.live.models.current_orders.OrderStatus order_status;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer order_status_id;
    @org.jetbrains.annotations.Nullable()
    private com.codesroots.live.models.current_orders.PaymenttypeX paymenttype;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer paymenttype_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer takeway;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer taxes;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer test_orders;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double total;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer user_id;
    @org.jetbrains.annotations.Nullable()
    private com.codesroots.live.models.Users users;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer wallet_discount;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object wallets;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer wallets_id;
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.models.current_orders.OrdersItem copy(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.current_orders.BillingAddress billing_address, @org.jetbrains.annotations.Nullable()
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
    java.lang.Object drivers, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String modified, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer offer_discount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer offer_id, @org.jetbrains.annotations.Nullable()
    java.lang.Object offers, @org.jetbrains.annotations.Nullable()
    java.util.List<com.codesroots.live.models.current_orders.OrderDetail> order_details, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.current_orders.OrderStatus order_status, @org.jetbrains.annotations.Nullable()
    java.lang.Integer order_status_id, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.current_orders.PaymenttypeX paymenttype, @org.jetbrains.annotations.Nullable()
    java.lang.Integer paymenttype_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer takeway, @org.jetbrains.annotations.Nullable()
    java.lang.Integer taxes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer test_orders, @org.jetbrains.annotations.Nullable()
    java.lang.Double total, @org.jetbrains.annotations.Nullable()
    java.lang.Integer user_id, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.Users users, @org.jetbrains.annotations.Nullable()
    java.lang.Integer wallet_discount, @org.jetbrains.annotations.Nullable()
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
    
    public OrdersItem() {
        super();
    }
    
    public OrdersItem(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.current_orders.BillingAddress billing_address, @org.jetbrains.annotations.Nullable()
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
    java.lang.Object drivers, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String modified, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer offer_discount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer offer_id, @org.jetbrains.annotations.Nullable()
    java.lang.Object offers, @org.jetbrains.annotations.Nullable()
    java.util.List<com.codesroots.live.models.current_orders.OrderDetail> order_details, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.current_orders.OrderStatus order_status, @org.jetbrains.annotations.Nullable()
    java.lang.Integer order_status_id, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.current_orders.PaymenttypeX paymenttype, @org.jetbrains.annotations.Nullable()
    java.lang.Integer paymenttype_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer takeway, @org.jetbrains.annotations.Nullable()
    java.lang.Integer taxes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer test_orders, @org.jetbrains.annotations.Nullable()
    java.lang.Double total, @org.jetbrains.annotations.Nullable()
    java.lang.Integer user_id, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.Users users, @org.jetbrains.annotations.Nullable()
    java.lang.Integer wallet_discount, @org.jetbrains.annotations.Nullable()
    java.lang.Object wallets, @org.jetbrains.annotations.Nullable()
    java.lang.Integer wallets_id) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.current_orders.BillingAddress component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.current_orders.BillingAddress getBilling_address() {
        return null;
    }
    
    public final void setBilling_address(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.current_orders.BillingAddress p0) {
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
    public final java.lang.Object component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDrivers() {
        return null;
    }
    
    public final void setDrivers(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
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
    public final java.lang.Integer getOffer_discount() {
        return null;
    }
    
    public final void setOffer_discount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component18() {
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
    public final java.lang.Object component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOffers() {
        return null;
    }
    
    public final void setOffers(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.codesroots.live.models.current_orders.OrderDetail> component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.codesroots.live.models.current_orders.OrderDetail> getOrder_details() {
        return null;
    }
    
    public final void setOrder_details(@org.jetbrains.annotations.Nullable()
    java.util.List<com.codesroots.live.models.current_orders.OrderDetail> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.current_orders.OrderStatus component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.current_orders.OrderStatus getOrder_status() {
        return null;
    }
    
    public final void setOrder_status(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.current_orders.OrderStatus p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component22() {
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
    public final com.codesroots.live.models.current_orders.PaymenttypeX component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.current_orders.PaymenttypeX getPaymenttype() {
        return null;
    }
    
    public final void setPaymenttype(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.current_orders.PaymenttypeX p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component24() {
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
    public final java.lang.Integer component25() {
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
    public final java.lang.Integer component26() {
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
    public final java.lang.Integer component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTest_orders() {
        return null;
    }
    
    public final void setTest_orders(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTotal() {
        return null;
    }
    
    public final void setTotal(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component29() {
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
    public final com.codesroots.live.models.Users component30() {
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
    public final java.lang.Integer component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWallet_discount() {
        return null;
    }
    
    public final void setWallet_discount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component32() {
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
    public final java.lang.Integer component33() {
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