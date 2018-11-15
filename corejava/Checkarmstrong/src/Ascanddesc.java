import java.util.Scanner;


public class Ascanddesc {
int numbers[]=new int[5];
public  void getvalue()
{
	System.out.println("enter numbers");
	Scanner s=new Scanner(System.in);
	for(int i=0;i<5;i++)
		{
		numbers[i]=s.nextInt();
		}
	asc();
	dsc();
	biggest();
	smallest();
}
public void asc(){
	int i=0;
	System.out.println("Ascending order");
	for (int j = i + 1; j < 5; j++) 
    { int temp;
        if (numbers[i] > numbers[j]) 
        {
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
    }
	show();
}
public void show()
{
	int i=0;
	for(i=0;i<5;i++)
	System.out.println(numbers[i]);
}
public void dsc(){
	System.out.println("descending is");
	for(int  i=0;i<5;i++)
	{
		
		for (int j = i + 1; j < 5; j++) 
        {int temp;
            if (numbers[i] < numbers[j]) 
            {
                temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        } 
	}
	show();
}
public void biggest(){
	int i,largest = numbers[0];
	 
    for (i = 1; i < 5; i++) 
    {
	if (largest < numbers[i])
		largest = numbers[i];
}
    System.out.println("biggest element is:"+largest);
}
public void smallest()
{
	int i,smallest=numbers[0];
	for(i=1;i<5;i++)
	{
		if(smallest > numbers[i] )
		{
			smallest = numbers[i]; 
		}
	}System.out.println("smallest element is:"+smallest);
}

}
