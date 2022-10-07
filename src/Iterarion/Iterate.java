package Iterarion;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;

public class Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Set <String> i=new HashSet<String>();
       
       i.add("Prasanth");
       i.add("Venkat");
       i.add("Dhamu");
       i.add("Vinod");
       i.add("Valli");
       System.out.println(i);
       System.out.println("----------HashSet------------");
       Iterator p= i.iterator();
       while(p.hasNext()) {
    	    System.out.println(p.next());
       } 
     
       
       
	}

}
