package ThemeBased;


class Industry {
	void announcement () {
		
		System.out.println(">>>....Project Starts on 1st Sept");
	
		Department java=new Department();
	    java.prepare();
	   java.bestEmployee();
	}
	
	class Department{
		void prepare() {
			System.out.println(">>>....15 days time taken for java Project");
			
		
		}
		void bestEmployee() {
			System.out.println(">>>....Best Employe Award is also Given By Company ");
			System.out.println(">>.... SO, Prepare yourself and get ready.....");
		
		}
		
	}
}
public class Nestedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Industry wipro=new Industry();
      wipro.announcement();
      
      
	}

}




