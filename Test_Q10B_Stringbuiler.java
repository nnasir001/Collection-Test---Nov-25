package CollectionTest;


public class Test_Q10B_Stringbuiler {
	
	public static void main(String[] args) {
		  
	      StringBuilder str = new StringBuilder("Prasana ");
	      System.out.println("string = " + str);
	      str.append('!');
	      
	      System.out.println("After append = " + str.toString());
	      
	      str = new StringBuilder("Hi "); 
	      System.out.println("string = " + str);
	      
	      	      str.append("Rahul");
	   
	      	      System.out.println("After append = " + str.toString());
	   }
	}

