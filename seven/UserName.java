import java.util.Scanner;
import java.util.ArrayList;

public class UserName {

	static String firstName; 
	static String lastName; 
	static boolean isUsed;
	static ArrayList<String> arr;
	

	public String UserName(String firstName, String lastName){ 
		for (int i = 0; i< firstName.length(); i++){
			ArrayList<String> arr = new ArrayList<String>();
			String name = lastName + firstName.substring(0, firstName.length()-i); 
			arr.add(name);
			System.out.println(name);
		}
		return firstName;

	}

	/** Returns true if arr contains name, and false otherwise. */


	/** Removes strings from possibleNames that are found in usedNames as described in part (b).

	*/

	public boolean isUsed(String name, ArrayList arr){
		if (arr.contains(name)){

			isUsed = true; 
			
		}
		else {
			isUsed = false; 
		
		}

		return isUsed;
	}

	public void setAvailableUserNames(String name ){ 


		if (isUsed = false){

			System.out.println("Your username is currently not available. ");
			System.out.print(isUsed);

		}

		else {
			isUsed = true; 
			System.out.println(isUsed);
			System.out.println("Username is available.");
		}

	}

}

