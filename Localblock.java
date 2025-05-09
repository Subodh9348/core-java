class Localblock 
{
	/*case1..............................................
	static void m1(){
		int p=20;
		{
			int q=30;
		}
		//q=40; CE:-here we are not recreating or assinging..
		int q=40;
		System.out.println(p);
		System.out.println(q);
	}
	
	
	public static void main(String[] args) 
	{
		m1();
		System.out.println("Hello World!");
	}*/
	
	 /*case2:------------------------------------------------------
		 void m1(){
		 LB1:{
			 System.out.println("in local block 1");
			 LB2:{
				 System.out.println("in local block 2");
				 for(int i=1;i<=10;i++){
					 System.out.println("in loop:"+i);
					 if(i==5){
						 //break;
						 //break LB1;
						 break LB2;
					 }
				 }
				 System.out.println("after local block 2");
			 }
			 System.out.println("after local block 1");
		 }
		 
	 }
	 
	 public static void main(String[] args) 
	{
		//m1();
		System.out.println("Hello World!");
		Localblock lb=new Localblock();
		lb.m1();
	}
	......................................................................*/
	//case3:----------
	/*static void m1(){
		int p=10;
		{
			//int p=30;  //we can access method level LV inside a Local Block either for reading or modifying its
			p=30;		//value .if we assign a new value to a method level local variable ,that value is stored inside
			int q=20;	//inside the same memory that is created at method level before local block as shown in the pgm.
		}
		//int p=40;
		p=40;
		int q=50;
	}
	
	public static void main(String[] args) 
	{
		m1();
		System.out.println("Hello World!");
	}*/
	//case4:----------
	static void m1(){
		int p=10;
		{
			System.out.println(p);
			p=20;
			System.out.println(p);
		}
		System.out.println(p);
	}
	
		
	public static void main(String[] args) 
	{
		m1();
		System.out.println("Hello World!");
	}
}
