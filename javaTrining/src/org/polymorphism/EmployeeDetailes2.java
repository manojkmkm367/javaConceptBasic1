package org.polymorphism;


public class EmployeeDetailes2 implements EmployeeDetailes1,EmployeeDetailes{

	public static void main(String[] args) {
		EmployeeDetailes2 emp = new EmployeeDetailes2();
		emp.empName(); ;emp.empId();emp.empDesignation();emp.empLocation();

	}
	@Override
	public void empId() {
		System.out.println(" emp id");
	}

	@Override
	public void empName() {
		System.out.println(" emp name");
	}

	@Override
	public void empLocation() {
		System.out.println(" emp loccation");
	}

	@Override
	public void empDesignation() {
		System.out.println(" emp desk");
	}

}
