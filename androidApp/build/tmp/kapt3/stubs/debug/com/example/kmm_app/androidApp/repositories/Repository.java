package com.example.kmm_app.androidApp.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000b2\u0006\u0010\u0007\u001a\u00020\bJ\u0019\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/kmm_app/androidApp/repositories/Repository;", "", "db", "Lcom/example/kmm_app/androidApp/db/OrdersDatabase;", "(Lcom/example/kmm_app/androidApp/db/OrdersDatabase;)V", "delete", "", "order", "Lcom/example/kmm_app/androidApp/models/Order;", "(Lcom/example/kmm_app/androidApp/models/Order;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllOrdersList", "Landroidx/lifecycle/LiveData;", "", "upsert", "androidApp_debug"})
public final class Repository {
    private final com.example.kmm_app.androidApp.db.OrdersDatabase db = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object upsert(@org.jetbrains.annotations.NotNull()
    com.example.kmm_app.androidApp.models.Order order, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.example.kmm_app.androidApp.models.Order order, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.kmm_app.androidApp.models.Order>> getAllOrdersList(@org.jetbrains.annotations.NotNull()
    com.example.kmm_app.androidApp.models.Order order) {
        return null;
    }
    
    public Repository(@org.jetbrains.annotations.NotNull()
    com.example.kmm_app.androidApp.db.OrdersDatabase db) {
        super();
    }
}