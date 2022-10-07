package ChoiceTheme;
class Bus{
	
	void distance() {
		
		System.out.println(" The Distance of Hyd is...200kms ");
		System.out.println(" Safe Jounery");
	}
		void price() {
			System.out.println(" The Price is .......$600/- Only ");
			System.out.println("-----****------");
		}
	
} 
class Bike extends Bus{
	
	void distance () {
		
		System.out.println(" The Distance of Bengalore is.....400kms ");
		System.out.println(" Safe Jounery");
	}
	void price() {
		
		System.out.println(" The price is......$10000/- Only");
		System.out.println("-----****------");
	}
}
class Train extends Bike{
	
	void distance () {
		System.out.println(" The Distance Of Chennai is.......600kms ");
		System.out.println(" Safe Jounery");
		
	}
	void price() {
		System.out.println(" The Price is........$800/- Only ");
		System.out.println("------****------");
	}
}
public class MoverridingOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bus R=new Bus();
      R.distance();
      R.price();
      R=new Bike();
      R.distance();
      R.price();
      R=new Train();
      R.distance();
      R.price();
      
	}

}
