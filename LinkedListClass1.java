package collection_List;

import java.util.LinkedList;

public class LinkedListClass1 {

	public static void main(String[] args) {

		/*  1)addFirst(Object o)		void
			2) addLast(Object o)		void
			3) removeFirst()			Object
			4) removeLast()				Object
			5) getFirst()				object
			6) getLast()				object
		 */
		
		
		LinkedList ln = new LinkedList();

		ln.add(100);
		ln.add(200);
		ln.add(300);
		ln.add(100.20);
		ln.add("Hamcrest");
		ln.add("MapInterface");
		ln.add(100);ln.add("Hamcrest");
		ln.add("MapInterface");
		ln.add(150);
		ln.add(100);

		System.out.println(ln.size());
		System.out.println(ln);
		System.out.println(ln.getFirst());
		System.out.println(ln.getLast());
		System.out.println(ln.removeFirst());
		System.out.println(ln);
		System.out.println(ln.remove(5));
		System.out.println(ln);
		System.out.println(ln.removeLast());
		System.out.println(ln);
		ln.addFirst("Welcome");
		ln.addLast("linkedList");
		System.out.println(ln);
		System.out.println(ln.contains("Welcome"));
		ln.clone();
		System.out.println(ln);
//		ln.clear();
//		System.out.println(ln);

	}

}
