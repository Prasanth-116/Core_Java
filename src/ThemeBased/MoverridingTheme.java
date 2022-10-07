package ThemeBased;
class Accounts{
	
	void salary() {
		System.out.println(" Salary Of Sr.Manager is...$65000 ");
		
	}
	void bonus() {
		System.out.println(" Bonus For Manager is...... $20000 ");
		System.out.println("___________________");

	}
}

class HrSection extends Accounts{
	
	void salary () {
		System.out.println(" Salary Of HR is...... $40000 ");
		
	}
	void bonus() {
		System.out.println(" Bonus For HR is....... $20000 ");
		System.out.println(" ___________________ ");

	}
}
class Teams extends HrSection{
	
	void salary() {
		System.out.println(" Salary Of Teamleader is.....$35000 ");
		}
	void bonus() {
		System.out.println(" Bonus For Teamleader is..... $20000 ");
		System.out.println(" ___________________ ");
 
	}
	
	
}
public class MoverridingTheme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Accounts R=new Teams();
       R.salary();
       R.bonus();
       R=new HrSection();
       R.salary();
       R.bonus();
       R=new Teams();
       R.salary();
       R.bonus();
       
	}

}
