package day22;

import java.util.Scanner;

public class Assessment3 {
	
	public static void main(String[] args) {
//		//1.count off odd & Even Number
//		//count off odd number
//		int odd=0;
//		for(int i=0;i<=100;i++) {
//			if(i%2!=0) {
//				odd++;
//			}
//		}
//		
//		System.out.println("Count of Odd number: "+odd);
//		
//		//count off even number
//		int even=0;
//		for(int i=0;i<=100;i++) {
//			if(i%2==0) {
//				even++;
//			}
//		}
//		
//		System.out.println("Count of Even Numbers: "+even);
//	}
//}
//		//2.Sum of odd & even Numbers
//		//Sum of odd  numbers
//		int oddSum=0;
//		for(int i=1;i<=100;i++) {
//			if(i%2!=0) {
//				oddSum+=i;	
//			}		
//	}
//		System.out.println("Sum of odd Numbers: "+oddSum);
//		
//		//Sum of even numbers
//		int evenSum=0;
//		for(int i=1;i<=100;i++) {
//			if(i%2==0) {
//				evenSum+=i;	
//				
//			}		
//	}
//		System.out.println("Sum of even Numbers: "+evenSum);
//	}
//	}

//		//3.Reverse your name
//			Scanner scan=new Scanner(System.in);
//			System.out.println("Enter your name");
//			String name=scan.nextLine();
//			int n=name.length();
//			for(int i=n-1;i>=0;i--) {
//				System.out.print(name.charAt(i));
//			}
//		}
//	}
		
		
//		//4.Given String is palindrome
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter String");
//        String name=scan.nextLine();
//		String wsr=name.replace(" ", "");
//		System.out.println(wsr);
//		String rname="";
//		for(int i=wsr.length()-1;i>=0;i--) {
//			rname += wsr.charAt(i);
//		}
//		System.out.println(rname.equalsIgnoreCase(wsr));
//	}
//}

		//5.factor of given number
int sum=5;
int factor=1;
for(int i=sum;i>=1;i--) {
	
	factor*=i;
}
System.out.println(factor);

}
}
	

