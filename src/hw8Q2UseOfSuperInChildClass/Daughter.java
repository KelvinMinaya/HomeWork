package hw8Q2UseOfSuperInChildClass;

public class Daughter extends Father {
	public String nameString;
	public int age;

	public Daughter() {
		super();
		super.nameString = "Kelvin";
		super.age = 39;
		super.sex = 'M';
		super.usCitizen = false;
		System.out.println("This is the Default Daughter constructer");
		System.out.println("Name:" + nameString + "\nAge:" + age + "\nSex:" + sex + "\nUsCitizen:" + usCitizen);
	}

	public Daughter(String nameString, int age) {
		super.fatherinfo("James", 30, 'M', true);
		super.familyName = familyName;
		this.nameString = nameString;
		this.age = age;
		System.out.println("Name:" + nameString + "\nAge:" + age);
		System.out.println("Name:" + nameString + "\nAge:" + age + "\nSex:" + sex + "\nUsCitizen:" + usCitizen);
	}

	public void daughter() {
		super.fatherinfo("Charlie", 30, 'F', true);
		super.nameString = "Lily";
		super.age = 30;
		super.sex = 'F';
		super.usCitizen = true;
		System.out.println("Name:" + nameString + "\nAge:" + age + "\nSex:" + sex + "\nUsCitizen:" + usCitizen);
		System.out.println("This is from the Daughter method");
	}

	public void daughterInfo(String nameString, int age) {
		super.fatherinfo("Jane", 32, 'F', true);
		super.nameString = "Josh";
		super.age = 30;
		super.sex = 'F';
		super.usCitizen = true;
		System.out.println("Name:" + nameString + "\nAge:" + age + "\nSex:" + sex + "\nUsCitizen:" + usCitizen);
		System.out.println("Name:" + nameString + "\nAge:" + age);

	}

}
