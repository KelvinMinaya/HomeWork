package hw9Q2Abstraction.copy.copy.copy;

public abstract class NursingSchool extends RockefellerUniversity {
	public abstract void hygiene();

	public void caring() {
		System.out.println("Intensive care patient files are here");
	}
}
//You can't create a constructor because it is called by an object. Abstract class cannot be instantiate