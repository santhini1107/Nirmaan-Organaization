package Day1;

public class OperatorTask {
	public static void main(String[]args) {
		int a=12;
		int b=25;
		int c=10;
		int d=50;
		int e=5;
		int f=100;
		int g=20;
		int h=120;
		int initial=10;
		int intial=12;
		//int Answer=(FirstNumber+SecondNumber);
		System.out.println("Arithmetic operations");
		System.out.println("Addition :"+(a+b));
		System.out.println("Subtraction :"+(a-b));
		System.out.println("Multiplication :"+(a*b));
		System.out.println("Division :"+(a/b));
		System.out.println("Modulus :"+(a%b));
		System.out.println("Relational operations");
		System.out.println("12>25 :"+(a>b));
		System.out.println("12<25 :"+(a<b));
		System.out.println("12>=25 :"+(a>=b));
		System.out.println("12<=25 :"+(a<=b));
		System.out.println("12==25 :"+(a==b));
		System.out.println("12!=25 :"+(a!=b));
		System.out.println("Logical Operations");
		System.out.println("12>10 AND 25<50 :"+((a>c)&&(b<d)));
		System.out.println("12<5 OR 25<100 :"+((a<e)||(b>f)));
		System.out.println("Assignments operations");
		System.out.println("Initial value:"+initial);
		System.out.println("After += :"+(a+=initial));
		System.out.println("After -= :"+(g-=initial));
		System.out.println("After *= :"+(a*=initial));
		System.out.println("After /= :"+(h/=initial));
		System.out.println("After %= :"+(c%=initial));
		System.out.println("Unary Operation :");
		System.out.println("Initial value :"+intial);
		System.out.println("Unary Operation :"+(++intial));
		System.out.println("Unary Operation :"+(--intial));
		System.out.println("Conditional Operation :");
		System.out.println("12 is Even");
		
		
		
		
		


		
		
	}
	

}
