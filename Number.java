class Main 
{
	public static void main(String[] args) 
	{
		Number n=new Number();
		System.out.println(n);
		System.out.println();
		System.out.println(n.a);
		System.out.println(n.b);
		System.out.println(n.c);
		System.out.println(n.s);
		System.out.println(n.l);
		System.out.println(n.l[0]);
		System.out.println(n.l[1]);
				
		
	}
}
class Number
{
	int a=12;
	double b=12.8;
	char c='a';
	String s="subodh";
	long[] l={2,4};
}
