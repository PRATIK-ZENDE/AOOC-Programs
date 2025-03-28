import java.util.*;
import java.io.*;
class merge
{

public static void main(String args[])
{
int i,size1,size2; 
System.out.println("Enter size for 1st array:");
Scanner sc=new Scanner(System.in);
size1=sc.nextInt();	
System.out.println("Enter size for 2nd array:");
size2=sc.nextInt();
int a[]=new int[size1];
int b[]=new int[size2];
int c[]=new int[size1+size2];
System.out.println("Enter 1st Array:");
for(i=0;i<size1;i++)
{
		a[i]=sc.nextInt();	
}
System.out.println("Enter 2nd Array:");
for(i=0;i<size2;i++)
{
		b[i]=sc.nextInt();	
}
Arrays.sort(a);
Arrays.sort(b);
System.out.println("1st Sorted array:");
for(i=0;i<size1;i++)
{
		System.out.println(+a[i]);
}
System.out.println("2nd Sorted array:");
for(i=0;i<size2;i++)
{
		System.out.println(+b[i]);
}
System.out.println("Merging of 2 arrays:");
for(i=0;i<size1;i++)
{
		c[i]=a[i];
}	
for(i=0;i<size2;i++)
{
		c[size1+i]=b[i];
		
}
for(i=0;i<c.length;i++)
{
		System.out.println(+c[i]);
}
Arrays.sort(c);
System.out.println("Merged Sorted array:");
for(i=0;i<c.length;i++)
{
		System.out.println(+c[i]);
}
}
}