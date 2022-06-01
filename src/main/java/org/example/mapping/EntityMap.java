package org.example.mapping;

import java.lang.reflect.Method;
import java.util.List;

public class EntityMap {
    private String tableName;
    private List<String> fields;
    private List<Class<?>> types;
    private List<Method> getters;
    private List<Method> setters;
    private List<Boolean> keys;
}
