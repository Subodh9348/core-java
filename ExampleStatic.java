class ExampleStatic 
{
	static int a=10;
	static{
		System.out.println("From Static block...");	
		System.out.println("a:"+a);
		//System.out.println("b:"+b);
		//System.out.println("a:"+ExampleStatic.b);
		b=50;
		//System.out.println("b:"+b);
		System.out.println("b:"+ExampleStatic.b);
	}
	static void m1(){
	System.out.println("From Static method...");
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	//m1();
    }
	public static void main(String[] args) 
	{
		System.out.println("main method started..");
		System.out.println("a:"+a);
		System.out.println("a:"+b);
		m1();
	}
	static int b=22;
	//static int b;
//..........................................................................*/
/*	static int a=10;
	static int b=a;
	//static int c=d;
	static int d=20;

	public static void main(String[]args){
	System.out.println(a);
	System.out.println(b);
	//System.out.println(c);
	System.out.println(d);
	


	}..............................................*/
}
