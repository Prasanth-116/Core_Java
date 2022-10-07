package Practice;

class University{
	void announcement () {
		Department civil=new Department();
		System.out.println("Exams Starts on 23rd Oct");
		civil.prepare();
	}
	
	class Department{
		void prepare() {
			System.out.println("10 days time taken for Question paper prepation");
		}
		
	}
}
public class Nestedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      University jntu=new University();
      jntu.announcement();
      
	}

}
