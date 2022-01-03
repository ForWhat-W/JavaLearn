package org.lhq.jdbc.executor;

import org.lhq.jdbc.transaction.Transaction;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public interface Executor {
    void commit(boolean required) throws SQLException;

    void rollback(boolean required) throws SQLException;

    Transaction getTransaction();

    void close(boolean forceRollback);

    boolean isClosed();

    void clearLocalCache();

    <E> List<E> query(String sql, Object param, Class<?> returnType) throws SQLException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException;



}