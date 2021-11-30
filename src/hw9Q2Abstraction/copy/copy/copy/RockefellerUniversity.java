package hw9Q2Abstraction.copy.copy.copy;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {
	// public abstract void math(); --Abstract method can not be defined in a
	// regular class

	public RockefellerUniversity() {
		System.out.println("This is from RockefellerUniversity constructor");
	}

	public void statistics() {
		System.out.println("This class is about statistics");
	}

	@Override
	public void mehcanicalLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void aeronauticalInfo() {
		// TODO Auto-generated method stub

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
