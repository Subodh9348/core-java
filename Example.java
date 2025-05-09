class Example 
{
/*	static Example e1=new Example();
	static{
		System.out.println("Static block...");	//3.
	}
	
	{
		System.out.println("Non Static Block...");//1.non static block have chance to execute only when object created..
												//5.
	}
	Example(){
		System.out.println("Constructor...");	//2.constructor executed..
	}											//6...
	
	public static void main(String[] args) 
	{
		System.out.println("main method...");//4.
	Example e2=new Example();
	}
	static int a=20;
	int x=20;
	//............................................................................*/
	
	/*static int a=10;
	static{
		System.out.println("Example static block1...");	
	}
	static int b=20;
	static {
		System.out.println("Example static block 2...");	
	}
	public static void main(String[]args){
		System.out.println("main method...");	
	}
	static{
		System.out.println("Example static block 3...");	
	}
	static int c=30;
	...........................................................*/
	
	/*static int a=10;
	static{
		System.out.println("Staic block...");	
	}
	......................................................................*/
	
	/*static int a=m1();
	static int m1(){
		System.out.println("Static variable 1");	
		return 10;
	}
	static {
		System.out.println("Static block 1");	
	}
	static int b=m2();
	static int m2(){
		System.out.println("Static variable 2");	
	
	return 20;
	}
	static void m4(){
		System.out.println("static method..");	
	}
	public static void main (String[]args){
		System.out.println("main method...");
		Example.m4();
	}
	static int c=m3();
	static int m3(){
	System.out.println("Static variable 3..");
	return 20;
	}
	static {
		System.out.println("Static block 4");	
		
	}
	..................................................................*/
	
	static Example e1=new Example();
	static{
		System.out.println("Static block start..");	
		Example e2=new Example();
		System.out.println("Static block end..");
	}
	Example(){
		System.out.println("Non parameterized constructor..start");	
		Example e3=new Example(5);
		System.out.println("Non parameterized constructor..end..");
	}
	Example(int x){
		System.out.println("interface parameterized constructor...");	
	}
	static int a=m1();
	static int m1(){
		System.out.println("Static variable initialized..");	
		return 10;
	}
	int x=m2();
	int m2(){
		System.out.println("non static variable initialized..");	
		return 30;
	}
	static {
		System.out.println("static block 2 executed..");	
	}
	{
		System.out.println("non static block executed..");	
	}
	public static void main (String []args){
		System.out.println("main start..");	
		Example e3=new Example();
		m3();
		e3.m4();
		System.out.println("main end...");
	}
	static void m3(){
		System.out.println("m3 start..");
		Example e5=new Example();
		System.out.println("m3 end...");
	}
	void m4(){
		System.out.println("m4 start..");	
		Example e6=new Example();
		System.out.println("m4 end...");
	}
	static void m5(){
		System.out.println("m5 start..");	
		Example e7=new Example();
		System.out.println("m5 end..");
	}
	static int b=20;
	int y=30;
	static{
		System.out.println("static block 3 executed..");	
	}
	{
		System.out.println("Non static block 2 executed..");	
	}
	static Example e8=new Example(5);
	
	
}
