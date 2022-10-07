package ChoiceTheme;
class movie{
	String name;
	float rating;
	
	movie( String name,int rating){
		this.name=name;
		this.rating=rating;	
	}
	void show () {
		System.out.println("movie="+name);
		System.out.println("rating="+rating);
}
}

public class ThisOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movie R=new movie("RRR",5);
		 System.out.println(R);
        R.show();
        movie sr = new movie("Sitha Rama",(int) 3.1);
        sr.show();
		
		
		

	}

}



