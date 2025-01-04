package day23;

import java.util.Objects;

import day21.Book;

public class EmployeeManagement implements Comparable<EmployeeManagement>{
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

	
	@Override
	public String toString() {
		return "EmpName=" + EmpName + ", EmpId=" + EmpId + ", EmpDept=" + EmpDept + ", Mobile="
				+ Mobile;
	}
	@Override
	public int hashCode() {
		return Objects.hash(EmpId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeManagement other = (EmployeeManagement) obj;
		return EmpId == other.EmpId;
	}
	@Override
	public int compareTo(EmployeeManagement other) {
		// TODO Auto-generated method stub
		return Integer.compare(this.EmpId, other.getEmpId());
	}
	
	
	
	
}
