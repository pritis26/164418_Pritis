import java.util.*;
public class Passresult {
public static void main(String args[])
{
	int sub1,sub2,sub3;
	int pass,promoted,fail;
Scanner enter=new Scanner(System.in);
System.out.println("enter 3 subjects marks");
sub1=enter.nextInt();
sub2=enter.nextInt();
sub3=enter.nextInt();

if(sub1>60&&sub2>60&&sub3>60)
{
	System.out.println("you are pass");
}
else
	if(sub1>60&&sub2>60||sub2>60&&sub3>60||sub1>60&&sub3>60)
{
	System.out.println("you are promoted");
}
	else
		{
		System.out.println("you are fail");
		}


}
}
