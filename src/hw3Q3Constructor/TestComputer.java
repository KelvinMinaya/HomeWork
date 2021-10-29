package hw3Q3Constructor;

public class TestComputer {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Computer computer1 = new Computer("Apple", "MacBookAir", "MacOsMojave", 800, 'A', false);
		Computer computer2 = new Computer("Dell", "Inspiron", "Windows", 1000, 'A', true);
		Computer computer3 = new Computer("Windows", 1000, 'A');
		Computer computer4 = new Computer("Dell", 1000, 'A', true, "Inspiron");

	}

}
