import java.util.*;

class Addition
{
public static void main(String args[])
	{
	Scanner se=new Scanner(System.in);
	System.out.println("Enter number of rows and columns of array:");
	int r=se.nextInt();
	int c=se.nextInt();
	int arr1[][]=new int[r][c];
	int arr2[][]=new int[r][c];
	System.out.println("Enter the elements of array1");
	for(int i=0;i<r;i++)
		{
		for(int j=0;j<c;j++)
			{
			arr1[i][j]=se.nextInt();
			}
		}
	System.out.println("Enter the elements of array2");
	for(int i=0;i<r;i++)
		{
		for(int j=0;j<c;j++)
			{
			arr2[i][j]=se.nextInt();
			}
		}
	System.out.println("The addition matrix is:");
	for(int i=0;i<r;i++)
		{
		for(int j=0;j<c;j++)
			{
			System.out.print(arr1[i][j]+arr2[i][j]+" ");
			}
		System.out.println("\n");
		}
	System.out.println("The subtraction matrix is:");
	for(int i=0;i<r;i++)
		{
		for(int j=0;j<c;j++)
			{
			System.out.print(arr1[i][j]-arr2[i][j]+" ");
			}
		System.out.println("\n");
		}
	}
}