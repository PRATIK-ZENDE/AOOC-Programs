import java.util.*;
import java.io.*;
class Area
{
	int l,b;
	Scanner sc=new Scanner(System.in);
	void setDim()
	{
			System.out.println("Enter length and breadth:");
			l=sc.nextInt();
			b=sc.nextInt();
	}
	void getArea()
	{
		System.out.println("Area of Rectangle:"+l*b);
	}
	
	public static void main(String args[])
	{
		Area a=new Area();
		a.setDim();
		a.getArea();
	}

}