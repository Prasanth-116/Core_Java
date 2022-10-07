package Java8;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employe{
	
	private int eid;
	private String ename;
	private int salary;
	private String Company;

	public Employe(int eid, String ename, int salary, String Company) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.Company=Company;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String Company) {
		this.Company = Company;
	}
	
   public static void main(String []args) {
  List<Employe>R=new ArrayList<Employe>();

       R.add(new Employe (116,"Prasanth",30000," in Wipro"));
       R.add(new Employe (109,"Venkat",65000,"in Infosis"));
       R.add(new Employe (112,"Dhamu",50000,"in TCS"));
       R.add(new Employe (122,"Narendra",60000,"in TCS"));
       R.add(new Employe (122,"Praveen",100000,"in TCS"));
       R.add(new Employe (128,"Sai",75000,"in Wipro"));
       R.add(new Employe (124,"Prasanna Kumar",150000,"in Wipro"));
       R.add(new Employe (303,"Vijay",90000,"in Google"));
       R.add(new Employe (102,"Ashok",60000,"in TCS"));


List<Employe> R1=R.stream().filter(X->X.getSalary()==150000).collect(Collectors.toList());
R1.forEach(p->System.out.println(p.getEid()+" "+p.getEname()+" "+p.getSalary()+" "+p.getCompany()));
	}
}
