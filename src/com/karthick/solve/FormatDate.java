package com.karthick.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * 
 * @author karthick.r
 *
 */
public class FormatDate {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOftestCases = Integer.parseInt(br.readLine());
		ArrayList<String> dateList = new ArrayList<String>();
		while (noOftestCases > 0) {
			dateList.add(br.readLine());
			noOftestCases--;
		}
		Iterator<String> itr = dateList.iterator();
		while (itr.hasNext()) {
			String inputDateString = itr.next();
			String splitDate[] = inputDateString.split(" ");
			if ((Integer.parseInt(splitDate[0]) > 0)
					&& ((Integer.parseInt(splitDate[2]) >= 1600) && (Integer.parseInt(splitDate[2]) <= 2000))) {
				Date inputDate = new Date(inputDateString);
				inputDate.setDate(inputDate.getDate() - 1);
				SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMMM YYYY");
				String outputFormat = sdf2.format(inputDate);
				if(outputFormat.charAt(0)=='0')
					outputFormat = outputFormat.substring(1);
				System.out.println(outputFormat);
			} else {
				System.err.append("INVALID DATE OR INVALID YEAR (RANGES FROM 1600 TO 2000)");
			}
		}

	}

}
