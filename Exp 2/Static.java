import java.util.*;
import java.io.*;
class Static
{
	static int a;
	static
	{
		System.out.println("This is Static Block");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value:");
		a=sc.nextInt();
	}
	static void setDim()
	{
		System.out.println(".\n.\nInto the Static Method");
		System.out.println("Staic Value:"+a);
			
	}
		
	public static void main(String args[])
	{
		Static s=new Static();
		s.setDim();
	}

}