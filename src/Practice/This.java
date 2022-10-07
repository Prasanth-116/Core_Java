package Practice;
class Emp{
	int eid;
	double salary;
	static String company;
	 
	
	Emp(int eid,double salary){
		this("Wipro......");
		this.eid=eid;
	    this.salary=salary;	
  }
	Emp(String company){
		Emp.company=company;
		}
void show() {
	
	System.out.println("Id= "+eid);
	System.out.println("salary= "+salary);
	System.out.println("Company= "+company);
}
}
public class This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Emp R=new Emp(116,2000);
       Emp P=new Emp(109,25000);
       R.show();
      P.show();
       
	}

}


