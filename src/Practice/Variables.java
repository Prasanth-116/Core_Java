package Practice;


class Student{
	int id;
	float marks;
	static String college;
}
 class Employee{
	 int empid;
	 double salary;
	 
 }
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student R=new Student();
          R.id=116;
          R.marks=98.4f;
         Student.college="MIST";
          
          System.out.println("Student id is " + R.id);
          System.out.println("Student marks are " + R.marks);
          System.out.println("Student college is " + Student.college);
          
      Employee P =new Employee();
      P.empid=1234;
      P.salary=30000;
      
      System.out.println("Employee empid is "+P.empid);  
      System.out.println("Employee salary is "+P.salary);
	}

}
