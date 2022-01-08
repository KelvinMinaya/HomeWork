package arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayHatrogenious {
	//when a type isn't set you can use any including duplicate.
	//You must add Iterator type
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();	
		al.add(5);
		al.add(5.5);
		al.add(55555);
		al.add('5');
		al.add("Sohag");
		al.add("Sohag");
		//You must add Iterator type with while loop
		Iterator it=al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
		
		
	}

}
