import java.util.Scanner;
class VotingAge 
{
	private int age;
	public void setAge(int age){
		if(age<18){
			System.out.println("you are not eligible for voting..");	
		}
		else{
			
			
			this.age=age;
		}
	}
	public int getAge(){
		
		//System.out.println("bike is running on gear number"+this.gear);
			return this.age;
		}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		VotingAge vage=new VotingAge();
		System.out.println("Hello World!");
		while(true){
		System.out.println("enter the age of the voter..");
		int voterage=sc.nextInt();
			if(voterage>=18){
				vage.setAge(voterage);
				break;
			}else{
				System.out.println("you are not eligible..");
			}
		}
		
		System.out.println("your age is:"+vage.getAge()+":eligible for voting..");
}
	
}
