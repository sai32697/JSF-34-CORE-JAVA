package practice;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter Range ");
		int range =obj.nextInt();
		int first=0;
		int second =1;
		System.out.println(first +" "+second);
		for (int i=3;i<=range;i++) {
			int next=first + second;
			System.out.println(next +" ");
			first=second;
			second=next;
			
		}
	}

}
