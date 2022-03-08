import java.util.Scanner;
import java.util.ArrayList; 


class Main {
  public static void main(String[] args) {


    System.out.print("Hello world!");

		Scanner sc = new Scanner(System.in); 

		System.out.println("Which FRQ do you want to see?");

		String input = sc.nextLine();

		if (input.contains("u5q1")){
			Invitation u5q1 = new Invitation();

			System.out.print("What is the host name? ");

			String hostName = sc.nextLine();

			System.out.print("What is the address ");

			String address = sc.nextLine();

			System.out.print("What is the name? ");

			String userName = sc.nextLine();

			System.out.print("What is the host age? ");

			String userAge = sc.nextLine();

			System.out.print("Who is being invited? ");

			String invited = sc.nextLine();

			int age = Integer.parseInt(userAge);

			u5q1.getHostName(hostName); 
			u5q1.getAddress(address);
			u5q1.changeAddress();
			u5q1.sendInvite(invited, address, hostName);

		}

		if (input.contains("u5q2")){
			Password u5q2 = new Password();

			System.out.print("what is your string? ");

			String str = sc.nextLine();

			System.out.print("How many numbers do you need? ");

			String len = sc.nextLine();

			int passLen = Integer.parseInt(len);

			u5q2.newPass(str, passLen);

		}

		if (input.contains("u6q1")){
			listIng u6q1 = new listIng();

			System.out.print("Enter the 1st you want to add to the list: ");

			String word1 = sc.nextLine();

			System.out.print("Enter the 2nd you want to add to the list: ");

			String word2 = sc.nextLine();

			System.out.print("Enter the 3rd you want to add to the list: ");

			String word3 = sc.nextLine();

			u6q1.wordIng(word1, word2, word3);
			
		}

		if (input.contains("u2")){

			System.out.println("Enter your light Sequence: ");

			String seq = sc.nextLine();

			System.out.println("Enter your segment: ");

			String segment = sc.nextLine();

			System.out.println("Enter your integer: ");

			String ind = sc.nextLine();

			System.out.println("Enter your New light Sequence: ");

			String newSeq = sc.nextLine();

			LightSequence gradShow = new LightSequence();
			gradShow.LightSequence(seq);
			gradShow.insertSegment(segment, 2);
			gradShow.changeSequence(newSeq);
			gradShow.display(newSeq);
			
		}

		if (input.contains("u7")){
			UserName u7 = new UserName();

			System.out.println("What is your first name? ");

			String firstName = sc.nextLine();

			System.out.println("What is your last name? ");

			String lastName = sc.nextLine();

			System.out.println("What is your user name? ");

			String userName = sc.nextLine();

			u7.UserName(firstName, lastName); 
			u7.setAvailableUserNames(firstName);

		}

		if (input.contains("u8")){

			Plot p1 = new Plot("corn",20);

      Plot p2 = new Plot("corn",30);

      Plot p3 = new Plot("peas",10);

      Plot p4 = new Plot("peas",30);

      Plot p5 = new Plot("corn",40);

      Plot p6 = new Plot("corn",62);

      Plot p7 = new Plot("wheat",10);

      Plot p8 = new Plot("corn",50);

      Plot p9 = new Plot("rice",30);

      Plot p10 = new Plot("corn",55);

      Plot p11 = new Plot("corn",30);

      Plot p12 = new Plot("peas",30);

      Plot[][] plots = {{p1,p2,p3},{p4,p5,p6},{p7,p8,p9},{p10,p11,p12}};

      ExperimentalFarm f = new ExperimentalFarm(plots);

      Plot highestYield = f.getHighestYield("corn");

      Plot highestYield1 = f.getHighestYield("peas");

      Plot highestYield2 = f.getHighestYield("bananas");

      try {

      System.out.println(highestYield.toString());

      System.out.println(highestYield1.toString());

      System.out.println(highestYield2.toString());

      }

      catch(Exception e)

      {

         System.out.println("null");

      }

      System.out.println("The method call f.sameCrop(0)");

      System.out.println(f.sameCrop(0));

      System.out.println("The method call f.sameCrop(1)");

      System.out.println(f.sameCrop(1));

		}

		if(input.contains("u9q2")){

			Animal lisa = new Animal("carnivore", "lion", "Lisa"); 
			lisa.toString(); 
			Herbivore gary = new Herbivore("giraffe", "gary");
			gary.toString(); 
			Elephant percy = new Elephant("percy");
			percy.toString(); 

		}

		if(input.contains("u9q1")){

			PictureBook myBook = new PictureBook("Peter and Wendy", "J.M. Barrie","F.D. Bedford");myBook.printBookInfo();

			ArrayList<Book> myLibrary = new ArrayList<Book>();

			/* missing code */

			Book book1 = new Book("Frankenstein", "Mary Shelley");

			PictureBook book2 = new PictureBook("The Wonderful Wizard of Oz", "J L. Frank Baum","W.W. Denslow");


			myLibrary.add(book1);

			myLibrary.add(book2);

			System.out.println(myLibrary); 

			BookListing listing1 = new BookListing(book1, 10.99); 
			
			BookListing listing2 = new BookListing(book2, 12.99); 
			
			listing1.printDescription(); 
			listing2.printDescription(); 

		}

		if(input.contains("u10")){

			System.out.print("What is your first number?"); 

			String a1 = sc.nextLine();

			int a = Integer.parseInt(a1); 

			System.out.print("What is your second number?"); 

			String b1 = sc.nextLine();

			int b = Integer.parseInt(b1); 

			Gcf find = new Gcf(a, b); 
			//find.Gcf(a, b); 




		}

		else {
			System.out.print("Try again please");
		}

		

	}

	
}