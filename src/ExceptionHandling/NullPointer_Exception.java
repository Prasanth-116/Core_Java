package ExceptionHandling;

public class NullPointer_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=null;
System.out.println("....Prasanth");
try {
	System.out.println(s.length());
}
catch(Exception r) {
	r.printStackTrace();
}

System.out.println("....Kumar");
	}
	

}
