package test;

import java.util.Scanner;

class Rectangle
{
    double length;
    double breadth;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea()
    {
        return length * breadth;
    }
}
class Triangle
{
    double length;
    double breadth;

    Triangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea()
    {
        return length * breadth / 2;
    }
}

class Square
{
    double side;

    Square(double side)
    {
        this.side = side;
    }

    double getArea()
    {
        return side * side;
    }
}

class Circle
{
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    double getArea()
    {
        return (22.0/7.0) * radius * radius;
    }
}

public class Area
{
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("MENU:");
		System.out.println("1. Area of Circle");
		System.out.println("2. Area of Square");
		System.out.println("3. Area of Rectangle");
		System.out.println("4. Area of Triangle");
		System.out.println("Enter Your Option");
		
		int option = s.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("Enter Radius");
			 Circle c = new Circle(s.nextFloat());
			 System.out.println("Circle Area : " + c.getArea());
			 
		case 2:
			System.out.println("Enter Side");
			Square sq = new Square(s.nextFloat());
			System.out.println("Square Area : " + sq.getArea());
			
		case 3:
			System.out.println("Enter Length and Breadth");
			Rectangle r = new Rectangle(s.nextFloat(),s.nextFloat());
			System.out.println("Rectangle Area : " + r.getArea());
			
		case 4:
			System.out.println("Enter Length and Breadth");
			Triangle t = new Triangle(s.nextFloat(),s.nextFloat());
			System.out.println("Triangle Area : " + t.getArea());
			
		default:
			System.out.println("Wrong Input");
		}
	}
}
