package collectionFrameWork;

import java.util.Stack;

public class StackDataStructure {

	public static void main(String[] args) {
		// Create the stack

		Stack st = new Stack();

		// Add the elements
		st.add(5);// Tail
		st.addElement(10);
		st.push(25);// Head

		System.out.println(st.size());// How many indexes are there

		System.out.println(st.capacity());// 10 is the initial capacity and then dynamically adds more
		// More elements added
		st.add(5555);
		st.addElement(110);
		st.addElement(110);
		st.addElement(110);
		st.addElement(110);
		st.addElement(110);
		st.addElement(110);
		st.push(2500);
		st.push(2500);
		System.out.println("This capacity doubles: " + st.capacity());// This will jump to 20(capacity doubles) after
																		// the additions
		System.out.println(st);// prints the entire bucket

		System.out.println(st);// printing the objects not the value

		for (int i = 0; i < st.size(); i++) {
			System.out.println("New capacity after adding more elements: " + st.get(i));// printing the values
		}

		// Showing the item on top.(25)
		System.out.println("The top item: " + st.peek());

		// Using the pop() method removes the peek item(25) and shows remaining
		System.out.println(st.pop());
		
		//To see if its empty in boolean true or false
		System.out.println(st.empty());

	}
}
