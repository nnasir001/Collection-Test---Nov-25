package CollectionTest;

import java.util.ArrayList;

public class Test_Q4_IndexArrayList {
	
	public static void main (String[] args) {
		ArrayList<String> friends = new ArrayList <String>();
		friends.add("Sabah");
		friends.add("Zaynab");
		friends.add("Tariq");
		friends.add("Naushin");	 

		System.out.println("Index Of: " + friends.indexOf("Zaynab"));
	}
	}
