package ChoiceTheme;
class College{
	
	void applicationForm() {
		System.out.println("First Name is______");
		System.out.println("Last Name is________");
		System.out.println("Date of Birth_______");
		}
	void submitProof(String Certificates,String AllotmentOrder) {
		System.out.println("Certificates....... "+Certificates+ " and AllotmentOrder...."+AllotmentOrder);
	}
	String idCard() {
		return "idCard_No";
	}
	String deposited(int amount) {
		System.out.println("College fee is "+amount);
		return "deposited";
	}
}

public class MethodCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        College R =new College();
        R.applicationForm();
        R.submitProof("B.tech Graduated " , "Seat is Alloted");
        
		 System.out.println("18C61A0116____"+R.idCard());
         System.out.println(""+R.deposited(20000));

		
	}

}
