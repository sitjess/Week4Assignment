//Jessica Sit
import java.util.Scanner;
public class Week4Assignment 
{
	public static void main(String[] args) 
	{
		double length;
		double height;
		double width;
		Scanner input = new Scanner(System.in);
		System.out.println("This program will accept a length, width and height of a box, \nand then it will report the surface area and volume of it.");
		System.out.print("Enter the box length : ");
		length = input.nextDouble();
		System.out.print("Enter the box height : ");
		height = input.nextDouble();
		System.out.print("Enter the box width : ");
		width = input.nextDouble();
		System.out.printf("The surface area of your rectangle is: %,.2f" , calculatearea(length, height, width));
		System.out.printf("\nThe volume of your rectangle is: %,.2f", calculatevolume(length, height, width));
		input.close();
	}
		private static double calculatearea(double l, double h, double w) 
	{
		return (2 * (l * w + l * h + w * h));
	}
		private static double calculatevolume(double l, double h, double w) 
	{
		return l * h * w;
	}
}