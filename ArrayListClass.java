package collection_List;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {

		/*add(index,object o
		addAll(int index, collection c)
		remove(int index)
		set(int index, Object o)
		get(int Index)
		indexOf(object o)
		LitIterator()
		 	*/
		
		
		ArrayList arr = new ArrayList();

		arr.add(100);
		arr.add("Himanshu");
		arr.add(120.2);
		arr.add(true);
		arr.add("Selenium");
		arr.add(null);

//		System.out.println(arr.contains("Selenium"));  //True
//		
//		System.out.println(arr.size()); //6
//		
//		System.out.println(arr.isEmpty()); // false
//		
//		System.out.println(arr.get(2)); //120.2
		
		arr.add("Cucumber");
		
		
		
		for(int i=0;i<arr.size();i++) {
			
			System.out.println(arr.get(i));
		}
		
		System.out.println("----------");
		for (Object abc:arr) {
			
			System.out.println(abc);
		}
		
		arr.remove(0);
		System.out.println("---------");
		for(Object b:arr) {
			System.out.println(b);
		}
		
		arr.add("Pune");
		arr.add(2525);
		arr.add(null);
		System.out.println("---------");
		System.out.println(arr.get(6));
		System.out.println("---------");
		
		for (Object c:arr) {
			
			System.out.println(c);
		}

	}

}
