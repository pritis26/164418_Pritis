package assignment4.com;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Removeelement {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<5;i++){
	String element=sc.next();
	list.add(element);
	
}
	list.removeIf(st->((st).length())%2!=0);
	System.out.println(list);
}
}
