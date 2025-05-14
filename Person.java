public class Person
{
	private static int eyes;//
	private static int ears;//
	private static int hands;//Encapsulation..
	private static int legs;//
	
	private String name;
	private double height;
	private double weight;
	
	static {
		eyes=2;
		ears=2;
		hands=2;
		legs=2;
		System.out.println("these are in the static block...");
	}
	private static int count;
	{
		count++;
	}
	public Person(String name,double height,double weight){
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	public static void setEyes(int eyes){
		Person.eyes=eyes;
	}
	public static int getEyes(){
		return eyes;
	}
	public static void setEars(int ears){
		Person.ears=ears;
	}
	public static int getEars(){
		return ears;
	}
	public static void setHands(int hands){
		Person.hands=hands;
	}
	public static int getHands(){
		return hands;
	}
	public static void setLegs(int legs){
		Person.legs=legs;
	}
	public static int getLegs(){
		return legs;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setHeight(double height){
		this.height=height;
	}
	public double getHeight(){
		return height;
	}
	public void setWeight(double weight){
		this.weight=weight;
	}
	public double getWeight(){
		return weight;
	}
	public void eat(){
		System.out.println(name+"is eating..");
	}
	public void sleep(){
		System.out.println(name+"is sleeping..");
	}
	public void learn(){
		System.out.println(name+"is learning..");
	}
	@Override
		public String toString(){
		return "personal details..\n"+
				"eyes:" +eyes+ "\n"+
				"ears:" +ears+ "\n"+
				"hands:"+hands+"\n"+
				"legs:" +legs+ "\n"+
				"name:" +name+ "\n"+
				"height:"+height+"\n"+
				"weight:"+weight;
	}
}
