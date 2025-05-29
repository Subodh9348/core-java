import java.util.Scanner;
class Employee 
{
	private int eid;
	private String ename;
	private double salary;
	private int noOfProject;
	public Employee(int eid,String ename,double salary,int noOfProject){
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
		this.noOfProject=noOfProject;
	}
	public void setEid(int eid){
		this.eid=eid;
	}
	public int getEid(){
		return eid;
	}
	public void setEname(String ename){
		this.ename=ename;
	}
	public String getEname(){
		return ename;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public double getSalary(){
		return salary;
	}
	public void setNoOfProject(int noOfProject){
		this.noOfProject=noOfProject;
	}
	public int getNoOfProject(){
		
		return noOfProject;
	}
	public void calculate(){
		double updatesalary=salary;
		
		if(noOfProject>=5 && noOfProject<=10){
			
			System.out.println(updatesalary=salary+5000);
			
		}else if(noOfProject>=10 && noOfProject<=20){
			
			System.out.println(updatesalary=salary+10000);
			
		}else if(noOfProject>=20){
			
			System.out.println(updatesalary=salary+15000);
		}else{
			System.out.println("enter the valid project details..");
		}
		System.out.println("update balance is:"+updatesalary);
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the employee id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the employee name");
		String name=sc.nextLine();
		System.out.println("enter the employee salary");
		double salary=sc.nextDouble();
		System.out.println("enter the employee no of project");
		int project=sc.nextInt();
		Employee emp=new Employee(id,name,salary,project);
		int noOfProject=emp.getNoOfProject();
		
		
		
		System.out.println("employee id is:"+id+"\n"+"employee name is:"+name+"\n"+"employee salary is:"+salary+"\n"+"no of project is:"+noOfProject);
		emp.calculate();
	}
}
