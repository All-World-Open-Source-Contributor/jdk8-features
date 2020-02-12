package com.nttdata.javaseprojects.model;

public class Employee {
	String name;
	private int id;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public static int nameCompare(Employee a1, Employee a2) {
		return a1.name.compareTo(a2.name);
	}

	public String toString() {
		return name;
	}
}
