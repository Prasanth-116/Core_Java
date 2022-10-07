package ExceptionHandling;

public class ExceptionInner_tryblock {

        static int a=26;
		static String name="Chinni";
		public static void main(String[] args) {
			try {
				int a[]= {2,8};
			      try {
				   a[5]=4/0;
				
		        	}catch(ArithmeticException obj) {
			      	obj.printStackTrace();
			}
			a[8]=2;
			}catch(ArrayIndexOutOfBoundsException k) {
				k.printStackTrace();
			}
			System.out.println("Inner try block");
			try {
				System.out.println("number is,,,,,"+a);
				System.out.println("NAME,,,,,"+name);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}

	}

