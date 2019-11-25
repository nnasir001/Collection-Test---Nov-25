package CollectionTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test_Q1_IterateHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(13, "Jerry");
		hmap.put(51, "John");
		hmap.put(7, "Sherry");
		hmap.put(21, "Anita");
		hmap.put(27, "Ray");

		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.println("Id is: " +mentry.getKey() + " Employee name is:");
			System.out.println(mentry.getValue());
		}
		
			}

		}

