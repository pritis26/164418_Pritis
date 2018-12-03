package assignment1.com;



public class Arithmetic {
public static void main(String[] args) {
	Calculate add=(num1,num2)->(num1+num2);
	Calculate sub=(num1,num2)->(num1-num2);
	Calculate mul=(num1,num2)->(num1*num2);
	Calculate div=(num1,num2)->(num1/num2);
	System.out.println(add.calculate(15, 20));
	System.out.println(sub.calculate(15, 20));
	System.out.println(mul.calculate(15, 20));
	System.out.println(div.calculate(40, 20));
	
}
}