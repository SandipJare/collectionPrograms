package collection_List;

import java.util.ArrayList;

public class ArrayListClass4 {

	public static void main(String[] args) {
		ArrayList arr3 = new ArrayList();

		arr3.add(10);
		arr3.add(20);
		arr3.add(30);
		arr3.add(40);

		ArrayList arr4 = new ArrayList();

		arr4.add("A");
		arr4.add("B");
		arr4.add("C");
		arr4.add("D");

//		System.out.println(arr3);
//		System.out.println(arr4);

		arr3.addAll(arr4);
//		System.out.println(arr3);

		ArrayList arr5 = new ArrayList();
		arr5.add(1000);
		arr5.add(2000);
		arr5.add(3000);
		arr5.add(4000);

		arr4.addAll(arr5);
		System.out.println(arr4);

		arr3.addAll(arr4);

		System.out.println(arr3);

		System.out.println(arr4);

		arr3.removeAll(arr4);

		System.out.println(arr3);

	}

}
