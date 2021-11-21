package hw7Q2Encapsulation;

public class TestEmployee {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setName("Kelvin");
		employee.setAge(39);
		employee.setSex('M');
		employee.setUsCitizen(true);

		System.out.println("Name:" + employee.getName() + "\nAge:" + employee.getAge() + "\nSex:" + employee.getSex()
				+ "\nU.S.Citizen:" + employee.isUsCitizen());

	}

}
