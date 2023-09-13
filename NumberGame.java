import java.util.Scanner;

public class NumberGame {

	public static void
	guessingNumber()
	{
		Scanner sc = new Scanner(System.in);
          int number = 1 + (int)(100
							* Math.random());

		int five= 5;

		int i, guess;

		System.out.println(
			"A number is chosen"
			+ " between 1 to 100."
			+ "Guess the number"
			+ " within 5 trials.");

		for (i = 0; i < five; i++) {

			System.out.println(
				"Guess the number:");

			guess = sc.nextInt();

			if (number == guess) {
				System.out.println(
					"Congratulations!"
					+ " You guessed the number.");
                System.out.println("Well played");

				break;
			}
			else if (number > guess
					&& i != five - 1) {
				System.out.println(
					"The number is "
					+ "greater than " + guess);
			}
			else if (number < guess
					&& i != five - 1) {
				System.out.println(
					"The number is"
					+ " less than " + guess);
			}
		}

		if (i == five) {
			System.out.println(
				"You have exhausted"
				+ " five trials.");

			System.out.println(
				"The number was " + number);
            
            System.out.println("Well played");
		}
	}

	public static void
	main(String arg[])
	{
		guessingNumber();
	}
}
