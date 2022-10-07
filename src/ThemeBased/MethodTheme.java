package ThemeBased;
 class Organization{
	
	void form() {
		System.out.println("Details age_name");
		}
	void submitProof(String OfferLetter,String Certificates) {
		System.out.println("OfferLetter is "+OfferLetter+"Certificates are "+Certificates);
	}
	String companyId() {
		return "companyId";
	}
	String credite(int amount) {
		System.out.println("Monthly Salary is given "+amount);
		return "credite";
	}
}


public class MethodTheme {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Organization P =new Organization();
         P.form();
         P.submitProof(" OfferLetter " ," B.tech Qualified ");
     
		 System.out.println("Company given "+P.companyId());
         System.out.println("Salary "+ P.credite(20000));
		
	}

}


	