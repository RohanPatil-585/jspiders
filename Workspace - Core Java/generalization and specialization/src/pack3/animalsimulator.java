package pack3;

public class animalsimulator 
{
	void makenoice(animal arg1)
	{
		if(arg1 instanceof cat )
		{
			System.out.println("passed object is cat");
			arg1.noice();
			System.out.println("---------------------------------");
			
			cat s1 = (cat) arg1;
			arg1.noice();
			
			System.out.println("---------------------------------");
			System.out.println();
			System.out.println();
		}
		else if(arg1 instanceof dog)
		{
			System.out.println("passed object is dog");
			arg1.noice();
			System.out.println("---------------------------------");
			
			dog d1 = (dog) arg1;
			arg1.noice();
			
			System.out.println("---------------------------------");
			System.out.println();
			System.out.println();
		}
		else if(arg1 instanceof snake)
		{
			System.out.println("passed object is snake");
			arg1.noice();
			System.out.println("---------------------------------");
			
			snake d1 = (snake) arg1;
			arg1.noice();
			
			System.out.println("---------------------------------");
			System.out.println();
			System.out.println();
		}
		//arg1.noice();
	}
}
