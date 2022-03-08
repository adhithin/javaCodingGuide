import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class listIng {

	public void wordIng(String word1, String word2, String word3){
	

	ArrayList<String> userList = new ArrayList<String>();
	int n;


	ArrayList<String> list = new ArrayList<String>();
	// this initializes our string that we're calling
	// how does it work? we imported java.util.ArrayList;
	// which allows us to create an object from that class
	// we imported a package, which is a set of classes
	// this set of classes allows us to create ArrayLists
	// these can be changeable, and we can add to them, like below:

	list.add(word1);
	list.add(word2);
	list.add(word3);
	list.add("hellow"); // adding hellow
	list.add("coding"); // adding coding
	list.add("kayaking"); // adding kayaking
	list.add("techtalking"); // adding techtalking
	list.add("hey hey hey"); // adding hey hey hey

	ArrayList<String> newList = new ArrayList<String>();


	for (String word : list) { // enhanced for each loop
		// word is defined as String
		// list is the Array List that we're going through

		if (word.contains("ing")) {
			System.out.println(word);
			newList.add(word); // add word to newList
		}

		// for the if loop, you can use contains, or substring

	}
	System.out.print(newList); // printing out the new List with only the ing words
	
	}
}
