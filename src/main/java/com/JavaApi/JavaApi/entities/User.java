package com.JavaApi.JavaApi.entities;
import java.util.List;
import javax.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class User {
	@Id
	private long id;
	private String name;
	private String department;
	public User(long id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public User getone(long userId) {
		// TODO Auto-generated method stub
		return null;
	}
	public void save(User user) {
		// TODO Auto-generated method stub
		
	}
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}
	
	

}
