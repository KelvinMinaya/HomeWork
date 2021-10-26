package hw3Q2variableAndMethod;

public class TestComputer {

	public static void main(String[] args) {

//variable initialized and method implemented
		Computer computer = new Computer();
		computer.Brand = "Apple";
		computer.Model = "MacBook Air";
		computer.Operatingsystem = "MacOS Mojave";
		computer.price = 800;
		computer.grade = 'A';
		computer.madeinUsa = false;
		computer.configuration();

		System.out.println("\n************************\n");

		Computer games = new Computer();
		games.Brand = "Dell";
		games.Model = "Dell Inspiron";
		games.Operatingsystem = "Windows Ten";
		games.price = 1000;
		games.grade = 'A';
		games.madeinUsa = true;
		games.configuration();
	}

}
