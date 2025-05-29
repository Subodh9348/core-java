import java.util.Scanner;
class NextMultipleOfHundred 
{
	public static int getNextMultipleOfHundred(int number){
		int remainder=number%100;
		if(remainder==0){
			return number+100;
		}else{
			return number+(100-remainder);
		}
		
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int result=NextMultipleOfHundred.getNextMultipleOfHundred(number);
		System.out.println("the number is:"+number+":return is:"+result);
	}
}
