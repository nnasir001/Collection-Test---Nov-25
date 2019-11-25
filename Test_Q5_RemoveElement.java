package CollectionTest;

import java.util.ArrayList;

public class Test_Q5_RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Terry");
		alist.add("Harry");
		alist.add("Larry");
		alist.add("Mary");
		alist.add("Sherry");
	
		System.out.println(alist);

		alist.remove("Harry");
		alist.remove("Sherry");

		System.out.println(alist);

					}

	}
