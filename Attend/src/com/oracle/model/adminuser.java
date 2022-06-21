package com.oracle.model;

public class adminuser {
	private int id;
	private String name;
	private String sex;
	private String age;
	private String prof;
	private String username;
	private String password;
	private String root;
	
	public adminuser(int id, String name, String sex, String age, String prof, String username, String password,
			String root) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.prof = prof;
		this.username = username;
		this.password = password;
		this.root = root;
	}
	
	public adminuser(String name, String sex, String age, String prof, String username, String password, String root) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.prof = prof;
		this.username = username;
		this.password = password;
		this.root = root;
	}




	public adminuser() {
		super();
		// TODO Auto-generated constructor stub
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


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getProf() {
		return prof;
	}


	public void setProf(String prof) {
		this.prof = prof;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRoot() {
		return root;
	}


	public void setRoot(String root) {
		this.root = root;
	}


	@Override
	public String toString() {
		return "adminuser [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", prof=" + prof
				+ ", username=" + username + ", password=" + password + ", root=" + root + "]";
	}
	
	
	

}
