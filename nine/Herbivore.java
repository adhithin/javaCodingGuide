public class Herbivore extends Animal{

	private String species; 
	private String name;


	public Herbivore(String species, String name){ 

		//super.setType("Animal");

		super("herbivore", species, name); 
		this.name = name; 
		this.species = species; 


	}


	@Override
	public String toString(){

		String str = name + " the " + species + " is a herbivore."; 
		System.out.print(str);
		return str;

	}


}