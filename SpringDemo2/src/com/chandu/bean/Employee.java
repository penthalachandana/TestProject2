package com.chandu.bean;

import java.util.Date;

public class Employee
{
	
	/*  1. private int age;
	
         public Employee(int age) 
     {
		super();
		this.age = age;
	 } */
	
    /* 2. public void setAge(int age)
     {
		this.age = age;
	 }*/

	
	/* 3&4.private Double age;
	private String name;
	private int rollNo;*/
	
	/* 3. public void setAge(Double age) {
		this.age = age;
	}

    public void setName(String name) {
		this.name = name;
	}

   public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}*/

 /* 4.public Employee(Double age, String name, int rollNo) {
		super();
		this.age = age;
		this.name = name;
		this.rollNo = rollNo;
	}*/
	
	/* 5 &6 .private int age;
	private String name;
	private String city;
	
     
	public Employee(int age, String name, String city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
	}


	@Override
    public String toString() {
	return "Employee details:[age=" + age + ", name=" + name + ", city=" + city + "]";
}*/

	/*  1&2. public void show()
    {
    	System.out.println("hii chandu your age is:"+age);
    }*/
	
	/* 7.  private Date empDob;//predefined
	 private Date empDoj;

	
	public void setEmpDob(Date empDob) {
		this.empDob = empDob;
	}

	public void setEmpDoj(Date empDoj) {
		this.empDoj = empDoj;
	}

	@Override
	public String toString() {
		return "Employee [empDob=" + empDob + ", empDoj=" + empDoj + "]";
	} */
   private Integer empNo; 
   private  String empName;
   private Address empAddress;
public Employee(Integer empNo, String empName, Address empAddress) {
	super();
	this.empNo = empNo;
	this.empName = empName;
	this.empAddress = empAddress;
}
@Override
public String toString() {
	return "Employee \n[empNo=" + empNo + "\nempName=" + empName + ",\n empAddress=" + empAddress + "]";
}
 



	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
