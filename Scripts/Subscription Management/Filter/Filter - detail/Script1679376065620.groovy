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
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

WebUI.callTestCase(findTestCase('Login/Login_CU_S'), [:], FailureHandling.STOP_ON_FAILURE)

cell = 2

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.excelFile, 'Subscription History')

String Company = ExcelKeywords.getCellValueByAddress(sheet, 'A' + cell)

String Plan = ExcelKeywords.getCellValueByAddress(sheet, 'B' + cell)

String DateCreated = ExcelKeywords.getCellValueByAddress(sheet, 'C' + cell)

String DateModif = ExcelKeywords.getCellValueByAddress(sheet, 'D' + cell)

String CreatedBy = ExcelKeywords.getCellValueByAddress(sheet, 'E' + cell)

String ModifBy = ExcelKeywords.getCellValueByAddress(sheet, 'F' + cell)

String Status = ExcelKeywords.getCellValueByAddress(sheet, 'G' + cell)

String BilingStatus = ExcelKeywords.getCellValueByAddress(sheet, 'H' + cell)

String Search1 = ExcelKeywords.getCellValueByAddress(sheet, 'I' + cell)

WebUI.delay(5)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/subscriptions')

WebUI.scrollToElement(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Table'), 0)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Search/Input Search'), Search1)

WebUI.delay(5)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/View detail'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Tab Billing history'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Filter Detail/Button Filter d'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Filter Detail/Table detail'), 
    0)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Filter Detail/Input Invoice code'), 
    '123')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Filter Detail/Input date'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Filter Detail/Input date'), '2023-03-15' + 
    Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Filter Detail/Input Account Number'), 
    '123')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Filter Detail/Input Account Currency'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Filter Detail/Cry USD'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Filter Detail/Input Ammonut'), '123')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Filter Detail/Input Status d'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Filter Detail/Status Success'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Filter Detail/Input detail status'), 
    FailureHandling.STOP_ON_FAILURE)

