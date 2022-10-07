package ThemeBased;
class Ceo{
	
	void manager() {
		
		System.out.println("Below of CEO....");
		
	}
}
class Manager extends Ceo{
	
	void teamlead() {
		System.out.println("Head of Teams...");
	}
}
class Teamlead extends Ceo{
	 void team() {
		  System.out.println("They Works on Projects.....");
	 }
}
public class Hierarichal {

	public static void main(String[] args) {
		
		Ceo R= new Ceo();
		Manager P=new Manager();
		Teamlead K=new Teamlead();
		R.manager();
		P.teamlead();
		K.team();
	

	}

}
