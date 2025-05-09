import java.util.Scanner;
class Switch 
{
	public static void main(String[] args) 
	/*{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Day between Sun-mon");
		int day=sc.nextInt();
		switch(day){
			case 1:
				System.out.println("sunday is 1st day");
			break;
			case 2:
				System.out.println("monday is 2nd day");
			break;
			case 3:
				System.out.println("tuesday is 3rd day");
			break;
			case 4:
				System.out.println("wednesday is 4th day");
			break;
			case 5:
				System.out.println("thuursday is 5th day");
			break;
			case 6:
				System.out.println("friday is 6th day");
			break;
			case 7:
				System.out.println("saturday is 7th day");
			break;
			default :
				System.out.println("this is wrong number,please enter between 1-7");
		}
	}*/
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Day between Sun-mon");
		String day=sc.next().toLowerCase();
		//String day=sc.next().toUpperCase(); if case is in capital letter
		switch(day){
			case "sun":
				System.out.println("sunday is 1st day");
			break;
			case "mon":
				System.out.println("monday is 2nd day");
			break;
			case "tue":
				System.out.println("tuesday is 3rd day");
			break;
			case "wed":
				System.out.println("wednesday is 4th day");
			break;
			case "thu":
				System.out.println("thuursday is 5th day");
			break;
			case "fri":
				System.out.println("friday is 6th day");
			break;
			case "sat":
				System.out.println("saturday is 7th day");
			break;
			default :
				System.out.println("this is a wrong day,please enter between sun-mon");
		}
	}
}
