package uva;

import java.util.Arrays;
import java.util.Scanner;

public class UVA10189 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String line = "";
		String lineNext="";
		int casenum=0;
		while (true) {
			++casenum;
			line = inputScanner.nextLine();
			if (line.equalsIgnoreCase("0 0"))
				break;
			int rows = Integer.parseInt(line.split(" ")[0]);
			int cols = Integer.parseInt(line.split(" ")[1]);
			int[][] nums = new int[rows][cols];
			String row = "";
			for (int i = 0; i < rows; ++i) {
				row = inputScanner.nextLine();
				for (int j = 0; j < cols; ++j) {
					if (row.charAt(j) == '*') {
						nums[i][j] = -100;
						updateNums(i, j, nums);
					}
				}
			}
			printNums(nums,casenum);
		}

	}

	private static void printNums(int[][] nums, int casenum) {
		System.out.println("Field #"+casenum+":");
		for(int i=0;i<nums.length;++i){
			String row="";
			for(int j =0;j<nums[0].length;++j){
				if(nums[i][j]<0)
					row+="*";
				else
					row+=nums[i][j];
			}
			System.out.println(row);
		}
		System.out.println();
		
	}

	private static void updateNums(int i, int j, int[][] nums) {
		// TODO Auto-generated method stub
		if (i - 1 >= 0) {
			nums[i - 1][j] = nums[i - 1][j] + 1;
		}
		if (i + 1 < nums.length) {
			nums[i + 1][j] = nums[i + 1][j] + 1;
		}
		if (j + 1 < nums[0].length) {
			nums[i][j + 1] = nums[i][j + 1] + 1;
		}
		if (j - 1 >= 0) {
			nums[i][j - 1] = nums[i][j - 1] + 1;
		}
		if (j + 1 < nums[0].length && i - 1 >= 0) {
			nums[i - 1][j + 1] = nums[i - 1][j + 1] + 1;
		}
		if (j - 1 >= 0 && i - 1 >= 0) {
			nums[i - 1][j - 1] = nums[i - 1][j - 1] + 1;
		}
		if (j + 1 < nums[0].length && i + 1 < nums.length) {
			nums[i + 1][j + 1] = nums[i + 1][j + 1] + 1;
		}
		if (j - 1 >= 0 && i + 1 < nums.length) {
			nums[i + 1][j - 1] = nums[i + 1][j - 1] + 1;
		}

	}

}
