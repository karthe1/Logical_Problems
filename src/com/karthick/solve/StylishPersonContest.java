package com.karthick.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author karthick.r
 *
 */
public class StylishPersonContest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		int cases = 0;
		while (testCases > 0) {
			int totalPoints = 0;
			int a[] = new int[Integer.parseInt(br.readLine())];
			String judgesPoints = br.readLine();
			String pointsArray[] = judgesPoints.split(" ");
			if (a.length == pointsArray.length) {
				for (int i = 0; i < pointsArray.length; i++) {
					if ((i + 1) % 2 == 0)
						a[i] = 0;
					else
						a[i] = Integer.parseInt(pointsArray[i]);
					totalPoints = totalPoints + a[i];
				}
				cases = cases + 1;
				System.out.println("Case " + cases + ": " + totalPoints);
			}
			testCases--;
		}
	}
}
