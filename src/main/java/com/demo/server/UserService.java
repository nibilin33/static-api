package com.demo.server;

import com.demo.mapper.User;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yl1346 on 2016/12/23.
 */
@Repository
public class UserService {
    @Autowired
    private MongoTemplate momgo;
    public List<User> query(){
        return momgo.findAll(User.class);
    }

    public void delete(ObjectId id){
        Query query = new Query(new Criteria("_id").is(id));
        User one=momgo.findOne(query,User.class);
        momgo.remove(one);
    }
    public void insert(User use){
        momgo.save(use);
    }
}
