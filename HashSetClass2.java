package collection_Set;

import java.util.HashSet;

public class HashSetClass2 {

	public static void main(String[] args) {
	
		HashSet hs=new HashSet();
		
		hs.add(20.5);
		hs.add(50.5);
		hs.add(100.5);
		
		HashSet hs1=new HashSet();
		hs1.add("Cooler");
		hs1.add("Fan");
		hs1.add("AC");
		
		System.out.println(hs);
		System.out.println(hs1);
		
		for(Object a:hs1) {
			System.out.println(a);
		}
		
		hs.addAll(hs1);
		System.out.println(hs);
		
		hs.add("TV");
		System.out.println(hs);

	}

}
