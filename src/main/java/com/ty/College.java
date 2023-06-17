package com.ty;

public class College {
	private int id;
	private String name;
	private String website;
	private String location;
	private long phno;
	private Branch branch;
	private Student student;
	
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(int id, String name, String website, String location, long phno, Branch branch, Student student) {
		super();
		this.id = id;
		this.name = name;
		this.website = website;
		this.location = location;
		this.phno = phno;
		this.branch = branch;
		this.student = student;
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

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	

}
