import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_Perfect_Numbers {

	/**
	 * Simple way to get perfect numbers below any number (
	 */
	public static void main(String[] args) {

		long upTo = 1;

		System.out.print("Enter a number: ");

		// open up standard input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			upTo = Long.parseLong(br.readLine());
		} catch (IOException ioe) {
			System.out.println("IO error trying to read the number!");
			System.exit(1);
		} catch (NumberFormatException e) {
			System.out.println("Parsing error trying to read the number!");
			System.exit(1);
		} catch (Exception e) {
			System.out.println("Error trying to read the number!");
			System.exit(1);
		}

		for (long i = 1; i <= upTo; i++) {
			long currentIteration = i;
			long count = 0;
			for (long j = 1; j < currentIteration; j++) {
				if (currentIteration % j != 0)
					continue;

				if (currentIteration % j == 0)
					count = count + j;
			}
			if (count == currentIteration)
				System.out.println(currentIteration);
		}

	}

}
