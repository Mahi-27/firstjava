package pakage1;

import java.util.Scanner;

public class conditinalState {

	static int num1 = 0;
	static int num2 = -20;
	static int num3 = 7;
	
	public static void main(String[] args) {
		
//		if(num1>0) {
//			System.out.println(num1 + " "+ "is POSITIVE");
//		}else if(num1<0) {
//			System.out.println(num1 + " " + "is NEGATIVE");
//		}else {
//			System.out.println(num1 + " "+ "is ZERO");
//		}
		int num6;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("PLEASE ENTER THE NUMBER");
		num6 = scan.nextInt();
		
		if (num6>0) {
			System.out.println(num6 + " " + "is the POSITIVE");
		}else if(num6<0) {
			System.out.println(num6 + " " + "is NEGATIVE");
		}else System.out.println(num6 + " " + "is ZERO");
		
		scan.close();
		
		
//		if(num1>num2) {
//			System.out.println(num1 + " "+ "is the largest number");
//		}else if(num2>num3) {
//			System.out.println(num2 + " " + "is the largest number");
//		}else if(num3>num1) {
//			System.out.println(num3+ " "+ "is the largest number");
//		}else {
//			System.out.println("All are equal");
//		}
		
//		if(num1>=num2 && num1>=num3) {
//			System.out.println(num1 + " "+ "is the largest number" );
//			if(num2>=num1 && num2>=num3) {
//				System.out.println(num2 + " "+ "is the largest number");
//			}
//		}else System.out.println(num3 + " " + "is the largest number");
//		
		
		}
	}
		
		
		
		
		
	


