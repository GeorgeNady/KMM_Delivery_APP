package com.example.kmm_app.androidApp.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.kmm_app.androidApp.models.Order;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class OrdersDao_Impl implements OrdersDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Order> __insertionAdapterOfOrder;

  private final EntityDeletionOrUpdateAdapter<Order> __deletionAdapterOfOrder;

  public OrdersDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOrder = new EntityInsertionAdapter<Order>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `order_info` (`id`,`name`,`description`,`owner`,`orderPrice`,`deliveryCharge`,`fromLocation`,`toLocation`,`date`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Order value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getOwner() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getOwner());
        }
        stmt.bindLong(5, value.getOrderPrice());
        stmt.bindLong(6, value.getDeliveryCharge());
        if (value.getFromLocation() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getFromLocation());
        }
        if (value.getToLocation() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getToLocation());
        }
        if (value.getDate() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getDate());
        }
      }
    };
    this.__deletionAdapterOfOrder = new EntityDeletionOrUpdateAdapter<Order>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `order_info` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Order value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object upsert(final Order order, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfOrder.insert(order);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final Order order, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfOrder.handle(order);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<Order>> getAllOrdersList() {
    final String _sql = "SELECT * FROM order_info";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"order_info"}, false, new Callable<List<Order>>() {
      @Override
      public List<Order> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfOwner = CursorUtil.getColumnIndexOrThrow(_cursor, "owner");
          final int _cursorIndexOfOrderPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "orderPrice");
          final int _cursorIndexOfDeliveryCharge = CursorUtil.getColumnIndexOrThrow(_cursor, "deliveryCharge");
          final int _cursorIndexOfFromLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "fromLocation");
          final int _cursorIndexOfToLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "toLocation");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final List<Order> _result = new ArrayList<Order>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Order _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpOwner;
            _tmpOwner = _cursor.getString(_cursorIndexOfOwner);
            final int _tmpOrderPrice;
            _tmpOrderPrice = _cursor.getInt(_cursorIndexOfOrderPrice);
            final int _tmpDeliveryCharge;
            _tmpDeliveryCharge = _cursor.getInt(_cursorIndexOfDeliveryCharge);
            final String _tmpFromLocation;
            _tmpFromLocation = _cursor.getString(_cursorIndexOfFromLocation);
            final String _tmpToLocation;
            _tmpToLocation = _cursor.getString(_cursorIndexOfToLocation);
            final String _tmpDate;
            _tmpDate = _cursor.getString(_cursorIndexOfDate);
            _item = new Order(_tmpId,_tmpName,_tmpDescription,_tmpOwner,_tmpOrderPrice,_tmpDeliveryCharge,_tmpFromLocation,_tmpToLocation,_tmpDate);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
