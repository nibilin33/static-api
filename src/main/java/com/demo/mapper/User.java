package com.demo.mapper;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by yl1346 on 2016/12/23.
 */
@Document(collection="User")
public class User {
    @Id
    private ObjectId userid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public ObjectId getUserid() {
        return userid;
    }

    public void setUserid(ObjectId userid) {
        this.userid = userid;
    }
}
