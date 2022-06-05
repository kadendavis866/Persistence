package org.example.mapping;

import java.util.List;

public class EntityMap {
    private final Class<?> clazz;
    private String tableName;
    private List<FieldMap> fieldMaps;

    public EntityMap(Class<?> type) {
        clazz = type;
    }

    public Class<?> getType(){
        return clazz;
    }

    public String getTableName() {
        return tableName;
    }

    public void addFieldMap(FieldMap map){
        fieldMaps.add(map);
    }

    public List<FieldMap> getFieldMaps(){
        return fieldMaps;
    }


}
