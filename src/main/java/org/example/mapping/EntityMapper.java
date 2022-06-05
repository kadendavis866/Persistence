package org.example.mapping;

public class EntityMapper {
    public static EntityMap createMap(Class<?> clazz){
        EntityMap eMap = new EntityMap(clazz);

        return eMap;
    }
}
