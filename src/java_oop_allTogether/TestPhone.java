package java_oop_allTogether;

public class TestPhone {
	public static void main(String[] args) {

		LandPhone iphone = new LandPhone();
		iphone.interfaceInfo();
		iphone.battery();
		iphone.camera();
		iphone.call();
		iphone.pagers();
		iphone.wakitakitea();
		iphone.Satellite();

		// part 4
		Iphone1 phone1 = new Iphone1();
		phone1.abstractClassinfo();
		phone1.regularClassInfo();
		phone1.appleWacthinfo();
		phone1.battery();
		phone1.appleWacthinfo();
		phone1.call();
		phone1.camera();
		phone1.message();
		//part 5
		GetSet find = new GetSet();
		find.setInfo("Kelvin");
		find.setPrice(750);
		find.setSex('M');
		find.isMadeInUsa();

		System.out.println("\n" + find.getInfo() + " bought this phone in 2000" + "\nThe price was:" + find.getPrice()
				+ "\nUser's sex:" + find.getSex() + "\nThis phone was made in USA:" + find.isMadeInUsa());

	}
}
