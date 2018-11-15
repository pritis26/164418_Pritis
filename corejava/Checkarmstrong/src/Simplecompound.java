import java.util.*;
public class Simplecompound {
public static void main(String args[])
{
	int principle,rate,period;
	int simpleint;
	double compoundint;
	Scanner input=new Scanner(System.in);
	System.out.println("enter principle,rate and period");
		principle=input.nextInt();
		rate=input.nextInt();
		period=input.nextInt();
		
		simpleint=(principle*rate*period)/100;
		System.out.println("simple interest is:"+simpleint);
		 double amount = principle * Math.pow(1 + (rate /period), period);
		compoundint=amount - principle;
		System.out.println("compound interest is:"+compoundint);

				
		
	
}
}
