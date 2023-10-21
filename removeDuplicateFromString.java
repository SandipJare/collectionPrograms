package collection_List;

import java.util.LinkedHashSet;

public class removeDuplicateFromString {

	public static void main(String[] args) {

		// Remove duplicate character from string
		
				String a="cucumber";
				
				LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
				
				for(int i=0;i<a.length();i++)
				{
					char b = a.charAt(i);
					hs.add(b);
				}
				
				for(Object o: hs)
				{
					System.out.print(o);
				}
				
				

			}

	}


