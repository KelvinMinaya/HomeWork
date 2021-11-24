package hw8Q3Abstraction.copy.copy;

public class ColumbiaUniversity extends NYUniversity {
	
	/*
	 * The extends Keyword is used for inheritance. 1 Key word only and regular class can
	 * inherit only 1 regular or abstract class
	 */
	
	
//public abstract void chemistry(); -- Abstract method can not be defined in a regular class

	public ColumbiaUniversity() {
		System.out.println("This is from the constructor");
	}

	public void biology() {
		System.out.println("Biology is a great way to learn about the human body");
	}

}
