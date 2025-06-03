/*
	Types of polymorphism:
		1.compile time polymorphsm/static binding
		2.Run time polymorphism/dynamic binding
*/
class Types_Of_Polymorphism
{
	static void m1(){
		System.out.println("Ex m1");
	}
	void m2(){
		System.out.println("Ex m2");
	}
	void m3(){
		System.out.println("Ex m3");
	}
	final void m4(){
		System.out.println("Ex m4");
		m5();
	}
	private void m5(){
		System.out.println("Ex m5");
	}
}
class Sample extends Types_Of_Polymorphism {
	static void m1(){
		System.out.println("sample m1");
	}
	void m2(){
		System.out.println("sample m2");
	}
	private void m5(){
		System.out.println("sample m5");
	}
}
class Test_of_Polymorphism{
	public static void main(String[]args){
		Types_Of_Polymorphism tp=new Sample();
		tp.m1();//compile time polymorphism
		tp.m2();//run time polymorphism
		tp.m3();//compile time polymorphism
		tp.m4();//compile time polymorphism
		//tp.m5();
	}
}


