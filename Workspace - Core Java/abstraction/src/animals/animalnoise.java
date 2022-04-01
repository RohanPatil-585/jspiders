package animals;

public class animalnoise 
{
	public static void main(String[] args) 
	{
		animalsimulator a1 = new animalsimulator();
		cat c1 = new cat();
		dog d1 = new dog();
		snake s1 = new snake();
		
		a1.makenoise(s1);
		a1.makenoise(d1);
		a1.makenoise(c1);
	}
}
