import java.util.*;
class quadratic
{
public static void main(String args[])
	{
	 Scanner se=new Scanner(System.in);
	 System.out.println("Enter coefficients a,b and c");
	 int a=se.nextInt();
	 int b=se.nextInt();
	 int c=se.nextInt();
	 int d=(b*b)-(4*a*c);
	 if(d>0)
		{
		 System.out.println("The roots are distinct");
		 double r1= (-b + Math.sqrt(d))/(2*a);
		 double r2= (-b - Math.sqrt(d))/(2*a);
		 System.out.println("Roots are "+r1+"and "+r2);
		}
	else if(d==0)
		{
		 System.out.println("The roots are equal");
		 int r= -b/(2*a);
		 System.out.println(r);
		}
 	else
		{
		 System.out.println("The roots are imaginary");
		}
	}
}	 