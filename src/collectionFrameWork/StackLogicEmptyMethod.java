package collectionFrameWork;

import java.util.Scanner;
import java.util.Stack;

public class StackLogicEmptyMethod {

	public static void main(String[] args) {
		Stack sc1 = new Stack();
		sc1.push("Sohag");
		sc1.push("Sarah");
		sc1.push("Charlie");
		sc1.push("James");

		for (int i = 0; i < 4; i++) {// <4 sets the loop limit condition. If set to 5 else stmt will be included
			if (!sc1.empty()) {// !expects the opposite therefore boolean has to be true. Default is false
				sc1.pop();// removes the top(peek()method)index
				System.out.println(sc1);// Then the remainder is printed
			} // The loop is stopped therefore else statement won't print after pop emptied
				// all.
			else {
				System.out.println("There's nothting left to remove");
			}

		}

	}

}
