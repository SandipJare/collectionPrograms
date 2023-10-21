package collection_List;

import java.util.Vector;

public class VectorClass1 {

	public static void main(String[] args) {
		/* - Vector class they define 8 vectors
	1) addElement()
	2) removeElement()
	3) removeAllElements()
	4) firstElement()
	5) lastElement()
	6) capacity()
	7) elements()
	8) getElementAt() */

		Vector v=new Vector();
		
		v.add("Anamika");
		v.add("Angha");
		v.add("anvika");
		v.add("Anwesha");
		
		System.out.println(v);
		
		v.addElement(100);
		v.remove(0);
		System.out.println(v);
		System.out.println(v.firstElement());
		v.set(0, 200);
		System.out.println(v);
		v.add("Aman");
		v.add("Amar");
		v.add("Adhira");
		v.add("Arwik");
		
		System.out.println(v.capacity());
		System.out.println(v);
		
		v.add(3, 300);
		v.add(5, 1000);
		v.add(6, "Ganesh");
		System.out.println(v);
		
		v.remove(5);
		v.remove("Aman");
		System.out.println(v);
		
		System.out.println(v.indexOf("Amar"));
		
		
		
	}

}
