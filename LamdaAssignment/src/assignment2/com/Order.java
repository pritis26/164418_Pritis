package assignment2.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;




public class Order {
public static void main(String[] args) {
	List<Orderdetails> order=new ArrayList<Orderdetails>();
	Orderdetails order1=new Orderdetails("Chicken biryani",10000, "ACCEPTED");
	Orderdetails order2=new Orderdetails("Tandoori", 14000, "ACCEPTED");
	
	Orderdetails order3=new Orderdetails("Chicken Lollypop", 9000, "COMPLETED");
	Orderdetails order4=new Orderdetails("Chicken kadai", 20000, "ACCEPTED");
	

	order.add(order1);
	order.add(order2);
	order.add(order3);
	order.add(order4);
	
	Predicate<Orderdetails> check=(orders)->{
		boolean test=orders.getOrderstatus().compareTo("ACCEPTED")==0 || orders.getOrderstatus().compareTo("COMPLETED")==0;
	
	if(orders.getItemprice()>=10000&&test)
		return true;
	else 
		return false;
		
	};
	
	Iterator<Orderdetails> itr=order.iterator();
	while(itr.hasNext()){
		Orderdetails orderlist=itr.next();
		if(check.test(orderlist)){
			System.out.println(orderlist);
		}
	
	
	
	
}

}}
