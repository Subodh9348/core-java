import java.util.Scanner;
class Calculator
{
	public int add(int a,int b){
		return a+b;
	}
	public double add(double a,double b){
		return a+b;
	}
	public int multiply(int a,int b){
		return a*b;
	}
	public double multiply(double a,double b){
		return a*b;
	}
	
	

	
	public static void main(String[] args) 
	{
		Calculator cl=new Calculator();
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("sum of number is:"+cl.add(a,b));*/
		System.out.println("sum of number is:"+cl.add(10.5,20.5));
		System.out.println("multiplication of number is:"+cl.multiply(5,6));
		System.out.println("multiplication of number is:"+cl.multiply(3.7,6.8));
		System.out.println("sum of number is:"+cl.add(-10,20));
		
		
	}
}
