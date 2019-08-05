/**
 * 
 */
package com.ssm.pojo;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;


/**
 * @author 作者
 * @data 2019年7月31日 
 */
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private ObjectId id;
	
	private String user_id;
	private String name;
	private Integer age;
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", user_id=" + user_id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
