class Student extends Person 
{
	private static String institute;
	private int sno;
	private String course;
	private double fee;
	
	static{	
		institute ="Nit";
	}
	public Student(String name,double height,double weight,int sno,String course,double fee){
		super(name,height,weight);//passing to super class constructor to intializing properties in
		this.sno=sno;									//super class
		this.course=course;	
		this.fee=fee;									//intitializing propperties in sub class...
	}
	public static void setInstitute(String institute){
		Student.institute=institute;
	}
	public String getInstitute(){
		return institute;
	}
	public  void setSno(int sno){
		this.sno=sno;
	}
	public int getSno(){
		return sno;
	}
	public  void setCourse(String course){
		this.course=course;
	}
	public String getCourse(){
		return course;
	}
	public void setFee(double fee){
		this.fee=fee;
	}
	public double getFee(){
		return fee;
	}
	
	public void  listen(){
		System.out.println(getName()+"is listening"+course+"topic..");
	}
	public void reply(){
		System.out.println(getName()+"is replying on"+course+"topic..");
	}
	public void write(){
		System.out.println(getName()+"is writing about on"+course+"topic");
	}
	public void read(){
		System.out.println(getName()+"is reading on"+course+"subject..");
	}
	@Override
		public String toString(){
		return super.toString()+"\n"+
			"student details"+     "\n"+
			"institute:"+institute+"\n"+
			"sno:"      +sno+      "\n"+
			"course:"   +course+   "\n"+
			"fee:"      +fee;
	}
}
