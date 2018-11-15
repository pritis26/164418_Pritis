import java.util.*;
public class Armstrongprint {
public static void main(String args[])
{
	int i,temp,rem;
	for(i=100;i<=999;i++)
	{
		int r=0;
		temp=i;
		while(temp!=0)
		{
			
			rem=temp%10;
			r=r+(rem*rem*rem);
			temp=temp/10;
		}
		if(r==i)
		{
			System.out.println(i);
		}
	}
}
}
