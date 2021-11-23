package hw8Q2UseOfSuperInChildClass;

public class Father {

	public String nameString;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {

		System.out.println("This is from the Father class");

	}

	public Father(String nameString, int age, char sex, boolean usCitizen) {
		this.nameString = nameString;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		this.familyName = familyName;

		System.out.println("Name:" + nameString + "\nAge:" + age + "\nSex:" + sex + "\nUsCitizen:" + usCitizen);
	}

	public void fathers() {
		System.out.println("This is from the father method");
	}

	public void fatherinfo(String nameString, int age, char sex, boolean usCitizen) {
		System.out.println("Name:" + nameString + "\nAge:" + age + "\nSex:" + sex + "\nUsCitizen:" + usCitizen);

	}

}
