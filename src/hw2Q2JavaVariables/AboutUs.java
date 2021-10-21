package hw2Q2JavaVariables;

public class AboutUs {
//Variables initialized
	public String thisName = "Kelvin";
	public byte myAge = 39;
	public short myRent = 1000;
	public int mySalary = 120000;
	public long myBankBalance = 200000000l;
	public char mySex = 'M';
	public float myHeight = 1.80f;
	public double myGrade = 4.0459877895;
	public boolean usCitizen = true;

	public AboutUs() {
		System.out.println("This is all about me:");
	}

//method implemented
	public void aboutUs(String[] args) {
		System.out.println(
				thisName + +myAge + +myRent + +mySalary + +myBankBalance + +mySex + +myHeight + +myGrade + usCitizen);

	}

}
