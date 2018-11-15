package Assignment;

import java.util.Scanner;

public class Question7 {
	public static void main(String args[])
	{
		int numbers[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int i,len,search;
		int flag=0;
		len=numbers.length;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the element to search:");
		for(i=0;i<=len-1;i++)
		{
			
			search=scanner.nextInt();
			for(i=0;i<len;i++)
			{
				if(numbers[i]==search)
				{
					flag=1;
					break;
				}
				else
				{
					flag=0;
				}
			}
			if(flag==1)
			{
				System.out.println("Element found at index:"+(i));
			}
			else
			{
				System.out.println("Elemnet not found");
			}
		}
		
		
		
	}

}
