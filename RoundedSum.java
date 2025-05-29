import java.util.Scanner;
class RoundedSum 
{
	
	public static int sumOfRoundedValues(int number1,int number2,int number3){
		return number1+number2+number3;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int number1=sc.nextInt();
		System.out.println("Enter the second number");
		int number2=sc.nextInt();
		System.out.println("Enter the third number");
		int number3=sc.nextInt();
		int result=RoundedSum.sumOfRoundedValues(number1,number2,number3);
		
		System.out.println("the number is:"+number1+","+number2+","+number3+" the result is :"+result);
	}
}
