package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Array_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<Float>r=new Vector<Float>();
   
   r.add(109.0f);
   r.add(116.0f);
   r.add(126.05f);
   r.add(112.0f);
   r.add(522.0f);
   System.out.println(r);
   System.out.println("......VECTOR....");
   System.out.println("--------------");
   System.out.println("");
   Iterator i=r.iterator();
	while(i.hasNext()){ 
		System.out.println(i.next());
	}
   List<Integer>p=new LinkedList<Integer>();
   p.add(123);
   p.add(143);
   p.add(145);
   p.add(163);
   p.add(12435);
   System.out.println(p);
   System.out.println("......LinkedList.....");
   System.out.println("--------------");
   System.out.println("");
   Iterator l=p.iterator();
	while(l.hasNext()){ 
		System.out.println(l.next());
	}
   
   List<String>L=new ArrayList<String>();
   L.add("PRASANTH");
   L.add("NANI");
   L.add("KANNA");
   L.add("VENKAT");
   L.add("DHAMU");
  System.out.println(L);
  System.out.println("....ArrayList...");
  Iterator R=L.iterator();
	while(R.hasNext()){ 
		System.out.println(R.next());
	}
   
   
   
   
	}	
}
