package collection_List;

import java.util.ArrayList;

public class ArrayListClass3 {

	public static void main(String[] args) {
		
		ArrayList arr=new ArrayList();
		
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		
		System.out.println(arr);
		
		arr.add(500);
		
		System.out.println(arr);
		
		arr.add(0, 50);
		arr.add(6, 600);
		
		System.out.println(arr);
		
		arr.remove(4);
		
		System.out.println(arr);
		
		for(Object b:arr) {
			
			System.out.println(b);
		}
		
		System.out.println(arr.indexOf(600));

	}

}
