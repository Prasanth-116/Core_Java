package ExceptionHandling;

public class ExceptionProgram{
	public static void main(String args[]) {
	      int a=8;
	      int b=4;
		String name=null;
		System.out.println("Statement-1");
		System.out.println("Statement-2 and div= "+(a/b));
		try {
			System.out.println("Staement-3 and length ="+name.length());
			}catch(ArithmeticException pr) {
				pr.printStackTrace();
				
			}catch(NullPointerException pr) {
				pr.printStackTrace();
				System.out.println("Statement-4");
				System.out.println("Statement-5");
				System.out.println("Statement-6");
			}

}
}
	
