package com.ty;

public class Branch {
	private int id;
	private String  branchname;
	private int noplaces;
	private String trainer;
	private Student students;
	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Branch(int id, String branchname, int noplaces, String trainer, Student students) {
		super();
		this.id = id;
		this.branchname = branchname;
		this.noplaces = noplaces;
		this.trainer = trainer;
		this.students = students;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public int getNoplaces() {
		return noplaces;
	}
	public void setNoplaces(int noplaces) {
		this.noplaces = noplaces;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public Student getStudents() {
		return students;
	}
	public void setStudents(Student students) {
		this.students = students;
	}
	
	
	

}
