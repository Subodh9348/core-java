class OperatorPerform 
{
	int m1(){
		return 50;
	}
	public static void main(String[] args) 
	{
		
	int i1=20;
	String s1="sn";
	Operator o1=new Operator();
	int i2;
	String s2;
	Operator o2;
	i2=10;
	s2="sn1";
	o2=new Operator();
	System.out.println(i1+""+s1+""+o1);
	System.out.println(i2+""+s2+""+o2);
	int i3,i4,i5;
	i3=i4=i5=60;
	System.out.println(i3+""+i4+""+i5);
	//10=10;
	//i6=20;
	int i7;
	i7=20;
	int i8=30;
	int i9=i8;
	int i10=10+20+i9;
	//int i11=m1();
	Operator o3=new Operator();
	
	//int i12=true;
	//int i13="a";
	//int i14=new Operator();
	//int i15=10.5;
	//int i16=50L;
	int i17=500;
	//int i18='a';
	//int i19=true;
	//int i20=(int)true;
	int i21;
	i21=50;
	int i22=(i21=50);
	System.out.println(i21);
	System.out.println(i22);
	int i23=20+(i22=30);
	
	}
}
class Operator
{
	int x=5;
	int y=7;
	
}