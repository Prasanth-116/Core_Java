package ExceptionHandling;

public class Throws_Throw {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        int age=16;
        
		if(age>19) 
        System.out.println("Eligible for U-19 Cricket Team");
        else {
        	 throw new Exception("Not Eligible for U-19 Cricket Team");
        }
    	
	}

}
