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

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.excelFile, 'Helpdesk Update')

String status = ExcelKeywords.getCellValueByAddress(sheet, 'A' + cell)

String priority = ExcelKeywords.getCellValueByAddress(sheet, 'B' + cell)

String admin = ExcelKeywords.getCellValueByAddress(sheet, 'C' + cell)

String dueDate = ExcelKeywords.getCellValueByAddress(sheet, 'D' + cell)

String tag1 = ExcelKeywords.getCellValueByAddress(sheet, 'E' + cell)

String statusTicket = ExcelKeywords.getCellValueByAddress(sheet, 'F' + cell)

WebUI.delay(2)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/helpdesk/portal/tickets')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Helpdesk Portal/Filter/Button Filter'))

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Helpdesk Portal/Filter/Select Status'), statusTicket, 
    false)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Helpdesk Portal/Filter/Button Apply Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Helpdesk Portal/Update/button_View'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Helpdesk Portal/Update/Select Status'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Helpdesk Portal/Update/Select Status'), status + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Helpdesk Portal/Update/Select Priority'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Helpdesk Portal/Update/Select Priority'), priority + Keys.ENTER)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Helpdesk Portal/Update/button_Update'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Helpdesk Portal/Update/button_Close after update'))

