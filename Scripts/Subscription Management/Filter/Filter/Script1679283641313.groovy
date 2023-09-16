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

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.excelFile, 'Subscription History')

String Company = ExcelKeywords.getCellValueByAddress(sheet, 'A' + cell)

String Plan = ExcelKeywords.getCellValueByAddress(sheet, 'B' + cell)

String DateCreated = ExcelKeywords.getCellValueByAddress(sheet, 'C' + cell)

String DateModif = ExcelKeywords.getCellValueByAddress(sheet, 'D' + cell)

String CreatedBy = ExcelKeywords.getCellValueByAddress(sheet, 'E' + cell)

String ModifBy = ExcelKeywords.getCellValueByAddress(sheet, 'F' + cell)

String Status = ExcelKeywords.getCellValueByAddress(sheet, 'G' + cell)

String BilingStatus = ExcelKeywords.getCellValueByAddress(sheet, 'H' + cell)

WebUI.delay(5)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/subscriptions')

WebUI.scrollToElement(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Table'), 0)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Input company'), Company)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Input company'), Company + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Filter'))

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Select plan'), Plan, false)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/date created'), DateCreated + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/date modif'), DateModif + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Filter'))

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Select createdBy'), CreatedBy, 
    false)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Filter'))

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Select reviewBy'), ModifBy, 
    false)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Filter'))

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Select status'), Status, 
    false)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Filter'))

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Select billingStatus'), 
    BilingStatus, false)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Button Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

