package assignment3.com;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Functionalinterfaceass {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int percentage=sc.nextInt();
	Predicate<Integer> predict=num->(num>20);
	System.out.println("you are pass or fail?"+predict.test(percentage));
	
	Function<Integer,Integer> bonus=num->(num+5);
	System.out.println("new marks are"+bonus.apply(percentage));
	
	Consumer<Integer> acceptit=i->{
		if(percentage<30)
		{
			System.out.println("you are fail");
			
		}
		else
			{
			System.out.println("you are pass");
			}
			
};
acceptit.accept(percentage);

}
}