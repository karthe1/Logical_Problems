package com.karthick.solve;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 * @author Karthick.R
 *
 */
public class ArrangePlayersInCamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		ArrayList<String> totalCampMembers = new ArrayList<String>();
		ArrayList<String> membersInCamp1 = new ArrayList<String>();
		ArrayList<String> membersInCamp2 = new ArrayList<String>();
		while (testCases > 0) {
			int totalPlayers = s.nextInt();
			int dividingPlayers = s.nextInt();
			if (totalPlayers % dividingPlayers == 0) {
				String[] names = new String[totalPlayers];
				for (int i = 0; i < names.length; i++) {
					names[i] = s.next();
				}
				for (String string : names) {
					totalCampMembers.add(string);
				}
				Iterator itr = totalCampMembers.iterator();
				while (itr.hasNext()) {
					String string = (String) itr.next();
					if (membersInCamp1.size() == 0) {
						membersInCamp1.add(string);
					} else if (membersInCamp1.get(0).length() == string.length()) {
						membersInCamp1.add(string);
					} else if (membersInCamp2.size() == 0) {
						membersInCamp2.add(string);
					} else if (membersInCamp2.get(0).length() == string.length()) {
						membersInCamp2.add(string);
					}
				}
			} else {
				System.out.println("Enter the total number of players that can be equally divided into the camp.");
				break;
			}
			System.out.println("Total no of players for arranging in the camp : " + totalCampMembers);
			System.out.println("Total no of players can be arranged in the camp 1 : " + membersInCamp1);
			System.out.println("Total no of players can be arranged in the camp 2 : " + membersInCamp2);
			if ((membersInCamp1.size() == dividingPlayers) && (membersInCamp2.size() == dividingPlayers)) {
				System.out.println("Possible");
			} else {
				System.out.println("Not possible");
			}
			totalCampMembers.clear();
			membersInCamp1.clear();
			membersInCamp2.clear();
			testCases--;
		}
	}

}