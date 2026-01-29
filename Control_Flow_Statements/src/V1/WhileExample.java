package V1;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		while(true) {
			System.out.println("Enter Your Name");
			System.out.println("Enter Exit to Stop Loop");
			String name=obj.nextLine();
			if (name.equals("exit")) {
				break;
			}
			else {
				System.out.println("Hello "+ name +" heyGood Morning");
			}
				
		}
	}

}
