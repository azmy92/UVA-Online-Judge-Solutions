package uva;

import java.util.Arrays;
import java.util.Scanner;

public class UVA11799 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int numCases = inputScanner.nextInt();
		int numc = numCases;
		inputScanner.nextLine();
		while (numCases-- > 0) {
			String[] velocities = inputScanner.nextLine().split(" ");
			int[] velocitiesInt = new int[velocities.length];
			for (int i = 0; i < velocities.length; ++i) {
				velocitiesInt[i]= Integer.parseInt(velocities[i]);
			}
			Arrays.sort(velocitiesInt);
			System.out.println("Case " + (-1 * (numCases - numc)) + ": "
					+ velocitiesInt[velocitiesInt.length - 1]);
		}

	}

}
