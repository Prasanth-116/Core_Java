package Java8;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		String[] str=new String[10];
		str[5]="Java";
		Optional<String>R= Optional.ofNullable(str[4]);
		if(R.isPresent()) {
			System.out.println(str[0].length());
			
		}else
		{
			System.out.println("String is Null");
		}
		  
		System.out.println("Invictus Engineering");
		System.out.println("JSpider");
		System.out.println("NareshIT");
		System.out.println("VarunIT");
		System.out.println("Java Coaching Center");
		
	}
}
