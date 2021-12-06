package com.springDataBase.JPA.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="FIND_ALL", query="select p from Person p")
public class Person {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String location;
	private String birthday;
	
	public Person() {}
	
	public Person(int id, String name, String location, String birthday) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthday = birthday;
	}

	public Person(String name, String location, String birthday) {
		this.name = name;
		this.location = location;
		this.birthday = birthday;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "\nPerson [id= " + id + ", name= " + name + ", location= " + location + ", birthday= " + birthday + "]";
	}
	

}
