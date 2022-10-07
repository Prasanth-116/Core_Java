package ThemeBased;

abstract class Company{
	
	
	abstract void code();
      abstract void strength(); 
		
      void  time() {
  		System.out.println("3 Months");
}
}
class Branch extends Company{
	
	void code() {
		System.out.println(" The code Brach is 116....");
	}
	void strength() {
		System.out.println(" 10 Members worked...");
		System.out.println("__________*__________");
		
	}
}
class HeadOffice extends Branch{
	
	void code() {
		System.out.println(" Branch Code is 126....");
	}
	void strenth() {
		System.out.println(" 20 Members are worked...");
		
	}
	
	}

public class Abstract2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Company R;
         R=new Branch();
         R.time();
         R.code();
         R.strength();
         R=new HeadOffice();
         R.time();
         R.code();
         R.strength();

         
	}

}





