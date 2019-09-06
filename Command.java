import java.util.*;

class Command
{
    public static void main(String args[])
	{
	int sum=0,large;
        int a[]=new int[args.length];
	for(int i=0;i<args.length;i++)
	{
	a[i]=Integer.parseInt(args[i]);
	}
	large=a[0];	
	for(int i=1;i<args.length;i++)
	{
	if(a[i]>large)
		{
		large=a[i];
		}
	
	}
    System.out.println("large="+large);
	}
}
