package hw7;

public class Cow  implements Animal{
	
	@Override
	public String IEat() {
		// TODO Auto-generated method stub
		return "grass, hay, and corn";
	}

	@Override
	public String perform() {
		// TODO Auto-generated method stub
		return "milk and cheese";
	}

	@Override
	public String aboutMe() {
		// TODO Auto-generated method stub
		return "Cow";
	}

}
