package hw2Q2JavaVariables;

public class AboutUs {
//Variables declared
	public String MyName;
	public byte myAge;
	public short myRent;
	public int mySalary;
	public long myBankBalance;
	public char mySex;
	public float myHeight;
	public double myGrade;
	public boolean usCitizen;

//constructor declared
	public AboutUs() {
		System.out.println("This is all about me:");
	}

//method implemented
	public void aboutUs() {
		System.out.println("My name is:" + MyName + "\nMy age is" + myAge + "\nmy rent is" + myRent + "\nmy salary is"
				+ mySalary + "\nmybank balance is" + myBankBalance + "\nmy sex is" + mySex + "\nmy height is" + myHeight
				+ "\nmy grade is" + myGrade + usCitizen);

	}

	public static void main(String[] args) {

	}

}
