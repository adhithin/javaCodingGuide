public class PictureBook extends Book{ 


	private String title;
	private String author;
	private String illustrator;


 

	public PictureBook(String t, String a, String i)

	{

	super(t, a); 

	title = t;

	author = a;

	illustrator = i; 

	}

 
	@Override 
	public void printBookInfo()

	{
		
		String str = title + ", written by " + author + " and illustrated by " + illustrator; 

		System.out.print(str);

	}


	
}