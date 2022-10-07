package Collections;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Collection {

	public static void main(String[] args) {
		Set <String> P=new HashSet<String>();
		P.add("Cricket");
		P.add("Sachin");
		P.add("MS Dhoni");
		P.add("Virat Kohli");
		P.add("Rohith Sharma");
		P.add("Bhuvi");
		P.add("RuthuRaj");
		P.add("Jaddu");
		System.out.println("\r HashSet is..... "+P);
		System.out.println("\r Size is..... "+P.size());
		System.out.println("\r Empty..... "+P.isEmpty());
		System.out.println("\r contains is..... "+P.contains("Sachin"));
		System.out.println("\r remove is..... "+P.remove("Raina"));
		System.out.println("\r after remove the Name is..... "+P.remove("KL Rahul"));
		System.out.println("............");
		
		Set <String> R=new LinkedHashSet<String>();
		R.add("N");
	    R.add("A");
	    R.add("N");
		R.add("I");
		R.add("G");
		R.add("A");
		R.add("R");
		R.add("U");
		System.out.println(R);
		System.out.println("LinkedHashSet");
		System.out.println("............");
		
		
	 Set <String>A= (Set<String>) new TreeSet ();
	
	A.add("N");
    A.add("A");
    A.add("N");
	A.add("I");
	A.add("G");
	A.add("A");
	A.add("R");
    A.add("U");
	System.out.println(A);
	System.out.println("TreeSet");
	System.out.println("............");
	
	
}


}
