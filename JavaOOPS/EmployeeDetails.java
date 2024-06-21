package com.JavaOOPS;

public class EmployeeDetails 
{
	private int employeeId;
	private double employeeSalary;
	private String employeeName; 
	private String employeeRole; 
	private String employeeDept;
	

	public EmployeeDetails(int employeeId,double employeeSalary,String employeeName,String employeeRole, String employeeDept)
	{
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeDept = employeeDept;

	}
	
	public void getemployeeDetails()
	{
		System.out.println("employeeId:" + employeeId);
		System.out.println("employeeSalary:" + employeeSalary);
		System.out.println("employeeName:" + employeeName);
		System.out.println("employeeRole:" + employeeRole);
		System.out.println("employeeDept:" + employeeDept);
	}
}
