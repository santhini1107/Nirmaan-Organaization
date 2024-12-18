package day17;

public interface IWapperClass {
	public static void main(String[] args) {
		int num1=10;
		Integer autoBox1=num1;
		System.out.println(autoBox1);
		int unBox1=autoBox1;
		System.out.println(unBox1);
		
		byte num2=20;
		Byte autoBox2=num2;
		System.out.println(autoBox2);
		byte unBox2=autoBox2;
		System.out.println(unBox2);
		
		short num3=30;
		Short autoBox3=num3;
		System.out.println(autoBox3);
		short unBox3=autoBox3 ;
		System.out.println(unBox3);
		
		long num4=123456789l;
		Long autoBox4=num4;
		System.out.println(autoBox4);
		long unBox4=autoBox4 ;
		System.out.println(unBox4);
		
		float num5=12345.62f;
		Float autoBox5=num5;
		System.out.println(autoBox5);
		float unBox5=autoBox5 ;
		System.out.println(unBox5);
		
		double num6=12345.6789d;
		Double autoBox6=num6;
		System.out.println(autoBox6);
		double unBox6=autoBox6 ;
		System.out.println(unBox6);
		
		boolean num7=true;
		Boolean autoBox7=num7;
		System.out.println(autoBox7);
		boolean unBox7=autoBox7 ;
		System.out.println(unBox7);
		
		char S='S';
		Character autoBox8=S;
		System.out.println(autoBox8);
		char unBox8=autoBox8 ;
		System.out.println(unBox8);
	}

}
