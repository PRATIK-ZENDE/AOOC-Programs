import java.util.*;
import java.io.*;
class prime
{

public static void main(String args[])
{
int i,n; 
boolean isPrime=true;
System.out.println("Enter no. to check Prime or not:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();	

        if (n<= 1) {
            isPrime = false;
        } else {
            for (i = 2; i <= Math.sqrt(n); i++) {
                if (n% i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
		}
	  }
}