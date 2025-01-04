package day23;

import java.util.Scanner;
import java.util.TreeSet;

import day21.Book;

public class MainEmployeeManagement {
	EmployeeManagement emp;
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);	
	EmployeeManagement emp=new EmployeeManagement();
	TreeSet<EmployeeManagement> al=new TreeSet<EmployeeManagement>();
	boolean isTrue=true;
	while(isTrue) {
	System.out.println("Enter your choice");
	System.out.println("1 for Add");
	System.out.println("2 for Remove");
	System.out.println("3 for Display");
	System.out.println("4 for Search");
	System.out.println("0 for Exit");
	int key=scan.nextInt();
	scan.nextLine();
	
	
		switch (key) {
		case 1: {
			System.out.println("Enter Employee Name");
			String empName=scan.nextLine();
			System.out.println("Enter Employee department ");
			String empDept=scan.nextLine();
			System.out.println("Enter  Employee Id");
			int empId=scan.nextInt();
			System.out.println("Enter Employee Moblie No");
			long mobile=scan.nextLong();
			emp=new EmployeeManagement(empName, empId, empDept, mobile);
			al.add(emp);
			break;
		}
		case 2: {
			System.out.println("Enter the Employee Id");
			int id=scan.nextInt();
			for(EmployeeManagement emp1:al) {
				if(id==emp1.getEmpId()) {
					al.remove(emp1);
					System.out.println("Employeee Removed successfully");
					break;	
				}
			}			
			
		}
		case 3:{
			System.out.println(al);
			break;
		}
		case 4:{
			System.out.println("Enter the Employee ID");
			int id=scan.nextInt();
			scan.nextLine();
			for(EmployeeManagement emp1:al)  {
				if(id==emp1.getEmpId()) {
					System.out.println(emp1);
					}
				else {
					System.out.println(" Invalid Employee Id");
				}
				}
			break;
	
		}
		
		case 0:{
			isTrue=false;
			System.out.println("Thank you");
			break;
		}
			
		default:
			System.out.println("Enter the correct choice");
			break;
		}
			
		}

}
}
