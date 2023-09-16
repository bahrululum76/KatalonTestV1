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

String Search1 = ExcelKeywords.getCellValueByAddress(sheet, 'I' + cell)

String Search2 = ExcelKeywords.getCellValueByAddress(sheet, 'J' + cell)

WebUI.delay(5)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/subscriptions')

WebUI.scrollToElement(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Filter/Table'), 0)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Search/Input Search'), Search1)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Search/Input search log'), Search2)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Search/Select Activity'), 'Last Week', 
    false)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Search/Select Activity'), 'Last Month', 
    false)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Search/Select Activity'), 'Last 3 Months', 
    false)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Subscription Management/Search/Select Activity'), 'Last 6 Months', 
    false)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

