package ThemeBased;
import java.util.Scanner;

class Company2{
	
	void hrdepartment() {
		
		System.out.println("HR Works On Meetings.....");
	}

} 
class Team extends Company2{
	
	void teamlead() {
		
		System.out.println("Team members works on project...");
	}
}

class Trainers extends Team{
	
	void trainer() {
		System.out.println("Train the Freshers...");
	}
}

public class MultilevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Trainers R=new Trainers();
     R.hrdepartment();
     R.teamlead();
     R.trainer();
     
  
	}

}
