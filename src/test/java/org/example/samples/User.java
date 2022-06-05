package org.example.samples;

import org.example.annotations.*;

@DBEntity
public class User {
    @DBField(isKey = true)
    private long id;
    @DBField
    private String name;
    @DBField("pass")
    private String password;
    @DBField
    private int age;

    public User() {
        this(null, null, 0);
    }

    public User(String name, String password, int age) {
        id = 0L;
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public User(String name) {
        this(name, "", 0);
    }

    @DBGetter("id")
    public long getId() {
        return id;
    }

    @DBSetter("id")
    public void setId(long id) {
        this.id = id;
    }

    @DBGetter("name")
    public String getName() {
        return name;
    }

    @DBSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @DBGetter("pass")
    public String getPassword() {
        return password;
    }

    @DBSetter("pass")
    public void setPassword(String password) {
        this.password = password;
    }

    @DBGetter("age")
    public int getAge() {
        return age;
    }

    @DBSetter("age")
    public void setAge(int age) {
        this.age = age;
    }
}
