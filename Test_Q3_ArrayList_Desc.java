package CollectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class Test_Q3_ArrayList_Desc {
	public static void main(String args[]) {
        
	    ArrayList<String> arraylist = new ArrayList<String>();
	    arraylist.add("Naushin");
	    arraylist.add("Tariq");
	    arraylist.add("Zaynab");
	    arraylist.add("Sabah");

	    System.out.println("ArrayList Before Sorting:");
	    for(String str: arraylist){
	   System.out.println(str);
	  }

	    Collections.sort(arraylist, Collections.reverseOrder());

	    System.out.println("ArrayList in descending order:");
	    for(String str: arraylist){
	   System.out.println(str);
	    }
	  }
	}