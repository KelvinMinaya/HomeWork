package hw9Q2Abstraction.copy.copy.copy;

public abstract class NursingSchool extends RockefellerUniversity {
	public abstract void hygiene();

	public void caring() {
		System.out.println("Intensive care patient files are here");
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene1() {
		// TODO Auto-generated method stub

	}
}
//You can't create a constructor because it is called by an object. Abstract class cannot be instantiate