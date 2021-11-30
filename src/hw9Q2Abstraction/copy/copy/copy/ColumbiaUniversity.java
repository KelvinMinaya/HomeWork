package hw9Q2Abstraction.copy.copy.copy;

public class ColumbiaUniversity extends MedicalSchool implements VocationalSchool, University {

	/*
	 The extends keyword is used for inheritance in Regular class.
	 * Regular class can inherit "one" regular or abstract class. Keyword "implement"
	 * used to inherit 1 or more Interface
	 */
	
	
	

	public ColumbiaUniversity() {
		System.out.println("This is from the default constructor");
	}
	public static void columbiaStat() {
		
	}
	
	
	public void biology() {
		System.out.println("Biology is a great way to learn about the human body");
	}

	
	public void mehcanicalLab() {
		
		
	}

	public void vocationalinfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}



	public void columbiaInfo() {
		// TODO Auto-generated method stub
		
	}



	public void library() {
		// TODO Auto-generated method stub
		
	}

}
