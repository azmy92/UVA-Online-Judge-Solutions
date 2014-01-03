package uva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
 * UVA 10420
 */
public class ListOfConquest {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int numCases = inputScanner.nextInt();
		ArrayList<String> countries = new ArrayList<String>(500);
		// System.out.println(numCases);
		while (numCases-- >= 0) {
			String country = inputScanner.nextLine().split(" ")[0];
			if (!(country.equalsIgnoreCase("")))
				countries.add(country);
		}
		String[] keys = countries.toArray(new String[0]);
		Arrays.sort(keys);
		String current = keys[0];
		int count = 0;
		for (String key : keys) {
//			System.out.println(";;;;;;;;;" + key);
			 if(!key.equalsIgnoreCase(current)){
			 System.out.println(current+" "+count);
			 count = 0;
			 current = key;
			 }
			 ++count;
		}
		if (count > 0)
			System.out.println(current + " " + count);
	}
}
