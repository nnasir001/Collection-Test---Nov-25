package CollectionTest;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Test_Q2_HashMapbyKeys {
	
	static Map<String, Integer> map = new HashMap<>(); 
	  
    public static void sortbykey() 
    { 
        TreeMap<String, Integer> sorted = new TreeMap<>(); 
  
        sorted.putAll(map); 

        for (Map.Entry<String, Integer> entry : sorted.entrySet())  
            System.out.println("Car = " + entry.getKey() +  
                         ", Rating = " + entry.getValue());         
    } 
    public static void main(String args[]) 
    { 
        map.put("BMW", 95); 
        map.put("Benz", 100); 
        map.put("Toyota", 70); 
        map.put("Jaguar", 85); 
        map.put("Tesla", 99); 
   
        sortbykey(); 
    } 
} 
