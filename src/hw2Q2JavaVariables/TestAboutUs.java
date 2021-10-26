package hw2Q2JavaVariables;

public class TestAboutUs {

// method implemented
	public static void main(String[] args) {
// object created and variable initialized
//		constructor initialized
		AboutUs au = new AboutUs();
		au.MyName = "Kelvin";
		au.myAge = 39;
		au.myRent = 1000;
		au.mySalary = 120000;
		au.myBankBalance = 200000000l;
		au.mySex = 'M';
		au.myHeight = 1.80f;
		au.myGrade = 4.0459877895;
		au.usCitizen = true;
		au.aboutUs();

		AboutUs alex = new AboutUs();
		alex.MyName = "Alex";
		alex.myAge = 49;
		alex.myRent = 1200;
		alex.mySalary = 130000;
		alex.myBankBalance = 250000000l;
		alex.mySex = 'F';
		alex.myHeight = 3.80f;
		alex.myGrade = 4.0459877895;
		alex.usCitizen = true;
		alex.aboutUs();
	}

}
