import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number");
		boolean flag = false;
		int num = reader.nextInt();	
		for (int i=2; i <= Math.sqrt(num); i++)
		{
			if (num%i ==0)
			{
				
				flag = true;
				break;
			}
		
		}
		
		if (num < 2)
			System.out.println("Enter a number greater than 1");
		else if (flag == false)
			System.out.println(Integer.valueOf(num) + " is prime");
		else
			System.out.println(Integer.valueOf(num) + " is not prime");
		
	}
}
