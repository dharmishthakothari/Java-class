package basic;

class Shape
{
	int calculateArea()
	{
		return 0;
	}
}
class Circle extends Shape
{
	int radius;
	Circle(int r)
	{
		radius=r;
	}
	int calculateArea()
	{
		return (int) (3.14f*radius*radius);
	}	
}
class Square extends Shape
{
	int side;
	Square(int side1)
	{
		side=side1;		
	}
	int calculateArea()
	{
		return side*side;
	}
}
class Rectangle extends Shape
{
	int length,b;
	public Rectangle(int l,int b1) {
		length=l;
		b=b1;
	}
	@Override
	int calculateArea() {
		// TODO Auto-generated method stub
		return length*b;
	}
}

public class Overriding_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle obj=new Circle(20);
		System.out.println("Area of Circle "+obj.calculateArea());
		
		Square obj1=new Square(20);
		System.out.println("Area of Square "+obj1.calculateArea());
		
		Rectangle r=new Rectangle(20, 2);
		System.out.println("Area of Rectangle is "+r.calculateArea());
				
		
		
	}

}
