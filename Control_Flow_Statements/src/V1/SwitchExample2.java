package V1;

import java.util.Scanner;

public class SwitchExample2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println(" Welcome ");
		System.out.println(" Courses Offered");
		System.out.println(" 1. Python");
		System.out.println(" 2. Java ");
		System.out.println(" 3. DSA ");
		System.out.println("=========================");
		System.out.println(" Enter Your Preffered Course :- ");
		
		int course = obj.nextInt();
		switch(course) {
		case 1 :
			System.out.println("Duration 100 Days");
			System.out.println(" FEE 50000");
			break;
		case 2 :
			System.out.println("Duration 90 Days");
			System.out.println(" FEE 55000");
			break;
		case 3 :
			System.out.println("Duration 85 Days");
			System.out.println(" FEE 50000");
			break;
		default:
				System.out.println("Sorry We are not Offering this Course.....");
		
		}
		
		
	}

}
