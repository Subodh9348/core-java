import java.util.Scanner;
class AmountOfSalary 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the salary");
		int salary=sc.nextInt();
		System.out.println("enter the percentage");
		int percentage=sc.nextInt();
		int result=(salary*percentage)/100;
		System.out.println("increment sal:"+(salary+result));
	}
}
class Salary
{
	int salary;
	int percentage;
	int result;
	int incrementSal;
}