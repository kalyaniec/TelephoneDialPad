package com.assignment.test;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import com.assignment.utilities.ReadExcel;



public class TelephoneDialPadTest {

	public Boolean validOutput(String testData, String methodName) throws IOException {

		Boolean flag = false;
		int counter = 0;
		LinkedList<String> actualCombination;

		actualCombination = TelephoneDialPad.retrieveCombinations(testData);
		String expectedCombination = ReadExcel.getOutputData(methodName);
		Iterator<String> it = actualCombination.iterator();
		String[] subString = expectedCombination.split(",");

		while (it.hasNext()) {

			for (int i = 0; i < subString.length; i++) {
				String expectedValue = it.next();
				String actualValue = subString[i].trim();
				if (!expectedValue.equals(actualValue)) {
					counter = 1;
					break;

				}
			}

		}

		if (counter != 1) {
			flag = true;
		}

		return flag;

	}
	/**
	 * 
	 * @param testData :Send the dial number combination 
	 * @param expectedCombinations Expected alphabet combinations fectched from excel
	 * @return : If all the expected combination matched to actual , flag is set as true ,else false
	 * @throws IOException
	 */

	public Boolean validOutputInLoop(String testData, String expectedCombinations)
			throws IOException {

		Boolean flag = false;
		int counter = 0;
		LinkedList<String> actualCombination;

		actualCombination = TelephoneDialPad.retrieveCombinations(testData);
		String expectedCombination = expectedCombinations;
		Iterator<String> it = actualCombination.iterator();
		String[] subString = expectedCombination.split(",");

		while (it.hasNext()) {

			for (int i = 0; i < subString.length; i++) {
				String expectedValue = it.next();
				String actualValue = subString[i].trim();
				if (!expectedValue.equals(actualValue)) {
					counter = 1;
					break;

				}
			}

		}

		if (counter != 1) {
			flag = true;
		}

		return flag;

	}

}
