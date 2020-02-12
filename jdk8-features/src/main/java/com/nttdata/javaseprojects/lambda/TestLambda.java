package com.nttdata.javaseprojects.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.nttdata.javaseprojects.model.Employee;

public class TestLambda {

	/*
	 * either
	 * 
	 * (parameters) -> expression //1
	 * 
	 * or
	 * 
	 * (parameters) -> { statements; } //2
	 * 
	 * or
	 * 
	 * () -> expression //3
	 */

	public void useLambda() {

		List<String> pointList = new ArrayList<>();
		pointList.add("1");
		pointList.add("2");

		pointList.forEach(p -> {
			System.out.println(p);
		});

		// sort

		Employee[] employees = { new Employee("David", 1), new Employee("Naveen", 2), new Employee("Alex", 3),
				new Employee("Richard", 5) };

		System.out.println("Before Sorting Names: " + Arrays.toString(employees));
		Arrays.sort(employees, Employee::nameCompare);
		System.out.println("After Sorting Names " + Arrays.toString(employees));
	}

	public void useLambdaToSort() {

		List<Employee> employeeList = getEmployeeList();

		System.out.println("before sorting ");
		for (Employee employee : employeeList) {
			System.out.println(employee);

		}
		System.out.println("after sorting...");

		System.out.println("using Lambda to sort");
		employeeList.sort((Employee e1, Employee e2) -> e1.getId() - e2.getId());
		System.out.println("using lambda to print");
		employeeList.forEach((emp) -> System.out.println(emp));

	}

	private List<Employee> getEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee("Zoltan", 1));
		employeeList.add(new Employee("Bhanu", 2));
		employeeList.add(new Employee("Anthony", 3));
		employeeList.add(new Employee("Prasanna", 4));
		return employeeList;
	}
}
