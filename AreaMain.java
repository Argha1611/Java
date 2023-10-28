// Write a program to calculate the area of a rectangle, a square and a circle. Create an abstract class ‘Shape’ with three abstract methods namely ‘RectangleArea’ taking two parameters, ‘SquareArea’ and ‘CircleArea’ taking one parameter each. The parameters of ‘RectangleArea’ are its length and breadth, that of ‘SquareArea’ is its side and that of ‘CircleArea’ is its radius. Now create another class ‘Area’ containing all the three methods ‘RectangleArea’, ‘SquareArea’ and ‘CircleArea’ for printing the area of rectangle, square and circle respectively. Create an object of class ‘Area’ and call all the three methods.
package Java;
import java.util.*;
abstract class Shape {
	abstract float RectangleArea();
	abstract float SquareArea();
	abstract float CircleArea();
}
class Area extends Shape {
	float length, breadth,area1, side, area2, radius, area3;
	static double pi = 3.14;
	Scanner scanner = new Scanner(System.in);
	float RectangleArea()
	{
		System.out.println("Enter the length of rectangle");
		length = scanner.nextFloat();
		System.out.println("Enter the breadth of rectangle");
		breadth = scanner.nextFloat();
		area1 = length* breadth;
		return area1;
	}	
	float SquareArea()
	{
		System.out.println("Enter the side of square");
		side = scanner.nextFloat();
		area2 = side * side;
		return area2;
	}
	float CircleArea()
	{
		System.out.println("Enter the radius of circle");
		radius = scanner.nextFloat();
		area3 = (float) (pi* radius * radius);
		return area3;
	}
}
public class AreaMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape a = new Area();
		System.out.println("The area of rectangle is "+a.RectangleArea());
		System.out.println("");
		Shape b = new Area();
		System.out.println("The area of square is "+b.SquareArea());
		Shape c = new Area();
		System.out.println("");
		System.out.println("The area of circle is "+c.CircleArea());
	}
}