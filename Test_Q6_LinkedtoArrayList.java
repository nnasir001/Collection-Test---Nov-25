package CollectionTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test_Q6_LinkedtoArrayList {

	public static void main(String[] args) 
    {
        LinkedList<String> linkedList = new LinkedList<>();
         
        linkedList.add("Apple");
        linkedList.add("Berry");
        linkedList.add("Carrot");
        linkedList.add("Dairy");
         
       ArrayList<String> arrayList = new ArrayList<>(linkedList);
        
       System.out.println(arrayList);
    }
}