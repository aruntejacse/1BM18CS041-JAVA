import java.util.*;

class Rectangle
{
int length;
int breadth;

void input()
	{
	Scanner se=new Scanner(System.in);
	System.out.println("Enter length and breadth");
	length=se.nextInt();
	breadth=se.nextInt();
	}
void area()
	{
	int a=length*breadth;
	System.out.println("Area is: "+a+" for rectangle of "+length+" length "+"and "+breadth+" breadth");
	}
}

class Demo
{
	public static void main(String args[])
	{
	Rectangle rect1=new Rectangle();
	Rectangle rect2=new Rectangle();
	rect1.input();
	rect1.area();
	rect2.input();
	rect2.area();
	}
}

