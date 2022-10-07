package ChoiceTheme;

class Fruits{
	
	
	String name,color,taste;
	Fruits(String name,String color,String taste){
		this.name=name;
		this.color=color;
		this.taste=taste;
		
	}
	Fruits(Fruits f){
		name=f.name;
		color=f.color;
		taste=f.taste;
		
	}

String show(){
	return name+" "+color+" "+taste;
}
}
	
public  class ConstructCopy  {

	public static void main(String[] args) {
   
	Fruits obj=new Fruits("apple","red","nice");
   Fruits obj2=new Fruits(obj);
   Fruits obj3=new Fruits(obj2);
   System.out.println(obj.show());
   System.out.println(obj3.show());
   System.out.println(obj2.show());
   System.out.println(obj2.show());
   System.out.println(obj2.show());
   
}

}

