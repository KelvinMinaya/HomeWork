package hw8Q2UseOfSuperInChildClass;

public class TestFamilyClass {
	public static void main(String[] args) {
		System.out.println("---------- default constructor----------");
		Father father = new Father();

		System.out.println("\n---------- parameterized constructor ----------");
		Father father2 = new Father("Tofael", 483, 'M', false);

		System.out.println("\n---------- void type method ---------");
		father2.fatherinfo("Kelvin", 25, 'M', false);

		System.out.println("\n---------- parameterized method----------");
		father2.fatherinfo("Shay", 22, 'F', true);

		System.out.println("\n---------- default constructor----------");
		Daughter daughter = new Daughter();

		System.out.println("\n---------- parameterized constructor ----------");
		Daughter daughter2 = new Daughter("Kelly", 20);

		System.out.println("\n---------- void type method ----------");
		daughter2.daughter();

		System.out.println("\n---------- parameterized method ----------");
		daughter2.daughterInfo("James", 32);

	}
}
