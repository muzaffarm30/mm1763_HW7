package hw7;

public class hw7 {

	public static void main(String[] args) {
		
		
		Cow mrsolearys = new Cow();
		Penguin opus = new Penguin();
		Tyrannosaur clarence = new Tyrannosaur();
		Octopus octopus = new Octopus();
		
		CowTester cowtest = new CowTester();
		PenguinTester penguintest = new PenguinTester();
		TyrannosaurTester tyrannsaurtest = new TyrannosaurTester();
		OctopusTester octopustest = new OctopusTester();
		
		
		if (cowtest.animaltestObject(mrsolearys))
		{
			System.out.println("Cow class passes");
		} 
		else 
		{
			System.out.println(">>>>Cow class Failed!<<<<");
			
		}
		
		if (penguintest.animaltestObject((opus))) 
		{ 
			System.out.println("Penguin class passes"); 
		}
		else 
		{
			System.out.println(">>>>Penguin class Failed!<<<<"); 
		}
		if (tyrannsaurtest.animaltestObject((clarence))) 
		{ 
			System.out.println("Tyrranosaur class passes"); 
		}
		else 
		{
			System.out.println(">>>>Tyrranosaur class Failed!<<<<"); 
		}
		
		if (octopustest.animaltestObject((octopus))) 
		{ 
			System.out.println("Octopus class passes"); 
		}
		else 
		{
			System.out.println(">>>>Octopus class Failed!<<<<"); 
		}
		
	}

}
