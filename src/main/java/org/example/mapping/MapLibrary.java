package org.example.mapping;

import java.util.HashMap;

public class MapLibrary {
    private HashMap<Class<?>, EntityMap> entityMaps;
    private HashMap<Class<?>, String> typeMaps;

    public MapLibrary() {
        entityMaps = new HashMap<>();
        typeMaps = new HashMap<>();
    }

    public void addEntityMap(EntityMap map){
        entityMaps.put(map.getType(), map);
    }

    public void addTypeMap(Class<?> type, String SQLType){
        typeMaps.put(type, SQLType);
    }

    public EntityMap getEntityMap(Class<?> type){
        return entityMaps.get(type);
    }

    public String getSqlType(Class<?> type){
        return typeMaps.get(type);
    }
}
