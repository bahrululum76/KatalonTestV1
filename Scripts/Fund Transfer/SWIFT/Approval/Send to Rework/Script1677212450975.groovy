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

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.excelFile, 'Swift')

String Ammount = ExcelKeywords.getCellValueByAddress(sheet, 'H' + cell)

String Status = ExcelKeywords.getCellValueByAddress(sheet, 'I' + cell)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/external-transfer/history?tab=remittance-transfer')

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Search Table'), Ammount)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Filter_remitence'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/Input Status'),
	Status + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Apply Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Approval/Page_BRICaMS Cash  Trade/button_On Checker Rework'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Approval/Page_BRICaMS Cash  Trade/input_Reason for Rework'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Approval/Page_BRICaMS Cash  Trade/button_Send Task for Rework'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

