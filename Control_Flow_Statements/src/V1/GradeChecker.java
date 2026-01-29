package V1;

import java.util.Scanner;

public class GradeChecker {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Your Percentage :- ");
		if(obj.hasNextDouble()) {
			double percentage = obj.nextDouble();
			if (percentage >= 0.00 && percentage <=100.00) {
				
				
				if (percentage >= 90.00) {
					System.out.println("A Grade");
				}else {
					if (percentage >= 75) {
						System.out.println("B Grade");
					}else {
						if (percentage >= 55) {
							System.out.println("C Grade");
						}else {
							if (percentage >= 40){
								System.out.println("D Grade");
							}else {
								System.out.println("Fail");
							}
						}
					}
				}
				
			}else {
				System.out.println("Please Enter Valid Percentage");
			}
		}else {
			System.out.println("Please Enter Double Value :- ");
		}
		
	}

}