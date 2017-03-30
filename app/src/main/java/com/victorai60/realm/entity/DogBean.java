package com.victorai60.realm.entity;

import io.realm.RealmObject;

/**
 * @author victor
 * @date 2016-04-08 13:16
 */
public class DogBean extends RealmObject {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
