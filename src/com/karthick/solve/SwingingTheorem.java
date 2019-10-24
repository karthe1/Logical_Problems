package com.karthick.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/**
 * 
 * @author karthick.r
 *
 */
public class SwingingTheorem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		int[] numbers = new int[testCases];
		int firstCubeNumber = 1;
		int secondCubeNumber = 1;
		int firstCubeValue = 0;
		List<Integer> firstAlgebraicCubeValues = new ArrayList<Integer>();
		List<Integer> secondAlgebraicCubeValues = new ArrayList<Integer>();
		List<Integer> sumofAllCubeValues = new ArrayList<Integer>();
		TreeMap<Object, Integer> theoremSatisfiedValues = null;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < numbers.length; i++) {
			while ((firstCubeNumber * firstCubeNumber * firstCubeNumber) < numbers[i]) {
				firstAlgebraicCubeValues.add(firstCubeNumber);
				firstCubeNumber++;
				continue;
			}

			while ((secondCubeNumber * secondCubeNumber * secondCubeNumber) < numbers[i]) {
				secondAlgebraicCubeValues.add(secondCubeNumber);
				secondCubeNumber++;
				continue;
			}

			for (int j = 0; j < firstAlgebraicCubeValues.size(); j++) {
				for (int j2 = j; j2 < secondAlgebraicCubeValues.size(); j2++) {
					firstCubeValue = (firstAlgebraicCubeValues.get(j) * firstAlgebraicCubeValues.get(j)
							* firstAlgebraicCubeValues.get(j))
							+ (secondAlgebraicCubeValues.get(j2) * secondAlgebraicCubeValues.get(j2)
									* secondAlgebraicCubeValues.get(j2));
					if (firstCubeValue < numbers[i]) {
						sumofAllCubeValues.add(firstCubeValue);
					}
				}
			}
			
			Collections.sort(sumofAllCubeValues);
			int occurence = 1;
			Object[] a = sumofAllCubeValues.toArray();
			theoremSatisfiedValues = new TreeMap<Object, Integer>();

			for (Object integer : a) {
				if (theoremSatisfiedValues.containsKey(integer)) {
					theoremSatisfiedValues.put(integer, occurence + 1);
				} else {
					theoremSatisfiedValues.put(integer, occurence);
				}
			}

			theoremSatisfiedValues.entrySet().removeIf(e -> e.getValue() == 1);
			
			if (theoremSatisfiedValues.isEmpty()) {
				System.out.println("-1");
			} else {
				System.out.println(theoremSatisfiedValues.lastEntry().getKey());
			}

			firstCubeNumber = 1;
			secondCubeNumber = 1;
			firstCubeValue = 0;

			firstAlgebraicCubeValues.clear();
			secondAlgebraicCubeValues.clear();
			sumofAllCubeValues.clear();
			theoremSatisfiedValues.clear();
		}
	}

}
