package assignment5.com;

import java.util.Arrays;
import java.util.List;


public class Stringbuilderass {
public static void main(String[] args) {
	List<String> names=Arrays.asList("priti","swati","chaitali","anupam");
	Character[] names2=names.stream().map(index->index.charAt(0)).toArray(Character[]:: new);
	
	for (Character index:names2){
		System.out.println(index);
	}
}
}
