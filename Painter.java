 //abstraction
 abstract class Shape 
{
	abstract void findArea();
}
//inheritance
class Rectangle extends Shape
{
	private double l; //encapsulation
	private double p;
	void findArea(){//polymorphism
		System.out.println("Rectangle area");
	}
}
class Square extends Shape
{
	void findArea(){ //polymorphism
		System.out.println("Square  area");
	}
}
class Circle extends Shape
{
	void findArea(){
		System.out.println("Circle Area");
	}
}
class Painter
{
	public static void main (String[]args){
		Shape s1; //lc
	s1=new Rectangle(); //message passing
	s1.findArea(); //runtime polymorphism OR DB
	s1=new Square(); //message passing
	s1.findArea(); //RP
	s1=new Circle();
	s1.findArea();
	}
}
		
	