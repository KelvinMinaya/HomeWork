package hw3Q4Constructor;

public class Student {
	public String StName;
	public int StId;
	public char Sex;
	public boolean Programmer;
	public float grade;

	public Student() {
		System.out.println("This is from default Constructor of Student class");
	}

	public Student(String StName, int StId, char Sex, float grade, boolean Programmer) {
		this.StName = StName;
		this.StId = StId;
		this.Sex = Sex;
		this.Programmer = Programmer;
		this.grade = grade;

		System.out.println("Student Name:" + StName + "\nID" + StId + "\nSex:" + Sex + "\nGrade:" + grade
				+ "\nProgrammer:" + Programmer);
	}

	public void student(String StName, int StId, char Sex, boolean Programmer, float grade) {
		this.StName = StName;
		this.StId = StId;
		this.Sex = Sex;
		this.Programmer = Programmer;
		this.grade = grade;
		System.out.println("Student Name:" + StName + "\nID:" + StId + "\nSex:" + Sex + "\nGrade:" + grade
				+ "\nProgrammer:" + Programmer);
	}

	public static void main(String[] args) {

	}
}
