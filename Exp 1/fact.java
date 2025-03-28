import java.util.*;
import java.io.*;
class fact
{

public static void main(String args[])
{
int i,fact=1,n; 
System.out.println("Enter no. for factorial:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();	
for(i=1;i<=n;i++)
{
		fact=fact*i;
}
System.out.println("Factorial is:"+fact);
}
}