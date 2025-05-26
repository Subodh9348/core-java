class Bank 
{
	void deposit(double cash){
		System.out.println("cash deposited..");
	}
	void deposit(String cheque){
		System.out.println("cheque deposited..");
	}
	void payinterest(){
		System.out.println("hdfc bank payinterest...");
	}
	
}
class Hdfc extends Bank
{
	void deposit(double cash){
		System.out.println("hdfc bank cash deposited...");
	}
	void payinterest(){
		System.out.println("hdfc bank payinterest...");
	}
}
class Polymorphism
{	
	public static void main(String[] args) 
	{
		Bank bank=new Bank();
		bank.deposit(5000);
		System.out.println("...................");
		Hdfc bank1=new Hdfc();
		bank1.deposit(5000);
		System.out.println("...................");
		Bank bank2=new Hdfc();
		bank2.deposit(5000);
		bank2.payinterest();
		
	}
}
