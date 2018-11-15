import java.util.*;
public class Taxammount {
public static void main(String args[])
{ int ctc;
System.out.println("enter your CTC");
	Scanner input=new Scanner(System.in);
	ctc=input.nextInt();
	if(ctc>=0 && ctc<=180000)
	{
		System.out.println("no tax");
	}
	else
		if(ctc>=181001 && ctc<=300000)
	{
		
		
					System.out.println("tax is:"+ctc*0.1);
	}
		else
			if(ctc>=300001 && ctc<=500000)
			{
				
				float tax=(20/100)*ctc;
							System.out.println("tax is:"+ctc*0.2);
			}
			else
				if(ctc>=500001 && ctc<=1000000)
				{
					
					float tax=(30/100)*ctc;
								System.out.println("tax is:"+ctc*0.3);
				}
}
}
