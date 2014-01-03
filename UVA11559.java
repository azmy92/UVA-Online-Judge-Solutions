package uva;

import java.util.LinkedList;
import java.util.Scanner;

public class UVA11559 {
	public static void main(String[] args) {
		int pnum, budget, hotels, weeks, pcost = 0;
		Scanner inputScanner = new Scanner(System.in);
		while (inputScanner.hasNext()) {
			pnum = inputScanner.nextInt();
			budget = inputScanner.nextInt();
			hotels = inputScanner.nextInt();
			weeks = inputScanner.nextInt();
			int minCost = 90000000;
			for (int i = 0; i < hotels; i++) {
				pcost = inputScanner.nextInt();
				int availableeds;
				boolean available = false;
				for (int j = 0; j < weeks; ++j) {
					availableeds = inputScanner.nextInt();
					if (availableeds >= pnum) {
						available = true;
						inputScanner.nextLine();
						break;
					}
				}
				if (available && minCost > pcost * pnum) {
					minCost =  pcost * pnum;
				}
			}
			if (minCost > budget)
				System.out.println("stay home");
			else
				System.out.println(minCost);
			
		}
	}
}
