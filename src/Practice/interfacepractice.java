package Practice;

    interface Eletronics{
	             void Cost() ;
	    	void Specifications1();
			
		}
	abstract class Mobile implements Eletronics{
			     void common() {
				System.out.println("A battery typical a lithium-iron battery providing the power source");
			}

	}
	abstract class Laptop implements Eletronics{
				void Screen() {
					System.out.println(" The Laptop Size is 13.5");
				
					
				}
			}
		
	class redmiPhone extends Mobile{
		public void Cost () {
			System.out.println("redmi Phone (White,256GB) Cost is= 77000");
		}
		@Override
		public void Specifications1() {
			// TODO Auto-generated method stub
			System.out.println("12 GB RAM | 256 GB ROM, Real Camera 45MP + 50MP");
			System.out.println("--------");
			
		}
		
	}

	class realme extends Mobile{
		public void Cost() {
			System.out.println("realme 5G SE Cost is=18999");
		}
		public void Specifications1() {
			System.out.println("6 GB RAM | 128 GB ROM, Real Camera 48MP + 2MP + 2MP");
			System.out.println("--------");
			
		}
		
		}
	class Del extends Laptop{

		public void Cost() {
			System.out.println(" Del cost is= 65k");
		}
		public void Specifications1() {
			System.out.println("intel i3, intel iRIS XE GRAPHICS");
			System.out.println("--------");
		}
	}
	 class Asus extends Laptop{
		public void Cost () {
			System.out.println("Asus cost is = 65k");
			}
		public void Specifications1() {
			System.out.println("intel CORE i5, intel iRIS XE GRAPHICS");
			System.out.println("--------");
		}
		
	 }
    public class interfacepractice {

		public static void main(String[] args) {
			Mobile m;
			m=new redmiPhone();
			m.Cost ();
			m.common();
			m.Specifications1();
			m=new realme();
			m.Cost ();
			m.Specifications1();
			Laptop l;
			l = new Del();
			l.Cost ();
			l.Specifications1();
			l.Screen();
			l=new Asus();
			l.Cost ();
			l.Specifications1();
			

		}

    }
	 

