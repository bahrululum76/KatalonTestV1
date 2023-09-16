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

String TransId = ExcelKeywords.getCellValueByAddress(sheet, 'A' + cell)

String RefNumb = ExcelKeywords.getCellValueByAddress(sheet, 'B' + cell)

String RegNumb = ExcelKeywords.getCellValueByAddress(sheet, 'C' + cell)

String BenefName = ExcelKeywords.getCellValueByAddress(sheet, 'D' + cell)

String BgType = ExcelKeywords.getCellValueByAddress(sheet, 'E' + cell)

String Ammount = ExcelKeywords.getCellValueByAddress(sheet, 'F' + cell)

String Status = ExcelKeywords.getCellValueByAddress(sheet, 'G' + cell)

String Created = ExcelKeywords.getCellValueByAddress(sheet, 'H' + cell)

String Modif = ExcelKeywords.getCellValueByAddress(sheet, 'I' + cell)

String CreatedBy = ExcelKeywords.getCellValueByAddress(sheet, 'J' + cell)

String ReviewedBy = ExcelKeywords.getCellValueByAddress(sheet, 'K' + cell)

WebUI.delay(5)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/digi-guarantee/bg-history')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('Filter BG', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Input Transaction Id'), 
    TransId)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Input Ref Numb'), RefNumb)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Input Reg Numb'), RegNumb)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Input Benef Name'), BenefName)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Input BG Type'), BgType + 
    Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Input Ammount'), Ammount)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Select W Status'), 
    Status, false)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Date Created'), Created + 
    Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Date Modif'), Modif + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Input CreatedBy'), CreatedBy + 
    Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Input ReviewBy'), ReviewedBy + 
    Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/History/Filter/Button Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

