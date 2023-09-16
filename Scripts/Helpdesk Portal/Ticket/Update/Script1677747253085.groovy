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

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.excelFile, 'Helpdesk Ticket')

cell = 2

String TicketNo = ExcelKeywords.getCellValueByAddress(sheet, 'A' + cell)

String Subject = ExcelKeywords.getCellValueByAddress(sheet, 'B' + cell)

String Module = ExcelKeywords.getCellValueByAddress(sheet, 'C' + cell)

String Status = ExcelKeywords.getCellValueByAddress(sheet, 'D' + cell)

String DateCreated = ExcelKeywords.getCellValueByAddress(sheet, 'E' + cell)

String DateModif = ExcelKeywords.getCellValueByAddress(sheet, 'F' + cell)

WebUI.delay(3)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/helpdesk/portal/tickets')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Helpdesk Portal/Filter/Button Filter'))

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Helpdesk Portal/Filter/Select Status'), Status, false)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Helpdesk Portal/Filter/Button Apply Filter'))

String status = 'In Progress'

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Helpdesk Portal/Update/Select Status'), status + Keys.ENTER)

