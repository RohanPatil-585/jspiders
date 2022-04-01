package infosys;

public class Palindrom 
{
	public static void main(String[] args) 
	{
		int number = 121;
		int reminder = 0;
		int storage = 0;
		int num = number;
		while(number > 0)
		{
			reminder = number % 10;
			storage = (storage*10) + reminder;
			number = number / 10;
		}
		if(storage == num)
		{
			System.out.println("number is palinndrom...");
		}
		else
		{
			System.out.println("number is not palindrom...");
		}
	}
}