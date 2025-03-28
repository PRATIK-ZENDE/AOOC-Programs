import java.util.*;
import java.io.*;
class  matrix
{

public static void main(String args[])
{
int i,j,k,ch;
int[][] a = new int[2][2];
int[][] b = new int[2][2];
int[][] c = new int[2][2];
int[][] d = new int[2][2];
int[][] e = new int[2][2];

Scanner sc=new Scanner(System.in);
System.out.println("Enter Matrix 1:");
for(i=0;i<2;i++)
{	for(j=0;j<2;j++)
	{
		a[i][j]=sc.nextInt();	
	}
}
System.out.println("Enter Matrix 2:");
for(i=0;i<2;i++)
{	for(j=0;j<2;j++)
	{
		b[i][j]=sc.nextInt();	
	}
}
System.out.println("Enter Choice:\n1.Multiplication \n2.Addition \n3.Transpose");
ch=sc.nextInt();
switch(ch)
{case 1:
System.out.println("Matrix Multiplication:");
for(i=0;i<2;i++)
{	for(j=0;j<2;j++)
	{
		for(k=0;k<2;k++)
		{
			
		c[i][j]+=a[i][k]*b[k][j];	
		}
	}
}
for(i=0;i<2;i++)
{	for(j=0;j<2;j++)
	{
		System.out.println(c[i][j]);	
	}
}
break;

case 2:
System.out.println("Matrix Addition:");
for(i=0;i<2;i++)
{	for(j=0;j<2;j++)
	{
			
		d[i][j]=a[i][j]+b[i][j];	
		
	}
}
for(i=0;i<2;i++)
{	for(j=0;j<2;j++)
	{
		System.out.println(d[i][j]);	
	}
}
break;

case 3:
System.out.println("Matrix Transpose:");
for(i=0;i<2;i++)
{	for(j=0;j<2;j++)
	{
			
		e[j][i]=d[i][j];	
		
	}
}
for(i=0;i<2;i++)
{	for(j=0;j<2;j++)
	{
		System.out.println(e[i][j]);	
	}
}
break;

default:
System.out.println("Wrong Choice...");
}
}
}