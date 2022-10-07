package ThemeBased;
import java.util.Scanner;

class Square{
	int a;
	Scanner sc=new Scanner (System.in);
	void input() {
		System.out.println("Enter a value ");
		a=sc.nextInt();
	}
	void sqr() {
	System.out.println("Square= "+(a*a));
	
	}
}	
class 	Addition extends Square{
	  int b;
	void accept() {
		System.out.println("Enter b Value: ");
		b=sc.nextInt();
	}
	void add() {
		System.out.println("Sum= "+(a+b));
	}
}
	
	public class SingleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Addition R=new Addition();
    R.input();
    R.sqr();
    R.accept();
    R.add();
    
	}

}
