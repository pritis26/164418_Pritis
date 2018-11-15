package Assignment;

import java.util.Scanner;

public class Question8 {
public static void main(String args[])
{
	int number=0,temp=0;
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number of elements to sort");
	number=scanner.nextInt();
	int array[]=new int[number];
	System.out.println("Enter Elements");
	for(int i=0;i<number;i++)
	{
		
		array[i]=scanner.nextInt();
	}
	
	for(int i=0;i<number-1;i++)
	{
		for(int j=0;j<(number-i-1);j++)
		{
			if(array[j]>array[j+1])
			{
				   temp = array[j];
	               array[j] = array[j+1];
	               array[j+1] = temp;
	            
			}
		}
	}
	System.out.println("Sorted list of elements");
	
	for(int i = 0; i <number; i++) {
        System.out.print(array[i] + " ");
       
     }
}
}
