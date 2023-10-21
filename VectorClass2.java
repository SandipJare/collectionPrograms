package collection_List;

import java.util.Vector;

public class VectorClass2 {

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
		
		Vector v= new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		
		Vector v1= new Vector();
		v1.add('A');
		v1.add('E');
		v1.add('I');
		
		Vector v2= new Vector();
		v2.add('x');	
		v2.add('y');		
		v2.add('z');
		v2.add(null);
		
		v.addAll(v2);
		
		System.out.println(v);
		v.add(2, 5000);
		System.out.println(v);
		
		String c=(String) v.lastElement();
		System.out.println(c);
		
		
		
		
	}

}
