public class Elephant extends Herbivore{

	private String name;


	public Elephant(String name){ 

		//super.setType("Animal");

		super("elephant", name); 
		this.name = name; 



	}


	@Override
	public String toString(){

		String str = name + " the elephant " + " is a herbivore."; 
		System.out.print(str);
		return str;

	}


}