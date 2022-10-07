package Practice;

interface colleges{
	void fee();
	void semesters();
}
abstract class btech implements colleges{
	void duration() {
		System.out.println(" B.tech duration is 4 years");
		System.out.println("------------");
	}
	
}
abstract class degree  implements colleges{
	void timePeriod() {
		System.out.println(" Degree time period is 3 years ");
		System.out.println("------------");
	}
}
class mist extends btech{
	public void fee(){
		System.out.println(" Mist college fee is 50,000 per annum");
	}
	public void semesters () {
		System.out.println(" 8 semesters we have in b tech");
		System.out.println("------------");
	}
}
class  sist extends btech{
	public void fee(){
		System.out.println(" Sist fee is 30 k per annum");
	}
	public void semesters () {
		System.out.println(" 8 semesters we have in B.tech");
		System.out.println("------------");
	}
}

class  kakathiya extends degree {
	public void fee(){
		System.out.println(" Kakathiya Degree college, 35 k per annum");
	}
	public void semesters () {
		System.out.println(" we have 6 sems");
		System.out.println("------------");
	}
}
class  jvr extends degree {
	public void fee(){
		System.out.println(" jvr College 25 k per annum ");
	}
	public void semesters () {
		System.out.println(" we hava 6 sems  ");
	}
}
public class interfaces {

	public static void main(String[] args) {
	
	degree obj;
	btech obj2;
	
	obj2= new mist();
	obj2.fee();
	obj2.semesters();
	obj2.duration();
	
	obj2=new sist();
	obj2.fee();
	obj2.semesters();
	
	obj= new kakathiya();
	obj.fee();
	obj.semesters();
	obj.timePeriod();
	obj=new jvr();
	obj.fee();
	obj.semesters();

	
	

	}
}