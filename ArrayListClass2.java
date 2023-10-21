package collection_List;

import java.util.ArrayList;

public class ArrayListClass2 {

	public static void main(String[] args) {

		ArrayList arr = new ArrayList();

		arr.add("A");
		arr.add("E");
		arr.add("I");
		arr.add("O");
		arr.add("U");

		ArrayList arr1 = new ArrayList();

		arr1.add("1");
		arr1.add("2");
		arr1.add("3");
		arr1.add("4");
		arr1.add("5");

//		System.out.println(arr);
//		System.out.println("-----------");

		arr.addAll(arr1);

		System.out.println(arr);
		System.out.println("-----------");
		System.out.println(arr1);
		
//		arr.removeAll(arr1);
		System.out.println("-----------");
		System.out.println(arr);
		
		arr.retainAll(arr1);
		
		System.out.println(arr);

	}

}
