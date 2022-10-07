package Iterarion;

import java.util.*;

public class ListIteratorDemo {

public static void  main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<Integer> R=new LinkedList<Integer>();
       
       R.add(10);
       R.add(11);
       R.add(14);
       R.add(15);
       R.add(16);
       R.add(17);
       System.out.println("-----Linked---------");
       System.out.println(R);
       System.out.println("");
       System.out.println("-----Next---------");
      ListIterator i= R.listIterator();  
       while(i.hasNext()) {
    	   System.out.println(i.next());
    	
    	   
       }
       System.out.println("----Previous---------");
       while(i.hasPrevious()) {
    	   System.out.println(i.previous());
    	  
       }
   
       
}

	

}
