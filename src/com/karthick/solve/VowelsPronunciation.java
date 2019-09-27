package com.karthick.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author karthick.r
 *
 */
public class VowelsPronunciation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String pronunciationInput[] = br.readLine().split(" ");
		String inputString = br.readLine();
		int stringLength = Integer.parseInt(pronunciationInput[0]);
		int alreadyExistingElements = Integer.parseInt(pronunciationInput[1]);
		boolean isVowel[] = new boolean[stringLength];

		/**
		 * To check the hard pronunciation from a given input string, Limak
		 * decided to add the below code snippet to create boolean values of an
		 * array. It requires an array of booleans isVowel of length n to set
		 * the values based on vowel letters present in the input string.
		 */
		String vowelstring = "aeiouy";
		for (int i = 0; i < stringLength; i++) {// indices 0, 1, ..., n-1
			for (int j = 0; j < vowelstring.length(); j++) {
				if (inputString.charAt(i) == vowelstring.charAt(j))
					isVowel[i] = true;
			}
		}

		/**
		 * The below code snippet is used for setting binary values to an array
		 * based on provided input that describes no.of.boolean has already
		 * existed in an array. E.g : Existing = 2 & String length = 6 means set
		 * the array is 110000.  
		 */
		char[] hardPronunciation = new char[stringLength];
		for (int i = 0; i < stringLength; i++) {
			if (alreadyExistingElements > 0)
				hardPronunciation[i] = '1';
			else
				hardPronunciation[i] = '0';
			alreadyExistingElements--;
		}
		System.out.println(Arrays.toString(hardPronunciation));

		/**
		 * Below code snippet identifies possible combinations from the hard
		 * pronunciation array. E.g : Identifies possible combinations for array
		 * value [1,1,0,0,0] and add it into the map.
		 */
		Map<Integer, String> hardPronunciationMap = new HashMap<Integer, String>();
		char temp;
		int key = 1;
		for (int a = 1; a <= hardPronunciation.length; a++) {
			for (int i = 0; i < hardPronunciation.length - 1; i++) {
				if (i != hardPronunciation.length - 1) {
					temp = hardPronunciation[i];
					hardPronunciation[i] = hardPronunciation[i + 1];
					hardPronunciation[i + 1] = temp;
					hardPronunciationMap.put(key, Arrays.toString(hardPronunciation).replaceAll("(\\[|\\]|\\, )", ""));
					key++;
				} else {
					hardPronunciationMap.put(key, Arrays.toString(hardPronunciation).replaceAll("(\\[|\\]|\\, )", ""));
					key++;
				}
			}
		}
		System.out.println("Before setting existing boolean values");
		System.out.println(hardPronunciationMap);

		/**
		 * Below code snippet combine the already existed boolean values with
		 * isVowels array values. E.g : If an existing boolean value is
		 * [1,1,0,0,0,0] and isVowels value is [0,0,0,0,0,1], then resultant
		 * value will be [1,1,0,0,0,1].
		 */
		for (Map.Entry<Integer, String> string : hardPronunciationMap.entrySet()) {
			StringBuilder actualString = new StringBuilder(string.getValue());
			for (int i = 0; i < isVowel.length; i++) {
				if (isVowel[i]) {
					actualString.setCharAt(i, '1');
					hardPronunciationMap.put(string.getKey(), actualString.toString());
				}

			}
		}
		System.out.println("After setting existing boolean values");
		System.out.println(hardPronunciationMap);
		Set<String> hashSet = new HashSet<String>();

		for (Map.Entry<Integer, String> string : hardPronunciationMap.entrySet()) {
			hashSet.add(string.getValue());
		}
		System.out.println("Before setting conditions for hard pronunciation");
		System.out.println(hashSet);

		/**
		 * Below code snippet checks any of the below two conditions to identify
		 * whether the string is hardly pronounceable or not. 1. There are more
		 * consonants than vowels. 2. Some 3 consecutive letters are all
		 * consonants. [Consider constants = 0 and vowels = 1]
		 */
		List<String> finalElements = new ArrayList<String>();
		Map<Character, Integer> occurrences = new HashMap<Character, Integer>();
		for (String string : hashSet) {
			char[] a = string.toCharArray();
			for (char c : a) {
				if (occurrences.containsKey(c)) {
					occurrences.put(c, occurrences.get(c) + 1);
				} else {
					occurrences.put(c, 1);
				}
			}
			if ((occurrences.get('0') > occurrences.get('1')) || (string.contains("000"))) {
				finalElements.add(string);
			}
			occurrences.clear();
		}
		System.out.println("Before setting conditions for hard pronunciation");
		System.out.println(finalElements);
		System.out.println(finalElements.size());
		hardPronunciationMap.clear();
		hashSet.clear();
	}
}
