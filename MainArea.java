// Write a program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.
package Java;
import java.util.*;
interface Shape1 {
	float getArea();
}
class Circle implements Shape1 {
float radius, area2;
static double pi = 3.14;
Scanner scanner = new Scanner(System.in);
public float getArea()
{
	System.out.println("Enter the radius of circle");
	radius = scanner.nextFloat();
	area2 = (float) (pi* radius * radius);
	return area2;
}
}
class Rectangle implements Shape1 {
float length, breadth, area1;
Scanner scanner = new Scanner(System.in);
public float getArea()
{
	System.out.println("Enter the length of the rectangle");
	length = scanner.nextFloat();
	System.out.println("Enter the breadth of the rectangle");
	breadth = scanner.nextFloat();
	area1 = length * breadth;
	return area1;
}
}
class Triangle implements Shape1 {
float base, height, area3;
Scanner scanner = new Scanner(System.in);
public float getArea()
{
	System.out.println("Enter the base of the triangle");
	base = scanner.nextFloat();
	System.out.println("Enter the height of the triangle");
	height = scanner.nextFloat();
	area3 = ((base * height)/2);
	return area3;
}
}
public class MainArea {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a = new Rectangle();
		System.out.println("The area of rectangle is "+a.getArea());
		System.out.println("");
		Circle b = new Circle();
		System.out.println("The area of circle is "+b.getArea());
		System.out.println("");
		Triangle c = new Triangle();
		System.out.println("The area of triangle is "+c.getArea());
	}
}