package Practice;
   class Cars{
	void cost() {
		System.out.println(" No Cost");	
	}
	
	void milage() {
		System.out.println(" No Milage");
	}
}

class audis extends Cars{
	
	void cost() {
		System.out.println(" Audi cost is....50lakhs");
	}
	
	void milage() {
		System.out.println(" Audi Milage is...10kms");
	}
	 
}

class tata extends audis{
	
	void cost() {
		System.out.println(" Bmw cost is...40lakhs");
	}
	
	void milage() {
		System.out.println(" Bmw Milage is...15kms");
	}
	 
	
}
public class Moverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Cars R=new Cars();
         R.cost();
         R.milage();
         
         R=new audis();
         R.cost();
         R.milage();
         
         R=new tata();
         R.cost();
         R.milage();
	}

}
