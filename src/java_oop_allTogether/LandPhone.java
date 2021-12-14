package java_oop_allTogether;

public class LandPhone extends SatellitePhone implements Phone {

	public static void main(String[] args) {

	}

	@Override
	public void interfaceInfo() {
		System.out.println("A constructor can not be allowed in an Interface."
				+ "\n\nAn interface can't instiate objects." + "\n\nAn interface can extend more than one interface.");

	}

	@Override
	public void call() {
		System.out.println("\n\nToday is a good day");

	}

	@Override
	public void message() {
		System.out.println("\n\nFreedom is always the goal");

	}

	@Override
	public void camera() {
		System.out.println("\n\nTake life one moment at a time");

	}

	@Override
	public void pagers() {
		System.out.println("\n\nA new year for a new chapter");

	}

	@Override
	public void wakitakitea() {
		System.out.println("\n\nThe door is open");

	}

	@Override
	public void Satellite() {
		System.out.println("\n\nThis is why we sacrifice");

	}

}
