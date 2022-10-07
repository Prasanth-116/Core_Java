package ChoiceTheme;

class Travelling {
	void from () {
		
		System.out.println(" Starting at HYD...");
		System.out.println("I am going to Joining in IT company at Bengalore....");
	
		Destination P=new Destination();
	    P.to();
	}
	
	class Destination{
		void to() {
			System.out.println(" My Destination is Bengalore....");
			}
	}
}
public class Nestedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Travelling R=new Travelling();
      R.from();
      
      
	}

}








