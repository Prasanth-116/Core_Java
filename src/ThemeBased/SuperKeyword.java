package ThemeBased;
 class TCS1 {
	 
	 
	 TCS1 (int investment){
			
			System.out.println("Wipro Company Investment is... "+investment);
	       }
 } 
 public	 class SuperKeyword extends TCS1{
	           SuperKeyword(int investment1){
					super(10000);
					System.out.println("TCS investment is... "+investment1);
				}
		 
	 
	public static void main(String[] args) {
         SuperKeyword P =new SuperKeyword(200000);
         
	}
	 
 }


	 

