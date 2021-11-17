package hw6Q3Abstraction;

public interface College {
	public void commonRoom();

	public void laboratory();

	public void languageClub();
}
// You can't create a constructor because it is called by an object. Interface cannot be instantiated