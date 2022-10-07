package ChoiceTheme;
class Heroien{
	
	String name;
	int age;
	byte noOfMvs;
	static short Budgect;
}

class MVdetails{
	
	short notheaters;
	Long Collection;
	String Banner;
	float Rating;
	
	
}
public class VariableMV {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Heroien R =new Heroien();
        
        R.name="SAMATHA";
        R.age=30;
        R.noOfMvs=26;
        R.Budgect= 10000;
        
        System.out.println("Heroien name is "+R.name);
        System.out.println("age is "+R.age);
        System.out.println("noOfMvs are "+R.noOfMvs);
        System.out.println("Mv Budgect is "+R.Budgect);
        
        
         MVdetails P =new MVdetails();
        
        P.notheaters=25;
        P.Collection=250000l;
        P.Banner="Vijayanthi";
        P.Rating=2.5f;
        
        System.out.println("noOfTheaters are"+P.notheaters);
        System.out.println("collections are "+P.Collection);
        System.out.println("Banner of MV "+P.Banner);
        System.out.println("Rating is "+P.Rating);
        
        
        
	}

}
