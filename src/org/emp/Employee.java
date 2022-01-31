package org.emp;

import org.com.Clint;

public class Employee {
	private void empId() {
		System.out.println("employee id is 1234");
	}
    private void empName() {
		System.out.println("employee name is bala");
	}
    public static void main(String[] args) {
		Employee e = new Employee();
		e.empId();
		e.empName();
		Clint c = new Clint();
		c.CliId();
		c.CliName();
	}
}
