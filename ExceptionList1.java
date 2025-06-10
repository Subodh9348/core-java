class ExceptionList1 
{
	/*public static void main(String[] args) 
	{
		System.out.println("Main start..");
		m1();
		System.out.println("Main end..");
	}
	static void m1(){
		System.out.println("M1 start..");
		try{
		m2();
		}catch(ArithmeticException e){
			System.out.println("AE caught in m1");
		}
		System.out.println("M1 end..");
	}
	static void m2(){
		System.out.println("M2 start..");
		m3();
		System.out.println("m2 end..");
	}
	static void m3(){
		System.out.println("M3 start..");
		System.out.println(10/0);
		System.out.println("M3 end..");
	}*/
	//...........................................................
	/*public static void main(String[] args) {
		//ArithmeticException e=new ArithmeticException();
		ArithmeticException e=new ArithmeticException("/by zero");
		throw e;//throwing an exception manually by programmer..
		//System.out.println(10/0);
		//1.Arithmetic Exception
		//2.ArithmeticException e=new ArithmeticException("/ by zero");
		//3.throw e1
	}*/
	//.......................................................................
	/*static void m1(int num){
		if(num<=0){
			IllegalArgumentException e=new IllegalArgumentException("do not enter -ve numbers");
			throw e;
		}
		System.out.println(num);
	}
	public static void main(String[]args){
		ExceptionList1.m1(10);
		ExceptionList1.m1(-10);
		
	}*/
	//.............................................................................
	static void m1(int num) throws IllegalArgumentException{
		if(num<=0){
			IllegalArgumentException e=new IllegalArgumentException("do not enter -ve numbers");
			throw e;
		}
		System.out.println(num);
	}
	public static void main(String[]args){
		try{
		ExceptionList1.m1(10);
		ExceptionList1.m1(-10);
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
	}
}
