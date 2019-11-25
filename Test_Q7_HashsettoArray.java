package CollectionTest;

import java.util.*;

public class Test_Q7_HashsettoArray {
	public static void main(String[] args) {
    HashSet<String> Hset = new HashSet<String>();
         Hset.add("Raspberry");
         Hset.add("Strawberry");
         Hset.add("Blackberry");
         Hset.add("Blueberry");
         Hset.add("Pinkberry");
     System.out.println("Original Hash Set: " + Hset);
 
     String[] new_array = new String[Hset.size()];
     Hset.toArray(new_array);

     System.out.println("Array elements: ");
     for(String element : new_array){
       System.out.println(element);
    }
  }
}
