package uva;

import java.util.Scanner;

public class UVA10646 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int numCases = inputScanner.nextInt();
		inputScanner.nextLine();
		String currInLine = "";
		String[] cards;
		int casenum = 0;
		while (numCases-- > 0) {
			++casenum;
			currInLine = inputScanner.nextLine();
			cards = currInLine.split(" ");
			int shift = 0;
			int y = 0;
			for (int i = 26; i >= 24; --i) {
				String curr = cards[i];
				if (value(curr) == 10) {
					shift+=1;
					y+=10;
				} else {
					shift+=2;
					y+=9;
				}
			}
			String result = cards[y+shift-1];
			System.out.println("Case "+casenum+": "+result);
		}

	}

	private static int value(String curr) {
		char first = curr.charAt(0);
		try {
			int tenth = Integer.parseInt(first + "");
			if (tenth >= 2 && tenth <= 9)
				return 9;
			else
				return 10;
		} catch (Exception e) {
			return 10;
		}
	}

}
