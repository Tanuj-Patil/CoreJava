package com.infogalaxy.employee;
import java.util.Scanner;
import com.infogalaxy.employeemodel.EmployeeModel;

public class EmployeeMain {

	
//	int id;
//	String name;
//	String mobno;
//	double salary;
//	
//	public void inputData(int id, String name, String mobno, double salary) {
//		this.id = id;
//		this.name = name;
//		this.mobno = mobno;
//		this.salary = salary;
//	}
//	
//	public void displayData() {
//		System.out.println("Employee Id: " +id );
//		System.out.println("Employee Name: " +name);
//		System.out.println("Employee Mobile No: " +mobno);
//		System.out.println("Employee Salary: " +salary);
//	}

	EmployeeModel employeemodel = new EmployeeModel();
	
	public void setEmployee() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee Id: ");
		employeemodel.setEid(scanner.nextInt());
		
		System.out.println("Enter Employee Name: ");
		employeemodel.setEname(scanner.next());

		System.out.println("Enter Employee Mobile No: ");
		employeemodel.setMobNo(scanner.next());
		
		System.out.println("Enter Employee Salary: ");
		employeemodel.setSalary(scanner.nextDouble());
	}
	
	public void getEmployee() {
		System.out.println("Employee Id is: " +employeemodel.getEid());
		System.out.println("Employee Name is: " +employeemodel.getEname());
		System.out.println("Employee Mobile No is: " +employeemodel.getMobNo());
		System.out.println("Employee Salary is: " +employeemodel.getSalary());
	}
	
	public static void main(String[] args) {
		EmployeeMain employeemain = new EmployeeMain();
		
		employeemain.setEmployee();
		employeemain.getEmployee();
		
			
	}
	
	

}
