package CollectionTest;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test_Q15_AddRemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deque<String> dq = new ArrayDeque<String>();

dq.add("Prasana");
dq.add("Neha");
dq.add("Fatima");
dq.add("Mo");

System.out.println("Elements in Deque: " +dq);
dq.addFirst("Nasheen");
dq.addLast("Sabah");

System.out.println("Elements added in Deque: " +dq);

System.out.println("Removed element: "+dq.removeLast());
}
}
