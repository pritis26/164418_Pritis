package Assignment;

import java.util.Scanner;

public class Question9 {
public static void main(String args[])
{
	int sum1=0;
	int sum2=0;
			int sum3 = 0;
	Scanner scanner = new Scanner(System.in);
	int student[]=new int[3];
	System.out.println("Enter subject mark for student1");
	for(int i=0;i<3;i++)
	{
		student[i]=scanner.nextInt();
		sum1=sum1+student[i];
	}
	float avg1=sum1/3;
	System.out.println("Average:"+avg1);
	int student2[]=new int[3];
	System.out.println("Enter subject mark for student1");
	for(int i=0;i<3;i++)
	{
		student2[i]=scanner.nextInt();
		sum2=sum2+student2[i];
	}
	float avg2=sum2/3;
	System.out.println("Average:"+avg2);
	int student3[]=new int[3];
	System.out.println("Enter subject mark for student3");
	for(int i=0;i<3;i++)
	{
		student3[i]=scanner.nextInt();
		sum2=sum2+student3[i];
	}
	float avg3=sum3/3;
	System.out.println("Average:"+avg3);
	
}
}
