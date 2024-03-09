package selenium_practise1;

import java.util.Scanner;

public class Input_output {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter First value: ");
		int a=s.nextInt();
		System.out.println("Enter Second value: ");
		int b=s.nextInt();
		int c=a+b;
		System.out.println("Sum :"+c);
		s.close();
	}
}
