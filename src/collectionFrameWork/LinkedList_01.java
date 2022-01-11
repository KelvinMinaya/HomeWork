package collectionFrameWork;

import java.util.LinkedList;

public class LinkedList_01 {
	public static void main(String[] args) {
		// Array list is a linear movement so all must reposition
		// Link list makes a link and now communication goes through the new guy and old
		// link is cut
		// A go between is added so the other data doesn't have to reposition
		// Linked list show current-previous-and next value in debug

		LinkedList link = new LinkedList();
		link.add(5);
		link.add(15);
		link.add(25);
		link.add(35);
		link.add(45);
		link.add(55);

		System.out.println(link.size());

		System.out.println(link.indexOf(35));
		
		System.out.println(link.get(0));
		
		for(int i=0;i<link.size();i++) { //looping one at a time
			System.out.println("Printing all elements by loop"+link.get(i));
		}
		
		
		
		
		
		
		
		
	}
}
