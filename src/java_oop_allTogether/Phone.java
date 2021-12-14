package java_oop_allTogether;

public interface Phone extends Pager, Wakitaki {

	public void interfaceInfo();

	public void call();

	public void message();

	public void camera();

	public default void battery() {
		System.out.println("\n\nThis is the default interface exception method");
	}

	public static void wireless() {
		System.out.println("\n\nThis is the Static interface exception method");
	}
}
