package day11;

public class Company {
	private String empName;
	private int empId;
	private String empDept;
	private int empPhone;
	Company(){
		
	}
	Company(String empName,int empId,String empDept,int empPhone){
		this.empName=empName;
		this.empId=empId;
		this.empDept=empDept;
		this.empPhone=empPhone;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpDept() {
		return empDept;
	}
	public int getEmpPhone() {
		return empPhone;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
		
	}
     public void setEmpId(int empId) {
		this.empId=empId;
	}
     public void setEmpDept(String empDept) {
 		this.empDept=empDept;
 	}
     public void setEmpPhone(int empPhone) {
 		this.empPhone=empPhone;
 	}
	public String toString() {
		return "Emp Name :"+empName+"\nEmp Id  :"+empId+"\nEmp Dept :"+empDept+"\nEmp Phone :"+empPhone;
	}
	
	
	

}
