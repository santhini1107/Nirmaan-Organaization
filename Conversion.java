package day7;

public class Conversion {
	String addition(int a,int b){
		return "Addition :"+(a+b);
		
	}
	String subtraction(int a,int b){
		return "Subtraction :"+(a-b);
		
	}
	String multiplication(int a,int b){
		return "Multiplication :"+(a*b);
		
	}
	String divition(int a,int b){
		return "divition :"+(a/b);
		
	}
	String modulus(int a,int b){
		return "Modulus :"+(a%b);
		
	}
	public static void main(String[]args) {
		Conversion add=new Conversion();
		String number=add.addition(30,20);
		System.out.println(number);
		String sub=add.subtraction(30,20);
		System.out.println(sub);
		String mult=add.multiplication(3,2);
		System.out.println(mult);
		String div=add.divition(100,20);
		System.out.println(div);
		String modu=add.modulus(100,3);
		System.out.println(modu);
		
	}

}
