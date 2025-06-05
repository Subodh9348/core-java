interface Bike
{
	abstract void details();
}
interface Car
{
	abstract void details();
}
class Honda implements Bike,Car{

	public void details(){}
	Honda(){
		super();
	}
	void showDetails(){
		details();
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	
}
	

