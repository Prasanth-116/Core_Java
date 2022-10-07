package ThemeBased;

import java.util.Scanner;

class Adding{
	

	void sum (int a, int b) {
		System.out.println("Sum of two Integers..... "+(a+b));
	}
	void sum(int a ,int b,int c) {
		System.out.println("Sum of Three numbers_____ "+(a+b+c));
	}
	  
	}



public class MoverloadingTheme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		  Scanner sc=new Scanner(System.in);
		  Adding R=new Adding();
		  
		  System.out.println("Enter the Numbers ");
		    R.sum(sc.nextInt(), sc.nextInt());
	        R.sum(sc.nextInt(), sc.nextInt(), sc.nextInt());
	       
		
		  
	}

}
