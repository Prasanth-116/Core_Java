package Practice;

abstract class Animal{
	
	abstract void lifeSpan();
      abstract void breath();
		 
}
class Lion extends Animal{
	
	void lifeSpan() {
		System.out.println("Lion  has Long period of life span....");
	}
	void breath() {
		System.out.println("It breath the Oxygen...");
		System.out.println("__________*__________");
		
	}
}
class Tiger extends Lion{
	
	void lifeSpan() {
		System.out.println("Tiger Lifespan is lesss Compared to Lion....");
	}
	void breath() {
		System.out.println("It breath same as Lion breath...");
		
	}
	
	}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Animal R;
         R=new Lion();
         R.lifeSpan();
         R.breath();
         R=new Tiger();
         R.lifeSpan();
         R.breath();
         
	}

}
