package hw7;

public class CowTester implements AnimalTester {

	@Override
	public boolean animaltestObject(Object animal) {
		// TODO Auto-generated method stub
		
		if(animal instanceof Cow) {
			Cow cow = new Cow();
			
			if(cow.aboutMe().equals("Cow") && cow.IEat().equals("grass, hay, and corn") && cow.perform().equals("milk and cheese"))
				return true;
			
		}
		return false;
	}

}
