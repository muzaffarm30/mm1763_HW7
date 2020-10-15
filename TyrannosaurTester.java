package hw7;

public class TyrannosaurTester implements AnimalTester {

	@Override
	public boolean animaltestObject(Object animal) {
		// TODO Auto-generated method stub
		if(animal instanceof Tyrannosaur) {
			Tyrannosaur tyrannosaur = new Tyrannosaur();
			
			if(tyrannosaur.aboutMe().equals("Tyranosaurus Rex") && tyrannosaur.IEat().equals("other dinosaurs") && tyrannosaur.perform().equals("Roarrrr!"))
				return true;
			
		}
		
		return false;
	}

}
