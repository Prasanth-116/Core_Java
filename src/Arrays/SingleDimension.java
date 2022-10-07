package Arrays;
import java.util.Scanner;
public class SingleDimension {

	public static void main(String[] args) {
		int a[]=new int[10];
		
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<10; i++) {
		System.out.println("Enter the numbers");
		a[i]=sc.nextInt();
	}
	int sum=0;
	int div=0;
	int product=0;
	
	for(int i = 0; i<10; i++) {
	sum=sum+a[i];
	div=div+a[i];
  product=product+a[i];
	System.out.println("a["+i+"]="+a[i]);
	}
	System.out.println("sum="+sum);
	System.out.println("div="+div);
	System.out.println("product="+product);
	
	
	}
}
