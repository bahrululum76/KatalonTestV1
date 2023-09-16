import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 3'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 4'), FailureHandling.STOP_ON_FAILURE)

try {
	if (WebUI.verifyElementPresent(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 4.1'),
		0)) {
		WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 4.1'), FailureHandling.STOP_ON_FAILURE)
	}
}
catch (Exception e) {
	println('Element not found: ' + e.getMessage())
}

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 5'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 6'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 7'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 8'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 9'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 10'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 11'), FailureHandling.STOP_ON_FAILURE)


not_run: WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Button Save Approve'),
	FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Button Done Save'),
	FailureHandling.STOP_ON_FAILURE)

