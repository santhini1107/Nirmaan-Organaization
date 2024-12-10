package day14;

public class EmployeeManagement {
	private String EmpName;
	private int EmpId;
	private String EmpDept;
	private  long Mobile;
	public EmployeeManagement() {
		super();
	}
	public EmployeeManagement(String empName, int empId, String empdept, long mobile) {
		super();
		EmpName = empName;
		EmpId = empId;
		EmpDept = empdept;
		Mobile = mobile;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpDept() {
		return EmpDept;
	}
	public void setEmpDept(String empDept) {
		EmpDept = empDept;
	}
	public long getMobile() {
		return Mobile;
	}
	public void setMobile(long mobile) {
		Mobile = mobile;
	}

	public String toString() {
		return "EmpName = " + EmpName + "\nEmpId   = " + EmpId + "\nEmpDept = " + EmpDept + "\nMobile  = "
				+ Mobile ;
	}
	
}
