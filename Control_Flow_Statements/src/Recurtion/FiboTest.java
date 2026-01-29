package Recurtion;

import java.util.Scanner;

public class FiboTest {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Range :- ");
		int range =obj.nextInt();
		for (int i=0;i<range;i++) {
			System.out.println(Fibonacci.fibo(i)+" ");
		}
	}

}
