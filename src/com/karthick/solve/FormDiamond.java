package com.karthick.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author karthick.r
 *
 */
public class FormDiamond {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		String[] input = new String[2];
		int floors;
		int windows;
		input = br.readLine().split(" ");

		floors = Integer.parseInt(input[0]);
		windows = Integer.parseInt(input[1]);

		while (testCases > 0) {
			String a[] = new String[floors];
			for (int i = 0; i < floors; i++) {
				String s1 = br.readLine();
				a[i] = s1.replace(" ", "");
			}

			int totalNoDiamonds = 0;
			int sides = 0;
			for (int i = 0; i < a.length; i++) {
				if (i != a.length - 1) {
					char a1[] = a[i].toCharArray();
					char a2[] = a[i + 1].toCharArray();
					for (int j = 0; j < a1.length; j++) {
						if (j != a1.length - 1) {
							if ((a1[j] == '/') && (a2[j] == '\\') && (a1[j + 1] == '\\') && (a2[j + 1] == '/')) {
								totalNoDiamonds++;
							}
						}
					}
				}
			}
			System.out.println("Total no of diamond is : " + totalNoDiamonds);
			testCases--;
		}

	}

}
