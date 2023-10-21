package collection_List;

import java.util.HashSet;

public class HshSetClass {

public static void main(String[] args) {
		
		HashSet s = new HashSet();
		
		s.add(100);
		s.add(100);
		s.add(true);
		s.add(33.45f);
		s.add('A');
		s.add('A');
		s.add(234);
		s.add(null);
		s.add(null);
		
		System.out.println(s);

	}

}

