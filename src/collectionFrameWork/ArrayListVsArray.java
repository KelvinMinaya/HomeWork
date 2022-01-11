package collectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListVsArray {

	public static void main(String[] args) {
		//Array//iterator() method not possible for regular array
		int [] arr=new int[5];
		arr[0]=5;
		
		//size
		System.out.println(arr.length);

		//Array list is part of the collection framework
		ArrayList al=new ArrayList();// initial capacity is 10(default) will increaase dynamically
		al.add(5);
		al.add(15);
		al.add(25);
		al.add(35);
		al.add(45);
		al.add(55);
		al.add(5);
		al.add(5);
		al.add(5);
		al.add(5);
		//this is not capacity but size check of the Arraylist
		System.out.println(al.size());
		//print index count
		
		System.out.println(al.get(1));// getting a single index
		//for loop count
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		//iterator() object looping method for collection framework
		Iterator it =al.iterator();
		while(it.hasNext());{
			
		}
		
		
		
		
	}

}
