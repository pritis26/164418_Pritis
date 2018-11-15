import java.util.*;
public class Checkarmstrong {
	
		public static void main(String[] args)
		{
			int n,temp,rem;
			
			System.out.println("Enter num");
			Scanner s=new Scanner(System.in);
			n=s.nextInt();
			temp=n;
			int r=0;
			while(temp!=0)
			{
				
				rem=temp%10;
				r=r+(rem*rem*rem);
				temp=temp/10;
			}
			if(n==r)
				System.out.println("the number "+n+" is Armstrong");
			else
				System.out.println("the number is not a Armstrong");
		}
	}
