package collectionFrameWork;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList link = new LinkedList();

		link.add(5);
		link.add(65);
		link.add(58);
		link.add(0, 15);
		System.out.println("After using add(index,value)" + link.get(0));
		System.out.println(link);// --prints all values

		link.addFirst(25);// Will replace first position index
		System.out.println("After using addFirst()" + link.get(0));
		System.out.println(link);

		link.addLast(100);// Will replace last position index
		// System.out.println("After using addLast()" + link.get(3));
		System.out.println(link);

		link.set(2, 200);// 0 is the index position with set method you can pick an index ex.(3,200)
		System.out.println("After using set()" + link);

		link.contains(200);// Boolean true or false answer. Is it there?
		System.out.println("After using contains()" + link);
		
//		link.remove();//If no index is there zero will be removed
//		link.remove(3);//This removes a specific index

//		link.clear();This method clears everything out
//				System.out.println("After using clear"+link);

	}

}
