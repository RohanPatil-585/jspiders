package pack3;

public class animals_noice
{
	public static void main(String[] args) 
	{		
		animalsimulator a1 = new animalsimulator();
		
		cat c1 = new cat();
		dog d1 = new dog();
		snake s1 = new snake();
		
		a1.makenoice(c1);
		a1.makenoice(d1);
		a1.makenoice(s1);
	}
	
	
}