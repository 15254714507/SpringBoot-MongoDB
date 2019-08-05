/**
 * 
 */
package com.ssm.mongodb;

import java.util.List;

import org.bson.types.ObjectId;

import com.ssm.pojo.User;

/**
 * @author 作者
 * @data 2019年8月4日 
 */
public interface UserMongoDB {
	/**
	 * 插入一个集合
	 * */
	   	void insert(List<User> list);
	   	/**
	   	 * 根据Id删除文档
	   	 * */
	    void deleteByPrimaryKey(ObjectId id);
	    /***
	     * 修改指定的的文档
	     * */
	    void updateByPrimaryKeySelective(User user);
	    /**
	     * 修改指定的的文档
	     * */
	    void updateByPrimaryKey(User user);
	    /**
	     * 查询全部的文档，当然也可以指定条件
	     * */
	    List<User> selectUsers();
}
