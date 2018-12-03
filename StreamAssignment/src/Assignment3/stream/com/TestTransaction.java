package Assignment3.stream.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestTransaction {
public static void main(String[] args) {
	Trader trader1=new Trader("priti", "mumbai");
	Trader trader2=new Trader("shubham", "Banagalore");
	Trader trader3=new Trader("anki", "mysore");
	Trader trader4=new Trader("priyanka", "chennai");
	
	Transaction t1=new Transaction(trader1, 2011, 10200);
	Transaction t2=new Transaction(trader2, 2010, 15200);
	Transaction t3=new Transaction(trader3, 2012, 20200);
	Transaction t4=new Transaction(trader4, 2011, 23200);
	List<Transaction> list=new ArrayList<>();
	
	list.add(t1);
	list.add(t2);
	list.add(t3);
	list.add(t4);
	 
	Stream<Transaction> st=list.stream();
	st.filter(c->c.getYear()==2011).forEach(System.out::println);
	System.out.println(list.stream().map(i->i.trader.getCity()).distinct().collect(Collectors.toList()));

	System.out.println("list of traders in pune");
	System.out.println(list.stream().map(i->i.trader.getCity()=="pune").sorted().collect(Collectors.toList()));
	System.out.println("--------------------------------------------");
	list.stream().map(i->i.trader.getName()).sorted().forEach(System.out::println);

	list.stream().filter(i->i.trader.getCity()=="indore").map(i->i).forEach(System.out::println);
	list.stream().map(i->i.trader.getCity()=="delhi").collect(Collectors.toList());

		System.out.println(list.stream().filter(i->i.trader.getCity()=="delhi").map(i->i).collect(Collectors.toList()).toString());
		
		System.out.println("//////////////");
		;
		System.out.println("max is:"+list.stream().max(Comparator.comparing(Transaction::getValue)).get().getValue());
		
		System.out.println("minimum is:"+list.stream().min(Comparator.comparing(Transaction::getValue)).get().getValue());
	}
	
}

