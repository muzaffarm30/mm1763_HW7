package hw7;

public class OctopusTester implements AnimalTester {

	@Override
	public boolean animaltestObject(Object animal) {
		// TODO Auto-generated method stub
		
		if(animal instanceof Octopus) {
			Octopus octopus = new Octopus();
			
			if(octopus.aboutMe().equals("octopus") && octopus.IEat().equals("prawns, fish") && octopus.perform().equals("climbs tree"))
				return true;	
		}
		return false;
	}

}
