package Collections;

import java.util.HashSet;
import java.util.Set;

public class Hash {
	

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
			System.out.println("\r HashSet..... "+P);
			System.out.println("\r Size is..... "+P.size());
			System.out.println("\r Empty..... "+P.isEmpty());
			System.out.println("\r contains is..... "+P.contains("Sachin"));
			System.out.println("\r remove is..... "+P.remove("Raina"));
			
			System.out.println("\r after remove the Name is..... "+P.remove("KL Rahul"));
			
			
			System.out.println("............");
			
}
}
