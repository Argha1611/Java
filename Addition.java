//Write a Java program to take two numbers as input from the user and print their sum.
package Java;
import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
				int a,b,c;
		System.out.println("Enter first number");
		a = scn.nextInt();
		System.out.println("Enter second number");
		b = scn.nextInt();
		c = a + b;
		System.out.println("Addition="+c);
	}
}
