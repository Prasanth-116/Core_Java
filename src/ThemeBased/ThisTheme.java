package ThemeBased;
class Nani{
	String name;
	static int investment;
     float loss;
	int eid;
	double salary;
	
	
	Nani(int eid,double salary,float loss){
		this(100000);
		this.eid=eid;
		this.loss=loss;
		this.salary=salary;	
  }
	Nani(int investment){  
		Nani.investment=investment;
		
		}
void show() {
	
	System.out.println("My Id=..."+eid);
	System.out.println("salary= "+salary);
	System.out.println("loss is=.. "+loss);
	System.out.println("Investment="+investment);
}
}
public class ThisTheme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Nani R=new Nani(116,30000,2500.0f);
       Nani P=new Nani(109,25000,4000.5f);
       R.show();
      P.show();
       
	}

}
