package day11;

public class Nirmaan {
	public static void main(String[]args) {
	Company com=new Company();
	Company com1=new Company("Sasi",1233,"IT",908765432);
	com.setEmpName("Santhini");
	com.setEmpId(1234);
	com.setEmpDept("CSE");
	com.setEmpPhone(98764544);
	System.out.println(com.toString());
	System.out.println(com1);
}
}