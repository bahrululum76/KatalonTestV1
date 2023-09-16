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

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.excelFile, 'BG ISSUING HISTORY')

String Status = ExcelKeywords.getCellValueByAddress(sheet, 'G' + cell)

WebUI.delay(5)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/digi-guarantee/bg-history')

WebUI.delay(3)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Select W Status'), 
    Status, false)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Delete/Button Icon Delete'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Delete/Button Confirm Delete'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Delete/Close Delete'), FailureHandling.STOP_ON_FAILURE)

