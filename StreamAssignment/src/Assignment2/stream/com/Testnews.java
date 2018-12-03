package Assignment2.stream.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Testnews {
	public static void main(String[] args) {
		
	
	News news1=new News(1,"Priti","kajal","amazing");
	 News news2=new News(2,"swati","sweta","budget");
	 News news3=new News(3,"sneha","urvi","incredible");
	 News news4=new News(1,"Simer","drashti","budget is the budget");
	 News news5=new News(1,"priti","falguni","genius");
	 News news6=new News(4,"priyanja","karan","budget");
	 List<News> listed=new ArrayList<News>();
	 listed.add(news1);
	 listed.add(news2);
	 listed.add(news3);
	 listed.add(news4);
	 listed.add(news5);
	 listed.add(news6);
	 
	System.out.println(listed.stream().max(Comparator.comparing(News:: getComment)).get().newsid);
	System.out.println("\n");
	System.out.println("-------");
	System.out.println(listed.stream().filter(i->i.getComment().contains("budget")).count());
	System.out.println("\n");
	System.out.println("user");
	System.out.println(listed.stream().max(Comparator.comparing(News::getPostedByUser)).get().getPostedByUser());
	System.out.println("\n");
listed.stream().sorted(Comparator.comparing(News:: getCommentByUser)).map(i->i).forEach(System.out::println);
	
}
}
