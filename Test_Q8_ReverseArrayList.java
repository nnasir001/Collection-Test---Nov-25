package CollectionTest;

import java.util.Scanner;

public class Test_Q8_ReverseArrayList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String initial, rev = "";
Scanner in = new Scanner(System.in);
System.out.println("Enter the string to reverse");
initial = in.nextLine();
int length = initial.length();
for(int i = length-1; i >=0; i--)
	rev=rev+initial.charAt(i);
System.out.println("Reversed string: " +rev);
	}

}