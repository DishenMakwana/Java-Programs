import java.util.*;

class Rectangle
{
	double h;
	double w;
	static int count=0;
	Rectangle()
	{
		h=1;
		w=1;
		count = count + 1;
	}
	Rectangle(double h1,double w1)
	{
		h=h1;
		w=w1;
		count = count + 1;
	}
	void getArea()
	{
		System.out.println("Rectangle area: "+(h*w)+"m2 and perimeter is: "+(2*(h+w))+"m");
	}
}

public class testRectangle
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		r1.getArea();
		Rectangle r2=new Rectangle(2,2);
		r2.getArea();
		System.out.println("Object Count: "+r2.count);
	}
}