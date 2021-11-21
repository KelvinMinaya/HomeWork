package hw7Q3Abstraction.copy;

public interface University extends College,Hospital{
	public default void gymnasium() {

	}

	public static void library() {

	}
	/*
	 * The extends Keyword is used for inheritance. 1 Key word only and Interface can
	 * inherit more than one interface, but zero regular or abstract class
	 */
}
