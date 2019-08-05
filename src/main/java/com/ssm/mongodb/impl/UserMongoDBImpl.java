/**
 * 
 */
package com.ssm.mongodb.impl;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.ssm.mongodb.UserMongoDB;
import com.ssm.pojo.User;

/**
 * @author 作者
 * @data 2019年8月4日 
 */
@Component
public class UserMongoDBImpl implements UserMongoDB{
	 	@Autowired
	    private MongoTemplate mongoTemplate;

	    @Override
	    public void insert(List<User> list) {	    	
	    	for (int j = 0; j < list.size(); j++) {
	    		mongoTemplate.save(list.get(j));
			}	    							   
	    }

	    @Override
	    public void deleteByPrimaryKey(ObjectId id) {
	        Query query=new Query(Criteria.where("id").is(id));
	        mongoTemplate.remove(query,User.class);
	    }

	    @Override
	    public void updateByPrimaryKeySelective(User user) {
	        Query query=new Query(Criteria.where("id").is(user.getId()));
	        Update update= new Update().set("name", user.getName());
	        //更新查询返回结果集的第一条
	        mongoTemplate.updateFirst(query,update,User.class);
	        //更新查询返回结果集的所有
	        // mongoTemplate.updateMulti(query,update,User.class);
	    }

	    @Override
	    public void updateByPrimaryKey(User record) {
	    }

	    @Override
	    public List<User> selectUsers() {
	     //   Query query=new Query(Criteria.where("fullname").is("张三"));
	        //查询单个
//	        User user =  mongoTemplate.findOne(query , User.class);
	        List<User> users =  mongoTemplate.findAll(User.class,"user");
	        return users;
	    }
}
