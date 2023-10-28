// Write a program to accept your name from user and display it using array and count number of A's in your name.
package Java;
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String name;
		int i,count;
		System.out.println("Enter your name");
		name=scanner.nextLine();
		count=0;
		for(i=0; i<name.length(); i++)
		{
			if(name.charAt(i)=='A' || name.charAt(i)== 'a')
				count++;
		}
		System.out.println("The number of 'A' or 'a' in the name is "+count);
	}
}