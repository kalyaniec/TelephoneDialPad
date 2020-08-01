package com.assignment.testcases;

import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.assignment.test.TelephoneDialPadTest;
import com.assignment.utilities.Constants;
import com.assignment.utilities.Excel_Utils;
import com.assignment.utilities.ReadExcel;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class TC01 {

	private String digitInput;
	private static final String OUTPUT_FOLDER = "test-output/";
	private static final String FILE_NAME = "Extent.html";
	private ExtentHtmlReporter htmlReporter;
	private ExtentReports extent;
	private ExtentTest oTest;
	private String testData = "";
	private String methodName = "";
	private Boolean status = false;
	private TelephoneDialPadTest validate;
	private static final String PASSMESSAGE = "For Input expected result is equal to actual TestData";
	private static final String FAILMESSAGE = "For Input expected result is not equal to actual TestData";
	private static final String NUMBERFORMATEMESSAGE = "For given input output result complied with number format Exception";
	private static final String IOEXCMESSSAGE = "For given input output result complied with Input output Exception";

	
	//*********************************Setting Pre requists****************************************************
	/**
	 * 
	 * @param method
	 *            Invokes the Extent Report ,New Extent Report file is generated
	 *            with DateTimeStamp
	 * @throws IOException
	 */
	@BeforeTest
	public void setExtent() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String timeStamp = formatter.format(date);

		htmlReporter = new ExtentHtmlReporter(OUTPUT_FOLDER + "TestReport_" + timeStamp + "_" + FILE_NAME);
		htmlReporter.config().setDocumentTitle("TestReport");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}

	//*********************************Tear down****************************************************
	/**
	 * Extentflush writes to the report file
	 */
	@AfterClass
	public void tearDown() {
		extent.flush();
	}
	
	
	//*********************************Test Cases****************************************************

	/**
	 * tc01ValidateWithValidInputData checks with valid set of Data but the test
	 * Data gives a wrong combinations P
	 * 
	 *  @param method name required to fetch Test Data
	 * @throws IOException
	 *
	 */
	@Test(enabled = true)
	public void tc01ValidateWithValidInputData(Method method) throws IOException {
		try {
			oTest = extent.createTest(method.getName());
			methodName = method.getName();
			testData = ReadExcel.getTestData(methodName);
			validate = new TelephoneDialPadTest();
			status = validate.validOutput(testData, methodName);

			// ****************************************Validation***************************************
			if (status) {
				oTest.log(Status.PASS, testData + PASSMESSAGE);
				Assert.assertTrue(true);
			} else
				oTest.log(Status.FAIL, testData + FAILMESSAGE);

			Assert.assertTrue(false);
		}

		catch (NumberFormatException nfe) {

			oTest.log(Status.FAIL, testData + NUMBERFORMATEMESSAGE);
			Assert.assertTrue(false);

		}

		catch (IOException ioe) {

			oTest.log(Status.FAIL, testData + IOEXCMESSSAGE);
			Assert.assertTrue(false);

		} catch (Exception e) {

			oTest.log(Status.FAIL, e.getMessage());
			Assert.assertTrue(false);
		}

	}

	
	
	
	/**
	 * tc02ValidateWithAlphaNumericInputData checks with alphanumeric set of data
	 * such as "A2"
	 * 
	 *  @param method name required to fetch Test Data
	 * @throws IOException
	 */

	@Test(enabled = true)
	public void tc02ValidateWithAlphaNumericInputData(Method method) throws IOException {
		try {
			oTest = extent.createTest(method.getName());
			methodName = method.getName();
			testData = ReadExcel.getTestData(methodName);
			validate = new TelephoneDialPadTest();
			status = validate.validOutput(testData, methodName);

			// ****************************************Validation***************************************
			if (status) {
				oTest.log(Status.PASS, testData + PASSMESSAGE);
				Assert.assertTrue(true);
			} else
				oTest.log(Status.FAIL, testData + FAILMESSAGE);

			Assert.assertTrue(false);
		}

		catch (NumberFormatException nfe) {

			oTest.log(Status.FAIL, testData + NUMBERFORMATEMESSAGE);
			Assert.assertTrue(false);

		}

		catch (IOException ioe) {

			oTest.log(Status.FAIL, testData + IOEXCMESSSAGE);
			Assert.assertTrue(false);

		} catch (Exception e) {

			oTest.log(Status.FAIL, e.getMessage());
			Assert.assertTrue(false);
		}

	}

	/**
	 * tc03ValidateWithNullInputData checks output with null value
	 * 
	 *  @param method name required to fetch Test Data
	 * @throws IOException
	 */
	@Test(enabled = true)
	public void tc03ValidateWithNullInputData(Method method) throws IOException {
		try {
			oTest = extent.createTest(method.getName());
			methodName = method.getName();
			testData = ReadExcel.getTestData(methodName);
			validate = new TelephoneDialPadTest();
			status = validate.validOutput(testData, methodName);

			// ****************************************Validation***************************************
			if (status) {
				oTest.log(Status.PASS, testData + PASSMESSAGE);
				Assert.assertTrue(true);
			} else
				oTest.log(Status.FAIL, testData + FAILMESSAGE);

			Assert.assertTrue(false);
		}

		catch (NumberFormatException nfe) {

			oTest.log(Status.FAIL, testData + NUMBERFORMATEMESSAGE);
			Assert.assertTrue(false);

		}

		catch (IOException ioe) {

			oTest.log(Status.FAIL, testData + IOEXCMESSSAGE);
			Assert.assertTrue(false);

		} catch (Exception e) {

			oTest.log(Status.FAIL, e.getMessage());
			Assert.assertTrue(false);
		}

	}

	
	
	/**
	 * tc04ValidateWithWildCharacterInputData checks output with wild character such
	 * as "$"
	 * 
	 *  @param method name required to fetch Test Data
	 * @throws IOException
	 */
	@Test(enabled = true)
	public void tc04ValidateWithWildCharacterInputData(Method method) throws IOException {
		try {
			oTest = extent.createTest(method.getName());
			methodName = method.getName();
			testData = ReadExcel.getTestData(methodName);
			validate = new TelephoneDialPadTest();
			status = validate.validOutput(testData, methodName);

			// ****************************************Validation***************************************
			if (status) {
				oTest.log(Status.PASS, testData + PASSMESSAGE);
				Assert.assertTrue(true);
			} else
				oTest.log(Status.FAIL, testData + FAILMESSAGE);

			Assert.assertTrue(false);
		}

		catch (NumberFormatException nfe) {

			oTest.log(Status.FAIL, testData + NUMBERFORMATEMESSAGE);
			Assert.assertTrue(false);

		}

		catch (IOException ioe) {

			oTest.log(Status.FAIL, testData + IOEXCMESSSAGE);
			Assert.assertTrue(false);

		} catch (Exception e) {

			oTest.log(Status.FAIL, e.getMessage());
			Assert.assertTrue(false);
		}

	}
	
	
/**
 *  @param method name required to fetch Test Data
 */
	
	@Test(enabled = true)
	public void tc05ValidateWithSpaceInputData(Method method) throws IOException {
		try {
			oTest = extent.createTest(method.getName());
			methodName = method.getName();
			testData = ReadExcel.getTestData(methodName);
			validate = new TelephoneDialPadTest();
			status = validate.validOutput(testData, methodName);

			// ****************************************Validation***************************************
			if (status) {
				oTest.log(Status.PASS, testData + PASSMESSAGE);
				Assert.assertTrue(true);
			} else
				oTest.log(Status.FAIL, testData + FAILMESSAGE);

			Assert.assertTrue(false);
		}

		catch (NumberFormatException nfe) {

			oTest.log(Status.FAIL, testData + NUMBERFORMATEMESSAGE);
			Assert.assertTrue(false);

		}

		catch (IOException ioe) {

			oTest.log(Status.FAIL, testData + IOEXCMESSSAGE);
			Assert.assertTrue(false);

		} catch (Exception e) {

			oTest.log(Status.FAIL, e.getMessage());
			Assert.assertTrue(false);
		}

	}

	
	
	
	/**
	 * tc06ValidateWithSpaceInputData checks output with input set as space in input
	 * 
	 * @param method name required to fetch Test Data
	 * Check with Check with 0
	 * @throws IOException
	 */

	@Test(enabled = true)
	public void tc06ValidateWithSpaceInputData(Method method) throws IOException {
		try {
			oTest = extent.createTest(method.getName());
			methodName = method.getName();
			testData = ReadExcel.getTestData(methodName);
			validate = new TelephoneDialPadTest();
			status = validate.validOutput(testData, methodName);

			// ****************************************Validation***************************************
			if (status) {
				oTest.log(Status.PASS, testData + PASSMESSAGE);
				Assert.assertTrue(true);
			} else
				oTest.log(Status.FAIL, testData + FAILMESSAGE);

			Assert.assertTrue(false);
		}

		catch (NumberFormatException nfe) {

			oTest.log(Status.FAIL, testData + NUMBERFORMATEMESSAGE);
			Assert.assertTrue(false);

		}

		catch (IOException ioe) {

			oTest.log(Status.FAIL, testData + IOEXCMESSSAGE);
			Assert.assertTrue(false);

		} catch (Exception e) {

			oTest.log(Status.FAIL, e.getMessage());
			Assert.assertTrue(false);
		}

	}

	/**
	 * 
	 * @param method name required to fetch Test Data
	 * Check with Check with 1
	 * @throws IOException
	 * 
	 */
	
	@Test(enabled = true)
	public void tc07ValidateOutputWithNumbersWithNoAlphabets(Method method) throws IOException {
		try {
			oTest = extent.createTest(method.getName());
			methodName = method.getName();
			testData = ReadExcel.getTestData(methodName);
			validate = new TelephoneDialPadTest();
			status = validate.validOutput(testData, methodName);

			// ****************************************Validation***************************************
			if (status) {
				oTest.log(Status.PASS, testData + PASSMESSAGE);
				Assert.assertTrue(true);
			} else
				oTest.log(Status.FAIL, testData + FAILMESSAGE);

			Assert.assertTrue(false);
		}

		catch (NumberFormatException nfe) {

			oTest.log(Status.FAIL, testData + NUMBERFORMATEMESSAGE);
			Assert.assertTrue(false);

		}

		catch (IOException ioe) {

			oTest.log(Status.FAIL, testData + IOEXCMESSSAGE);
			Assert.assertTrue(false);

		} catch (Exception e) {

			oTest.log(Status.FAIL, e.getMessage());
			Assert.assertTrue(false);
		}

	}

	/**
	 * Check with Test Data 0A
	 * @param method name required to fetch Test Data
	 * @throws IOException
	 */
	
	@Test(enabled = true)
	public void tc08ValidateOutputWithNumbersWithNoAlphabets(Method method) throws IOException {
		try {
			oTest = extent.createTest(method.getName());
			methodName = method.getName();
			testData = ReadExcel.getTestData(methodName);
			validate = new TelephoneDialPadTest();
			status = validate.validOutput(testData, methodName);

			// ****************************************Validation***************************************
			if (status) {
				oTest.log(Status.PASS, testData + PASSMESSAGE);
				Assert.assertTrue(true);
			} else
				oTest.log(Status.FAIL, testData + FAILMESSAGE);

			Assert.assertTrue(false);
		}

		catch (NumberFormatException nfe) {

			oTest.log(Status.FAIL, testData + NUMBERFORMATEMESSAGE);
			Assert.assertTrue(false);

		}

		catch (IOException ioe) {

			oTest.log(Status.FAIL, testData + IOEXCMESSSAGE);
			Assert.assertTrue(false);

		} catch (Exception e) {

			oTest.log(Status.FAIL, e.getMessage());
			Assert.assertTrue(false);
		}

	}
/**
 * Check wit Test Data 91

 * @param method name required to fetch Test Data
 * @throws IOException
 */
	
	
	
	@Test(enabled = true)
	public void tc09ValidateOutputWithNumbersWithNoAlphabets(Method method) throws IOException {
		try {
			oTest = extent.createTest(method.getName());
			methodName = method.getName();
			testData = ReadExcel.getTestData(methodName);
			validate = new TelephoneDialPadTest();
			status = validate.validOutput(testData, methodName);

			// ****************************************Validation***************************************
			if (status) {
				oTest.log(Status.PASS, testData + PASSMESSAGE);
				Assert.assertTrue(true);
			} else
				oTest.log(Status.FAIL, testData + FAILMESSAGE);

			Assert.assertTrue(false);
		}

		catch (NumberFormatException nfe) {

			oTest.log(Status.FAIL, testData + NUMBERFORMATEMESSAGE);
			Assert.assertTrue(false);

		}

		catch (IOException ioe) {

			oTest.log(Status.FAIL, testData + IOEXCMESSSAGE);
			Assert.assertTrue(false);

		} catch (Exception e) {

			oTest.log(Status.FAIL, e.getMessage());
			Assert.assertTrue(false);
		}

	}

	
	
	/**
	 * 
	 * @param tData
	 * @param output
	 * @throws IOException
	 */
	
	@Test(dataProvider = "validData")
	public void tc10ValidateWithValidInputData(String tData, String output) throws IOException {
		try {
			String methodName = "tc10ValidateWithValidInputData";
			oTest = extent.createTest(methodName);
			testData = tData;
			String expectedCombination = output;
			validate = new TelephoneDialPadTest();
			status = validate.validOutputInLoop(testData, expectedCombination);

			// ****************************************Validation***************************************
			if (status) {
				oTest.log(Status.PASS, testData + PASSMESSAGE);
				Assert.assertTrue(true);
			} else {
				oTest.log(Status.FAIL, testData + FAILMESSAGE);
				Assert.assertTrue(false);
			}
		}

		catch (NumberFormatException nfe) {

			oTest.log(Status.FAIL, testData + NUMBERFORMATEMESSAGE);
			Assert.assertTrue(false);

		}

		catch (IOException ioe) {

			oTest.log(Status.FAIL, testData + IOEXCMESSSAGE);
			Assert.assertTrue(false);

		} catch (Exception e) {

			oTest.log(Status.FAIL, e.getMessage());
			Assert.assertTrue(false);
		}

	}

	// ******************************************************
	@DataProvider(name = "validData")
	public Object[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + Constants.ExcelPath;
		String Sheetname = "Sheet2";
		int rownum = Excel_Utils.getRowCount(path, Sheetname);
		int colcount = Excel_Utils.getCellCount(path, Sheetname, 1);

		String validDataList[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colcount; j++) {
				validDataList[i - 1][j] = Excel_Utils.getCellData(path, Sheetname, i, j);// 1 0
			}

		}
		return validDataList;
	}

}
