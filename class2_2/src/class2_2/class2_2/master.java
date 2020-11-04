package class2_2;

import java.util.Scanner;

public class master {
	public static void main(String[] args) {
		people people1 = new people();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please input height(单位：m)： ");
		people1.getheight(scanner.nextDouble()); 
		System.out.print("Please input weight(单位：kg)： ");
		people1.getweight(scanner.nextDouble()); 
		System.out.println("####################");
		System.out.println("BMI: "+people1.BMI());
	}
}
