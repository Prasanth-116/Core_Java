package Practice;

public class Parent{
	
	 Parent(int age){
			System.out.println("parent age is "+age);
		}
	}
	class Child extends Parent{
		Child(int age){
			super(45);
			System.out.println("Child age is "+age);
		}
	

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      Child R=new Child(25);
	      }

	}




