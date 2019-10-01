package com.karthick.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author karthick.r
 *
 */
public class LoneInteger {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());

		while (testCases > 0) {
			int noOfIntegers = Integer.parseInt(br.readLine());
			int increaseOccurence = 1;
			int loneInteger = 0;
			String[] arrayInputs = br.readLine().split(" ");
			if (noOfIntegers == arrayInputs.length) {
				Map<String, Integer> occurences = new HashMap<String, Integer>();
				for (String string : arrayInputs) {
					if (occurences.containsKey(string)) {
						occurences.put(string, increaseOccurence + 1);
					} else {
						occurences.put(string, increaseOccurence);
					}
				}
				for (Map.Entry<String, Integer> string : occurences.entrySet()) {
					if (string.getValue() % 2 == 1) {
						loneInteger++;
					}
				}
				if (loneInteger > 0)
					System.out.println(loneInteger);
				else
					System.out.println("-1");
			} else {
				System.err.append("Invalid Integer array length");
			}
			testCases--;
		}
	}
}