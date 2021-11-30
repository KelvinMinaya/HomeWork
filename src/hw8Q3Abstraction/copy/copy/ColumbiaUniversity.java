package hw8Q3Abstraction.copy.copy;

public class ColumbiaUniversity extends EngineeringSchool implements VocationalSchool, University {

	/*
	 The extends keyword is used for inheritance in Regular class.
	 * Regular class can inherit "one" regular or abstract class. Keyword "implement"
	 * used to inherit 1 or more Interface
	 */
	
	
	

	public ColumbiaUniversity() {
		System.out.println("This is from the constructor");
	}
	
	public void biology() {
		System.out.println("Biology is a great way to learn about the human body");
	}

	
	public void mehcanicalLab() {
		
		
	}

	public void vocationalinfo() {
		// TODO Auto-generated method stub
		
	}

}
