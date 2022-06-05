package org.example.mapping;

import java.lang.reflect.Method;

public class FieldMap {
    private String sqlType;
    private boolean key;
    private Method getter;
    private Method setter;

    public FieldMap(String sqlType, boolean key, Method getter, Method setter) {
        this.sqlType = sqlType;
        this.key = key;
        this.getter = getter;
        this.setter = setter;
    }

    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

    public Method getter() {
        return getter;
    }

    public void setGetter(Method getter) {
        this.getter = getter;
    }

    public Method setter() {
        return setter;
    }

    public void setSetter(Method setter) {
        this.setter = setter;
    }
}
