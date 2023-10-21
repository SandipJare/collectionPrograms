package collection_List;

import java.util.LinkedList;

public class LinkedlIstClass2 {

	public static void main(String[] args) {

		/*
		 * 1)addFirst(Object o) void 2) addLast(Object o) void 3) removeFirst() Object
		 * 4) removeLast() Object 5) getFirst() object 6) getLast() object
		 */
		LinkedList ln1 = new LinkedList();
		ln1.add("water");
		ln1.add("food");
		ln1.add("shelter");

		LinkedList ln2 = new LinkedList();
		ln2.add("car");
		ln2.add("Banlgow");
		ln2.add("Money");

		System.out.println(ln1);
		System.out.println(ln2);
		ln1.addAll(ln2);
		System.out.println(ln1);
//		ln1.retainAll(ln2);
//		System.out.println(ln1);
		
		ln2.addAll(ln1);
		System.out.println(ln2);
		ln2.addAll(ln2);
		System.out.println(ln2);
		ln2.retainAll(ln1);
		System.out.println(ln1);

	}

}
