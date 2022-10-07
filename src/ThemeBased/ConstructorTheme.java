package ThemeBased;
class Prasanth{
	
	String name;
	byte BranchCode;
    double salary;
    float bonus;
    
   void  Prasanth(){
    	
    	name="PRASANTH";
    	BranchCode=126;
    	salary=30000;
    	bonus=3000.0f;
    }
    
    void show() {
    	
    	System.out.println("My name is..."+name);
    	System.out.println("BranchCode is... "+BranchCode);
    	System.out.println("My $@L@Ri is..."+salary);
    	System.out.println("Bonus Given for my Perfomance.... "+bonus);
    	
    }
}
public class ConstructorTheme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Prasanth R=new Prasanth();
          
          R.show();
	}

}
