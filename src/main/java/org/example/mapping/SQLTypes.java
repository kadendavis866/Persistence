package org.example.mapping;

public enum SQLTypes {
    INTEGER ("integer"),
    STRING ("text"),
    FLOAT ("real"),
    BOOLEAN ("numeric");

    public final String SQL;
    SQLTypes(String sql){
        SQL = sql;
    }
}
