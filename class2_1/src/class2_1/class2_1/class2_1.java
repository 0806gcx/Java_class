package class2_1;

import java.util.Scanner;

public class class2_1 {
	public static void main(String[] args)
	{
		circle circle1 = new circle();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please input radius�� ");
		circle1.getradio(scanner.nextDouble());
		
		System.out.println("####################");
		System.out.println("�ܳ�: "+circle1.Perimeter());
		System.out.println("���: "+circle1.Area());
	}
}
