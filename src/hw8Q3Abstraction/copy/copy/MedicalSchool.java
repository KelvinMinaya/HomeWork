package hw8Q3Abstraction.copy.copy;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
					//can extend one regular class or implement one interface
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("Chemistry is learned in this lab");
	}

	/*
	 * The extends Keyword is used for inheritance. 1 Key word only and Interface can
	 * inherit more than one interface, but zero regular or abstract class
	 * The extends keyword is used for inheritance in Abstract class.
	 * Abstract class can inherit "one" regular or abstract class. Keyword "implement"
	 * used to inherit Interface 
	 * MedicalSchool abstract extends NursingSchool abstract and implements interface LawSchool
	 * 2 inheritance are possible abstract class
	 * 
	 * 
	 */
}
