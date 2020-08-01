package com.assignment.utilities;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * 
 * @author Kalyani
 *
 */
public class ReadExcel {

	/**
	 * 
	 * @param testcaseName
	 * @return
	 * @throws IOException
	 */
	public static String sheetName = "Sheet1";

	public static String getTestData(String testcaseName) throws IOException {

		String path = System.getProperty("user.dir") + Constants.ExcelPath;

		int rownum = Excel_Utils.getRowCount(path, sheetName);
		String testData = "";
		String getTestCaseName;

		for (int i = 1; i <= rownum; i++) {

			getTestCaseName = Excel_Utils.getCellData(path, sheetName, i, 0);// 1 0

			if (testcaseName.equals(getTestCaseName)) {
				testData = Excel_Utils.getCellData(path, sheetName, i, 1);
				break;
			}

		}
		return testData;
	}

	public static String getOutputData(String testcaseName) throws IOException {
		String path = System.getProperty("user.dir") + Constants.ExcelPath;
		String testDataAsString = "";
		int rownum = Excel_Utils.getRowCount(path, sheetName);

		String getTestCaseName;

		for (int i = 1; i <= rownum; i++) {

			getTestCaseName = Excel_Utils.getCellData(path, sheetName, i, 0);// 1 0

			if (testcaseName.equals(getTestCaseName)) {
				testDataAsString = (Excel_Utils.getCellData(path, sheetName, i, 2));

				break;
			}

		}
		return testDataAsString;
	}

}
