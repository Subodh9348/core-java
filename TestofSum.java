import java.util.Scanner;
/*class TwoDigitSum 
{
	
	public static int getSumDigits(int number){
	
	//System.out.println(a+b);
	int firstnumber=number/10;
	int secondnumber=number%10;
		
		return firstnumber+secondnumber;
	}
	
}
class TestofSum
{
	public static void main(String[] args) 
	{
		TwoDigitSum ts=new TwoDigitSum();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int result=ts.getSumDigits(number);
		System.out.println("the number is :"+number+":and the sum of two digit  is:"+result);
		
		
		
	}
}
===============================================================================*/
class TwoDigitDifference 
{
	
	public static int getDiffDigits(int number){
	
	//System.out.println(a+b);
	int firstnumber=number/10;
	int secondnumber=number%10;
		
		return firstnumber-secondnumber;
	}
	
}
class TestofSum
{
	public static void main(String[] args) 
	{
		TwoDigitDifference ts=new TwoDigitDifference();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int result=ts.getDiffDigits(number);
		System.out.println("the number is :"+number+":and the Differnece of two digit  is:"+result);
		
		
		
	}
}

