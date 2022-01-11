package collectionFrameWork;

import java.util.ArrayList;

public class ArrayListManipulation {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(5);
		al.add(15);
		al.add(25);
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//add to a specific index position
		al.add(1,55);//1 is the index and 55 is the value
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		
		}
		
		//Method to find the index position of a value
		System.out.println(al.indexOf(55));//55 is the value being held in the index
		
		//Method to remove and index
		System.out.println(al.remove(55));
		
		//add previous Array list elements
		ArrayList al1=new ArrayList();
		al1.add(105);
		al1.add(110);
		
		System.out.println("Second array list elements");
		for(int j=0;j<al1.size();j++) {
			System.out.println(al1.get(j));
		}
		
		//adding prevoius ArrayList elements
		
		al1.addAll(al);
		
		for(int k=0;k<al1.size();k++) {
		System.out.println(al1.get(k));
		}
		
		//Remove all elements
		System.out.println("ArrayList remove added list");
		al1.removeAll(al);
		for(int m=0;m<al1.size();m++) {
			System.out.println(al1.get(m));
			}
		
		//Retain selected and remove others
		System.out.println("Retain of selected elements");
		al1.retainAll(al);
		for(int L=0;L<al1.size();L++) {
			System.out.println(al1.get(L));
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
