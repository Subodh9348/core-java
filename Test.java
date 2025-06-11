class Test 
{
	/*public static void main(String[] args) 
	{
		try{
			int a= Integer.parseInt (args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println("result:"+c);
		}catch(Exception e){
			System.out.println("exception raised..");
		}
	}*/
	//.....................................................................
	//public static void main(String[]args){
	/*int a;
	try{
		a=10;
		System.out.println(a);
	}
	catch(ArithmeticException ae){
		System.out.println(a);
	}
	System.out.println(a);
	}*/
	//.....................................................................
	/*public static void main(String[]args){
	int b;
	try{
		b=10;
		System.out.println(b);
	}
	catch(ArithmeticException ae){
		b=20;
		System.out.println(b);
	}
	System.out.println(b);
	}*/
	//...............................................................
	/*public static void main(String[]args){
	int c;
	try{
		c=10;
		System.out.println(c);
	}
	catch(ArithmeticException ae){
		c=20;
		System.out.println(c);
	}
	finally{
		c=30;//wrong design
		System.out.println(c);
	}
	System.out.println(c);//always here we get 30
	}*/
	//..................................................................
	/*public static void main(String[]args){
	int c=0;
	try{
		c=10;
		System.out.println(c);
	}
	catch(ArithmeticException ae){
		c=20;
		System.out.println(c);
	}
	finally{
		//c=30;//wrong design
		System.out.println(c);
	}
	System.out.println(c);//always here we get 30
	}*/
	public static void main(String[]args){
	int c=0;
	try{
		//c=10/0;
		c=Integer.parseInt("c");
		System.out.println(c);
	}
	catch(ArithmeticException ae){
		c=20;
		System.out.println(c);
	}
	finally{
		
		System.out.println(c);
	}
	System.out.println(c);//always here we get 30
	}
}
