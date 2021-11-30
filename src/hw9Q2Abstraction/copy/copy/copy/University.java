package hw9Q2Abstraction.copy.copy.copy;

public interface University extends College, Hospital {
	public default void gymnasium() {

	}

	public static void library() {

	}
	/*
	 * The extends Keyword is used for inheritance. 1 Key word only and Interface
	 * can inherit more than one interface, but zero regular or abstract class The
	 * extends keyword is used for inheritance in Abstract class. Abstract class can
	 * inherit "one" regular or abstract class. Keyword "implement" used to inherit
	 * 1 or more Interface
	 * 
	 * 
	 * 
	 * 
	 */

	void vocationalinfo();
}
