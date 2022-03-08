public class Animal{

	private String species; 
	private String diet;
	private String name; 

	public Animal(String diet, String species, String name){ 

		//super.setType("Animal");

		this.diet = diet; 
		this.species = species; 
		this.name = name; 


	}

	
	public String toString(){
		String str = name + " the " + species + " is a " + diet + "."; 
		System.out.print(str);
		return str; 
	}


}
