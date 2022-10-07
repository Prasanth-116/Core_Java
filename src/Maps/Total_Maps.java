package Maps;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.TreeMap;

public class Total_Maps {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<Integer,String> R1=new LinkedHashMap<Integer,String>();
   
             R1.put(116,"Prasanth");
             R1.put(109,"Venkat");
             R1.put(112,"Dhamu");
             System.out.println(R1);
             System.out.println("------------------------------");
	

    TreeMap<String,Integer>R2=new TreeMap<String,Integer>();
	
             R2.put("Prasanth",116);
             R2.put("Venkat",109);
             R2.put("Dhamu",109);
            System.out.println(R2);
            System.out.println("-------------------------------");
            
            
    HashMap <String,Integer>R3=new HashMap<String,Integer>();
        	
            R3.put("Prasanth",116);
            R3.put("Venkat",109);
            R3.put("Dhamu",112);
           System.out.println(R3);
           System.out.println("----------------------------");
           
	
	}

	
}