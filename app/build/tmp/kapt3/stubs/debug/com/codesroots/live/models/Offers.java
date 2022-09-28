package com.codesroots.live.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\bD\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0014J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\bH\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\bH\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\bH\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0001H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\bH\u00c6\u0003J\t\u0010G\u001a\u00020\bH\u00c6\u0003J\t\u0010H\u001a\u00020\bH\u00c6\u0003J\t\u0010I\u001a\u00020\bH\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\u00a9\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\bH\u00c6\u0001J\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010O\u001a\u00020\u0003H\u00d6\u0001J\t\u0010P\u001a\u00020\bH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\"\"\u0004\b(\u0010$R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u0018R\u001a\u0010\r\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\"\"\u0004\b.\u0010$R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u0010\u0018R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u0010\u0018R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0016\"\u0004\b8\u0010\u0018R\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\"\"\u0004\b:\u0010$\u00a8\u0006Q"}, d2 = {"Lcom/codesroots/live/models/Offers;", "", "approval", "", "branch_id", "created", "department_id", "department_message", "", "description", "description_en", "end_date", "id", "img", "menu_categories_items_id", "modified", "percentage", "publish", "restaurant_id", "start_date", "(IILjava/lang/Object;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IIILjava/lang/String;)V", "getApproval", "()I", "setApproval", "(I)V", "getBranch_id", "setBranch_id", "getCreated", "()Ljava/lang/Object;", "setCreated", "(Ljava/lang/Object;)V", "getDepartment_id", "setDepartment_id", "getDepartment_message", "()Ljava/lang/String;", "setDepartment_message", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getDescription_en", "setDescription_en", "getEnd_date", "setEnd_date", "getId", "setId", "getImg", "setImg", "getMenu_categories_items_id", "setMenu_categories_items_id", "getModified", "setModified", "getPercentage", "setPercentage", "getPublish", "setPublish", "getRestaurant_id", "setRestaurant_id", "getStart_date", "setStart_date", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Offers {
    private int approval;
    private int branch_id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object created;
    private int department_id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String department_message;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String description_en;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String end_date;
    private int id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String img;
    private int menu_categories_items_id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String modified;
    private int percentage;
    private int publish;
    private int restaurant_id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String start_date;
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.models.Offers copy(int approval, int branch_id, @org.jetbrains.annotations.NotNull()
    java.lang.Object created, int department_id, @org.jetbrains.annotations.NotNull()
    java.lang.String department_message, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String description_en, @org.jetbrains.annotations.NotNull()
    java.lang.String end_date, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String img, int menu_categories_items_id, @org.jetbrains.annotations.NotNull()
    java.lang.String modified, int percentage, int publish, int restaurant_id, @org.jetbrains.annotations.NotNull()
    java.lang.String start_date) {
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
    
    public Offers(int approval, int branch_id, @org.jetbrains.annotations.NotNull()
    java.lang.Object created, int department_id, @org.jetbrains.annotations.NotNull()
    java.lang.String department_message, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String description_en, @org.jetbrains.annotations.NotNull()
    java.lang.String end_date, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String img, int menu_categories_items_id, @org.jetbrains.annotations.NotNull()
    java.lang.String modified, int percentage, int publish, int restaurant_id, @org.jetbrains.annotations.NotNull()
    java.lang.String start_date) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getApproval() {
        return 0;
    }
    
    public final void setApproval(int p0) {
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getBranch_id() {
        return 0;
    }
    
    public final void setBranch_id(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCreated() {
        return null;
    }
    
    public final void setCreated(@org.jetbrains.annotations.NotNull()
    java.lang.Object p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getDepartment_id() {
        return 0;
    }
    
    public final void setDepartment_id(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDepartment_message() {
        return null;
    }
    
    public final void setDepartment_message(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription_en() {
        return null;
    }
    
    public final void setDescription_en(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEnd_date() {
        return null;
    }
    
    public final void setEnd_date(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImg() {
        return null;
    }
    
    public final void setImg(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getMenu_categories_items_id() {
        return 0;
    }
    
    public final void setMenu_categories_items_id(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getModified() {
        return null;
    }
    
    public final void setModified(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getPercentage() {
        return 0;
    }
    
    public final void setPercentage(int p0) {
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int getPublish() {
        return 0;
    }
    
    public final void setPublish(int p0) {
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getRestaurant_id() {
        return 0;
    }
    
    public final void setRestaurant_id(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStart_date() {
        return null;
    }
    
    public final void setStart_date(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}