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

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.excelFile, 'History Filter')

String BenefCountry = ExcelKeywords.getCellValueByAddress(sheet, 'A' + cell)

String BenefBank = ExcelKeywords.getCellValueByAddress(sheet, 'B' + cell)

String CreatdBy = ExcelKeywords.getCellValueByAddress(sheet, 'E' + cell)

String ReviewedBy = ExcelKeywords.getCellValueByAddress(sheet, 'F' + cell)

String Cur = ExcelKeywords.getCellValueByAddress(sheet, 'G' + cell)

String Status = ExcelKeywords.getCellValueByAddress(sheet, 'H' + cell)

WebUI.delay(10)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/external-transfer/history?tab=remittance-transfer')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Filter_remitence'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Beneficiary Bank_'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Beneficiary Bank_'), 
    BenefBank)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/li_BANK CENTRAL ASIA'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Filter r2'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Filter_remitence'))

//WebUI.takeScreenshot('C:\\Users\\Enryu\\Katalon Studio\\BRI Phase 1\\Screenshoot\\Screnshoot1.png')
WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Beneficiary Country_react-select-8-input'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Beneficiary Country_react-select-8-input'), 
    BenefCountry + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Filter r2'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Filter_remitence'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Created By_react-select-9-input'), 
    CreatdBy + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Filter r2'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Filter_remitence'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Currency_react-select-11-input'), 
    Cur + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Filter r2'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Filter_remitence'))

def today = LocalDate.now()

def todayString = today.format(DateTimeFormatter.ofPattern('yyyy-MM-dd'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Data Created'), 
    todayString + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Filter r2'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Filter_remitence'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Data Modified'), 
    todayString + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Filter r2'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Filter_remitence'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/Input Reviewed By'), 
    ReviewedBy + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Filter r2'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Filter_remitence'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/Input Status'), 
    Status + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(1)

