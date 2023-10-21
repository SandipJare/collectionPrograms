package collection_Set;

import java.util.HashSet;

public class HashSetClass1 {

	public static void main(String[] args) {
		/* 1) add(Object o)			boolean			
		2) addAll(Collection c)		boolean
		3) remove(Object o)			boolean
		4) removeAll(Collection c)		boolean
		5) contains(Object o)		boolean
		6) containsAll(Collection c)		boolean
		7) retainAll(Collection c)		boolean
		8) isEmpty()			boolean
		9) size()				int
		10) clear()			void
		11) toArrays()			object[]
		12) iterator()			Iterator
		  */
		 
		HashSet hs= new HashSet();
		
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(true);
		hs.add(22.5f);
		hs.add(null);
		hs.add(null);
		
		
		System.out.println(hs.contains(300));
		System.out.println(hs);
		System.out.println(hs.add(300));
		System.out.println(hs.add(300));
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.containsAll(hs));
		System.out.println(hs);
		
	}

}
