public class PEOne
{

	// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
	// The sum of these multiples is 23.
	// Find the sum of all the multiples of 3 or 5 below 1000.

	public static void main(String[] args)
	{

		int answer = 0;

		// Do things here
		// 1. Loop through 1-1000
		// 2. Check if divisible by 3 or 5
		// 3. Add

		for (int i = 1; i < 1000; i++)
		{
			if ((i % 3 == 0) || (i % 5 == 0))
			{
				answer += i;
			}
		}

		System.out.println(answer);

	}

}