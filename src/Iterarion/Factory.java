package Iterarion;

class Car{
			void cost() {
				
				System.out.println(" No Cost");	
			}
			
			void milage() {
				System.out.println(" No Milage");
			}
		}
class Audi extends Car{
			
			void cost() {
				System.out.println("Car name is AUDI 🚗🚗...");
				System.out.println(" Audi cost is.... 50lakhs 💰💰");
			}
			
			void milage() {
				System.out.println(" Audi Milage is...10kms  🛣️🛣️");
			}
			
		}
class Tata extends Car{
			
			void cost() {
				System.out.println(" Car name is TATA 🚗🚗...");
				System.out.println(" Tata cost is...40lakhs 💰💰");
			}
			
			void milage() {
				System.out.println(" Tata Milage is...15kms  🛣️🛣️");
			}	 
			
		}
class CarFactory{
	 Car getCar(String carName) {
		if(carName.equals("Audi"))
		return new Audi();
		else if(carName.equals("Tata"))
		return new Tata();
		else 
			return null;
	 }
	
}

public class Factory{

public static void main(String[] args) {
				// TODO Auto-generated method stub
		       CarFactory R=new CarFactory();
		        Car c=R.getCar("Tata");
		        	c.cost();
		             c.milage();
			}
}

