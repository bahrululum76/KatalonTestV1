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
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.excelFile, 'HistoryBIFAST')

String ScheduleType = ExcelKeywords.getCellValueByAddress(sheet, 'H' + cell)

String Ammount = ExcelKeywords.getCellValueByAddress(sheet, 'I' + cell)

String Status = ExcelKeywords.getCellValueByAddress(sheet, 'J' + cell)

WebUI.delay(2)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/external-transfer/history?tab=bi-fast')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/History/button_Filter01'))

not_run: WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/History/SelectScheduleType'), ScheduleType +
	Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/History/InputAmmount'), Ammount + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/History/SelectStatus'), Status + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/History/ButtonApplyFilter'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/History/Page_BRICaMS Cash  Trade/button_On Signer_Approve'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/History/Page_BRICaMS Cash  Trade/button_Approve Task'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

