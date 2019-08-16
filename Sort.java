import java.util.*;

class Sort
{
public static void main(String args[])
	{
	Scanner se=new Scanner(System.in);
	System.out.println("Enter size of array:");
	int size=se.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the elements of array");
	for(int i=0;i<size;i++)
		{
		arr[i]=se.nextInt();
		}
	for(int i=0;i<size;i++)
		{
		for(int j=i;j<size;j++)
			{
			if(arr[i]>arr[j])
				{
				int k=arr[j];
				arr[j]=arr[i];
				arr[i]=k;
				}
			}
		}
	System.out.println("The sorted array:");
	for(int i=0;i<size;i++)
		System.out.println(arr[i]);
	}
}