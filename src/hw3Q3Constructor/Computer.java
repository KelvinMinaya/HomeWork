package hw3Q3Constructor;

public class Computer {

	public String Brand;
	public String Model;
	public String Operatingsystem;
	public int price;
	public char grade;
	public boolean madeinUsa;

	public Computer() {
		System.out.println("This is from defualt constructor of Computer class");
	}

	public Computer(String Brand, String Model, String Operatingsystem, int price, char grade, boolean madeinUsa) {
		this.Brand = Brand;
		this.Model = Model;
		this.Operatingsystem = Operatingsystem;
		this.price = price;
		this.grade = grade;
		this.madeinUsa = madeinUsa;

		System.out.println("Brand:" + Brand + "\nModel:" + Model + "\nOperating system:" + Operatingsystem + "\nPrice:"
				+ price + "\nGrade:" + grade + "\nMade in USA:" + madeinUsa);
	}

	public Computer(String Brand, int price, char grade) {

		this.Brand = Brand;
		this.price = price;
		this.grade = grade;

		System.out.println("Brand:" + Brand + "\nPrice:" + price + "\nGrade:" + grade);
	}

	public Computer(String Brand, int price, char grade, boolean madeinUsa, String Model) {

		this.Brand = Brand;
		this.price = price;
		this.grade = grade;
		this.madeinUsa = madeinUsa;
		this.Model = Model;

		System.out.println("Brand:" + Brand + "\nModel:" + Model + "\nPrice:" + price + "\nGrade:" + grade
				+ "\nMade in USA:" + madeinUsa);
	}

	public Computer(String Brand, char grade, int price, boolean madeinUsa, String Model) {

		this.Brand = Brand;
		this.price = price;
		this.grade = grade;
		this.madeinUsa = madeinUsa;
		this.Model = Model;

		System.out.println("Dell:" + Brand + "\nInspiron:" + Model + "\nOperating system:" + Operatingsystem
				+ "\nPrice:" + price + "\nGrade:" + grade + "\nMade in USA:" + madeinUsa);
	}

	public static void main(String[] args) {

	}

}
