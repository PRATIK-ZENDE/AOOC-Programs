import java.util.*;
import java.io.*;
class employee1
{
	
		String fn,ln;
		int sal,ysal,r;
		Scanner sc=new Scanner(System.in);
		employee1(){}
		employee1(String fn,String ln,int sal)
		{
			this.fn=fn;
			this.ln=ln;
			this.sal=sal;
		}
		void setn(String fn,String ln)
		{
			this.fn=fn;
			this.ln=ln;
		}
		void getn()
		{		
			System.out.println("Employee Name:"+fn+" "+ln);
		}
		void sets(int sal)
		{
			this.sal=sal;
			if(sal<0)
			{
				sal=0;
			}
		}
		void gets()
		{
			System.out.println("Monthly Salary:"+sal);
		}
		void sety()
		{
			ysal=sal*12;
			System.out.println("Yearly Salary:"+ysal);
		}
		void setr()
		{
			r=ysal*10/100;
			System.out.println("Raise:"+r);
			System.out.println("Updated Yearly Salary:"+(r+ysal));
			
		}
		
	public static void main(String args[])
	{
		employee1 e1=new employee1();
		e1.setn("WX","YZ");
		e1.getn();
		e1.sets(14000);
		e1.gets();
		e1.sety();
		e1.setr();
		
		System.out.println("");
		employee1 e2=new employee1();
		e1.setn("AB","CD");
		e1.getn();
		e1.sets(14000);
		e1.gets();
		e1.sety();
		e1.setr();
	}
}