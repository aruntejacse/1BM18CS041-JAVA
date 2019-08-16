import java.util.*;

class Maximum
{
public static void main(String args[])
	{
	Scanner se=new Scanner(System.in);
	System.out.println("Enter number of rows and columns of array:");
	int r=se.nextInt();
	int c=se.nextInt();
	int a[][]=new int[r][c];
	System.out.println("Enter elements of array:");
	for(int i=0;i<r;i++)
		{
		for(int j=0;j<c;j++)
			{
			a[i][j]=se.nextInt();
			}
		}
	int max=a[0][0];
	for(int a1[]:a)
		{
		for(int x:a1)
			{
			if(x>max)
				{
				max=x;
				}
			}
		}
	System.out.println("The maximum element is :"+max);
	}
}
