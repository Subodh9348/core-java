import java.util.Scanner;
class Bike 
{
	
	private int gear;
	public void setGear(int gear){
		if(gear<0 || gear>5){
			System.out.println("enter the number between 0-5");	
		}
		else{
			
			
			this.gear=gear;
		}
	}
	public int getGear(){
		
		//System.out.println("bike is running on gear number"+this.gear);
			return this.gear;
		}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Bike bk=new Bike();
		System.out.println("Hello World!");
		while(true){
		System.out.println("enter the gear number:");
		int gearno=sc.nextInt();
			if(gearno>=0 && gearno<=5){
				bk.setGear(gearno);
				break;
			}else{
				System.out.println("enter the correct number..");
			}
		}
		
		System.out.println("bike is running on gear number:"+bk.getGear());
	}
}
