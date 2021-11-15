package hw6Q2Inheritance;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();// child class of parent Animal

		Robin robin = new Robin();
		robin.robinInfo();
		robin.animalInfo();// Hierarchy shown

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();// Hierarchy shown

		Dog dog = new Dog();
		dog.dogInfo();

		BullDog bulldog = new BullDog();
		bulldog.bulldogInfo();
		bulldog.dogInfo();// Single Inheritance bulldog extending dog

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();// Hierarchy shown

		// Multiple Inheritance extending Reptile-animal, Snake-reptile, Cobra-snake
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();

	}

}
