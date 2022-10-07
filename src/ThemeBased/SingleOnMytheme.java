package ThemeBased;
import java.util.Scanner;

class Hr{
	
	int a;

	Scanner sc=new Scanner(System.in);
	
	void person() {
		
		System.out.println("Enter the HR salary: ");
		a=sc.nextInt();
		}
	void person2() {
		System.out.println("Salary and Bonus =... "+(a+(a/2)));
	}
	
}

class Teamleader extends Hr{
	
	int b;
	
	void person3() {
		System.out.println("Enter Teamleader salary: ");
		b=sc.nextInt();
	}
	void sum() {
		
		System.out.println("Toatal Amount Company paid 😊= "+(a+b));
	}
}
public class SingleOnMytheme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Teamleader R =new Teamleader();
       R.person();
       R.person2();
       R.person3();
       R.sum();
	}

}
