import java.util.*;

class Employee 
{
    	String emp_num,name;
    	double basic,DA,IT,net_sal;
    
    	void input(int i)
	{
        Scanner se=new Scanner(System.in);
        System.out.println("Enter the Employee_code,Name,Basic salary of employee "+(i+1));
        emp_num=se.next();
        name=se.next();
        basic=se.nextInt();
    	}
    
    	void net_sal()
	{
        DA=basic*3/4;
        double gross=basic+DA;
        IT=gross*3/10;
        net_sal=basic+DA-IT;
    	}
    
	void print()
	{
        System.out.println("\t\tThe Employee details are\n\nEmployee Name:"+name);
	System.out.println("Employee code:"+emp_num);
	System.out.println("Basic salary:"+basic);
	System.out.println("DA:"+DA);
	System.out.println("IT:"+IT);
	System.out.println("Net salary:"+net_sal);
    	}
}
    
class Employeedemo
{
     
    public static void main(String args[])
	{
        System.out.println("Enter the number of employees");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Employee e=new Employee();
        for(int i=0;i<n;i++)
        	{
           	e.input(i);
           	e.net_sal();
           	e.print();
		}
    	}
}