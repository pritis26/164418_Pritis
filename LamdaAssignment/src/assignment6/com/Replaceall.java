package assignment6.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Replaceall {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	List<String> list=new ArrayList<>();
	System.out.println("Enter elements to be in string list");
	for(int i=0;i<5;i++){
		String element=sc.next();
		list.add(element);
		
	}
	System.out.println("Original string list"+list);
	 UnaryOperator<String> replaceletter = (x) -> x.toUpperCase();
list.replaceAll(replaceletter);
System.out.println("string list in upper list"+list);
	}
}