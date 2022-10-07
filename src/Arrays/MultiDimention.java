package Arrays;

import java.util.Scanner;

class Array{

		int prasanth[][]=new int[4][4];
		Scanner sc=new Scanner(System.in);
		void A() {
			for(int i=0;i<4; i++) {
			 for(int j=0; j<4; j++) {
			System.out.println("Enter the elements");
	             	prasanth [i][j]=sc.nextInt();
			}
		}
	}
		void B() {
			for(int []X: prasanth) {
			   for(int P: X) {
				   System.out.print( " "+P+" ");
			   }
			   System.out.println();
			   System.out.println();
			}
		}
}	
		public class MultiDimention {
			public static void main(String[] args) {
				Array R=new Array();
				R.A();
				R.B();
			
}
}
