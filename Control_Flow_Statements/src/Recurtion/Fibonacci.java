package Recurtion;

public class Fibonacci {
	public static int fibo(int number) {
		if(number == 0 || number ==1) {
			return number;
		}else {
			return fibo(number -2)+fibo(number-1);
		}
	}

}
