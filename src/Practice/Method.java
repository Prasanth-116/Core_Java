package Practice;
     
  class Bank{
	
	void form() {
		System.out.println("Details age_name");
		}
	void submitProof(String Aadhar,String pan) {
		System.out.println("Aadhar"+Aadhar+"pan"+pan);
	}
	String passBook() {
		return "passBook";
	}
	String deposite(int amount) {
		System.out.println("Amount given"+amount);
		return "deposited";
	}
}

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Bank R =new Bank();
         R.form();
         R.submitProof(" aadhar:7177129480589 " ," Pan:54527245547 ");
        System.out.println("Bank given "+ R.passBook());
        System.out.println("Amount "+ R.deposite(500));
         
	}

}
