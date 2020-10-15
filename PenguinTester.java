package hw7;

public class PenguinTester  implements AnimalTester{

	@Override
	public boolean animaltestObject(Object animal) {
		// TODO Auto-generated method stub
		
		if(animal instanceof Penguin) {
			Penguin penguin = new Penguin();
			
			if(penguin.aboutMe().equals("penguin") && penguin.IEat().equals("mostly fish") && penguin.perform().equals("waddle and swim"))
				return true;
			
		}
		return false;
	}

}
