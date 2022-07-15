package org.preparations;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class BeforeDropdownQues {

	public static void main(String[] args) {
		
		// Ques 6 : How to copy value from List to Set ?
		
		List l6 =  new ArrayList();	
		
		l6.add(25);				l6.add(39);
		l6.add("vijay");		l6.add('J');
		l6.add(true);			l6.add(39);
		l6.add(0.8f);			l6.add(139.61);
//		l6.add(711);			l6.add('S');
		l6.add("siva");			l6.add(10.00f);
//		l6.add(0.269);			l6.add(false);
//		l6.add("sam");			l6.add(711);
			
		System.out.println("\nCreated List is --> "+ l6+"\n");
		
//		Set s6 = new HashSet();
//		
//		boolean addAll = s6.addAll(l6);
//		System.out.println("Is Set Created ? "+addAll);
//		System.out.println("That Set --> Which is Copied from List : "+s6+"\n");
		
		
		//	Ques 7 : Find List's Length ?
		
		int size = l6.size();
		System.out.println("Total Indexes occupied in a created List is --> "+ size);
		
		
		//	Ques 8 :How to get the last index value in a list ? (Without hardcode Index)
		
//		int size = l6.size();
		Object lastIndex = l6.get(size-1);
		
		System.out.println("Last Index Value in a list is --> "+lastIndex);
		
		
		// Ques 9 : How to get the first 5 values in a list ?
		
//		int size = l6.size();
//		
		for (int i = 0; i <= 4; i++) {
			
			Object first5 = l6.get(i);
			System.out.println("At "+i +"th Index, the Value is --> "+first5);
		}
		
		//	Ques 10 : How to get the middle index value in list ?
		
//		int size = l6.size();
		
		System.out.println("The Middle Index Value of a List is --> "+l6.get((size/2)-1));
		
		
		// Ques 11 : How to get the last 5 index values in a list ?
		
//		int size = l6.size();
		int j = size-1;
		
		for (int i = size-1; i >= j-4; i--) {
			
			Object last5 = l6.get(i);
			System.out.println("At "+i +"th Index, the Value is --> "+last5);
		}
		
		
		//	Ques 12 : Print the alternate number in list.
		
//		int size = l6.size();
	
		for (int i = 0; i < size; i++) {
			
			if (i%2==0) {
				System.out.println("At "+i +"th index, the Value is --> "+l6.get(i));
			}
		}
		
		

		//	Ques 13 : Iterate the list using for loop.
		
		for (int i = 0; i < l6.size(); i++) {
			
			System.out.println("At "+i +"th index, the Value is --> "+l6.get(i));
			
		}
		
		
//		Ques 14 : Iterate the list using enhanced for-loop.
		
		for (Object value : l6) {
		
			System.out.println(value);
			
		}
		
		
	//	Ques 15 : Get the first index value in list
		
		Object firstIndex = l6.get(0);
		
		System.out.println("First Index value is --> "+firstIndex);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
