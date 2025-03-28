import java.util.*;
import java.io.*;
class sortarray
{

public static void main(String args[])
{
int i,size,a,b,c,j,temp=0; 
System.out.println("Enter size:");
Scanner sc=new Scanner(System.in);
size=sc.nextInt();	
int a1[]=new int[size];
System.out.println("Enter Array:");
for(i=0;i<size;i++)
{
		a1[i]=sc.nextInt();	
}
//Arrays.sort(a);
for(i=0;i<size;i++)
{
	for(j=i+1;j<size;j++)
	{
		if(a1[i]>a1[j])
		{
			temp=a1[i];
			a1[i]=a1[j];
			a1[j]=temp;
		}
		
	}
	
}

System.out.println("Sorted array:");
for(i=0;i<size;i++)
{
		System.out.println(+a1[i]);
}
}
}