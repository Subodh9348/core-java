class ConditionalStatements 
/*{
	static void m1(int a){
		System.out.println("hi");
		if(a==11){
		System.out.println("hello");
		}
		System.out.println("Hru?");
		System.out.println("a:"+a);
	}
	public static void main(String[] args) 
	{
		m1(11);
		m1(15);
	}
}*/

{
	static void m1(boolean a){
		System.out.println("hi");
		if(a==false){
		System.out.println("hello");
		}
		System.out.println("Hru?");
		System.out.println("a:"+a);
	}
	public static void main(String[] args) 
	{
		m1(false);
		m1(true);
	}
}
