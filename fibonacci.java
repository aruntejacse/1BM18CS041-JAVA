import java.util.*;
class fibonacci
{
public static void main(String args[])
	{
	 Scanner se=new Scanner(System.in);
	 System.out.println("Enter the nth term you want");
	 int n=se.nextInt();
	 int a=1;
	 int b=1;
	 int c;
	 int count=2;
	 while(count<n)
	 	{
		 c=b;
		 b=a+b;
	  	 a=c;
		 count++;
		}
	System.out.println("The nth term is :"+b);
	}
}
	
	 
		  