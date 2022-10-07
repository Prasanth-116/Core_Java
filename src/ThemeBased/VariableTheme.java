package ThemeBased;

class Person{
   String name;
	int id;
    float salary;
    double bonus;
	static  String Company;
	long Mobilenumber;
	String location;
	char CompanyGrade;
	byte Lockerpin;
	short Branchcode;
}
class Person2{
	int id;
	double salary;
}
public class VariableTheme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Person P =new Person();
        P.name="Prasanth";
         P.id=116;
         P.salary=30000;
         P.bonus=10000;
         P.Company="INVICTUS";
         P.Mobilenumber=8519815963l;
         P.location="Bengalore";
         P.CompanyGrade='1';
         P.Lockerpin=126;
         P.Branchcode=1122;
         
         System.out.println("Name is "+P.name);
         System.out.println("Id is "+P.id);
         System.out.println("Salary is "+P.salary);
         System.out.println("Bonus is "+P.bonus);
         System.out.println("Company name is "+P.Company);
         System.out.println("Mobile Number is "+P.Mobilenumber);
         System.out.println("The location is "+P.location);
         System.out.println("Grade is "+P.CompanyGrade);
         System.out.println("Pin is "+P.Lockerpin);
         System.out.println("Branchcode is "+P.Branchcode);

         Person2 R =new Person2();
         R.id=126;
         R.salary=25000;
         
         System.out.println("Id is "+R.id);
         System.out.println("Salary is "+R.salary);
	}

}
