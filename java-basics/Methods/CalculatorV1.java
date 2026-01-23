package Methods;

import java.util.Scanner;

public class CalculatorV1 {
	
		
		public static void main(String[] args) {
			Scanner obj = new Scanner(System.in);
			
			System.out.println("Enter first number");
			double a = obj.nextDouble();
			

			System.out.println("Enter Second number");
			double b = obj.nextDouble();
			
			System.out.println("Enter operation + - * % /");
			char operation = obj.next().charAt(0);
			if(operation == '+') {
				double result = Arithmetic.add(a,b);
				System.out.println("Addition is "+result);
				
				
			}else {
				if(operation == '-') {
					double result = Arithmetic.sub(a,b);
					System.out.println("Subtraction is "+result);
					
			}else {
				if(operation == '*') {
					double result = Arithmetic.mul(a,b);
					System.out.println("Multipication is "+result);
					
			}
				else {if(operation == '/') {
					double result = Arithmetic.div(a,b);
					System.out.println("Division is "+result);
					
			}else {
				if(operation == '%') {
					double result = Arithmetic.mod(a,b);
					System.out.println("Modulas is "+result);
					
			}else {
				System.out.println("Invalid Operations.........");
			}
			}
					
				}
		}

	
		}
}
}
