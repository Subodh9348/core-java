class Final 
{
	static final int a=10;
	//final int x; CE: variable x not initialized in the default constructor
	final int x=20;
	static final int b;
	//static final int c;
	void m1(){
		final int q=20;
		//a=18;  CE: cannot assign a value to static final variable a
		 //x=16; CE:cannot assign a value to static final variable x
		// p=17; CE:canot find symbol
		//q=18; CE: cannot assign a value to static final variable q
		//b=30;
	}
	static{
		//x=10;
		b=20;
	}
	

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//System.out.println(Final.c);
	}
}
