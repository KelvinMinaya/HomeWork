package hw8Q3Abstraction.copy.copy;

public abstract class NursingSchool {
	public abstract void hygiene();

	public void caring() {
		System.out.println("Intensive care patient files are here");
	}
}
//You can't create a constructor because it is called by an object. Abstract class cannot be instantiate