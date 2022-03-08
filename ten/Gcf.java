public class Gcf{ 
	
	private int a; 
	private int b; 

	public Gcf(int a, int b){

		if ((a % b) == 0){

			System.out.print("The GCF of " + a + " and " + b + " is " + b); 

		}

		else {

			int r = a % b; 
			Gcf again = new Gcf(a, r); // line 17 
		}

	} 







}