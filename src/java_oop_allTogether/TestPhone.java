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
		// part 5
		GetSet find = new GetSet();
		find.setInfo("Kelvin");
		find.setPrice(750);
		find.setSex('M');
		find.isMadeInUsa();

		System.out.println("\n" + find.getInfo() + " bought this phone in 2000" + "\nThe price was:" + find.getPrice()
				+ "\nUser's sex:" + find.getSex() + "\nThis phone was made in USA:" + find.isMadeInUsa());

		// part 6

		Iphone6 I6 = new Iphone6();
		I6.wakitakitea();
		I6.battery();
		I6.appleWacthinfo();
		I6.call();
		I6.camera();
		I6.message();
		I6.abstractClassinfo();
		I6.regularClassInfo();
		I6.pagers();
		I6.interfaceInfo();
		I6.camera1();
		I6.musicVideo();
		I6.picture();
		I6.screen();

		// Iphone2 and 3 extending 1 is Hierarchical inheritance
		// Iphone 4 into 2 and iphone 5 into 4 and Iphone 6 into 5 is multi level
		// inheritance

		// part7

	}
}
