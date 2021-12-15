package java_oop_allTogether;

public abstract class AppleWatch {
	public void abstractClassinfo() {
		System.out.println("In the abstract class must use the abstract keyword for the abstract method."
				+ "\nOne regualr class can be extended and more than one interface implemented."
				+ "\nNon-abstract methods can be implemented."
				+ "\nAbstract class is a super class that can't create objects."
				+"\nDefault constructor can be implemented");
				
	}
	public abstract void appleWacthinfo();
	
	
	
	public AppleWatch() {
		System.out.println("Abstract class constructor");
	}
}
