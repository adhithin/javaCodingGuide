public class BookListing{ 

private Book book; 
private double cost; 

	public BookListing(Book book, double cost){

		Book b = book; 
		double c = cost; 


	}

	public void printDescription(){

		String str = book + ", " + cost; 

		System.out.print(str); 

	}



}