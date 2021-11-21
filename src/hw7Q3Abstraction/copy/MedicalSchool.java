package hw7Q3Abstraction.copy;

public abstract class MedicalSchool extends NursingSchool {

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("Chemistry is learned in this lab");
	}

	/*
	 * The extends Keyword is used for inheritance. 1 Key word only and Abstract can
	 * inherit only 1 regular or abstract class
	 */
}
