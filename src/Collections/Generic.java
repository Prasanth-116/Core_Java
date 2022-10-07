package Collections;
class Prasanth<P>{
	void show(P r) {
		System.out.println(r);
	}
}
public class Generic {
	public static void main(String args[]) {
		Prasanth <String> R= new Prasanth<>();
	     System.out.print("Name  - ");
		 R.show("PRASANTH");
		 
		Prasanth <String> A= new Prasanth<>();
		   System.out.print("Company  - ");
		R.show("WIPRO..");
		
		Prasanth <Integer> J= new Prasanth<>();
		   System.out.print("Ph.no  - ");
		R.show("Ph.no: 85198*****");
		
		Prasanth <Double> I= new Prasanth<>();
		   System.out.print("Package  - ");
		R.show("500000 per Annum");
		
	}
	

}
