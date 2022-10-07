package Practice;
  class Employe{
	int eid;
	double salary;
	  
	Employe(){
		eid=116;
		salary=30000;
			}
void show() {
	System.out.println("Id="+eid);
	System.out.println("salary="+salary);
}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employe R=new Employe();
        R.show();
        
	}

}

