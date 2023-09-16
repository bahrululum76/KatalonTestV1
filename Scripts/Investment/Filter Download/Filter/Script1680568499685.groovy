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

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.excelFile, 'Investment')

String depositNo = ExcelKeywords.getCellValueByAddress(sheet, 'A' + cell)

String depositName = ExcelKeywords.getCellValueByAddress(sheet, 'B' + cell)

String currency = ExcelKeywords.getCellValueByAddress(sheet, 'C' + cell)

String tenor = ExcelKeywords.getCellValueByAddress(sheet, 'D' + cell)

String depositType = ExcelKeywords.getCellValueByAddress(sheet, 'E' + cell)

String status = ExcelKeywords.getCellValueByAddress(sheet, 'F' + cell)

String dateCreated = ExcelKeywords.getCellValueByAddress(sheet, 'G' + cell)

String dateModified = ExcelKeywords.getCellValueByAddress(sheet, 'H' + cell)

String tab = ExcelKeywords.getCellValueByAddress(sheet, 'I' + cell)

GlobalVariable.tabMenu = tab

WebUI.delay(4)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/online-time-deposit/time-deposit-account')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/TAB All Deposit Accounts'))

WebUI.scrollToElement(findTestObject('Page_BRICaMS Cash  Trade/Investment/TAB All Deposit Accounts'), 4)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/button Filter'))

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/select deposit type'), depositType, 
    false)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/button Apply Filter'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_BRICaMS Cash  Trade/Investment/Tabel Data'), 4)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/button Reset'))

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/select status'), status, false)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/button Apply Filter'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_BRICaMS Cash  Trade/Investment/Tabel Data'), 4)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/button Reset'))

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/select currency'), currency, false)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/button Apply Filter'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_BRICaMS Cash  Trade/Investment/Tabel Data'), 4)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/button Reset'))

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/select tenor'), tenor, false)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/button Apply Filter'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_BRICaMS Cash  Trade/Investment/Tabel Data'), 4)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/button Reset'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/input_Deposit Name_depositoName'), depositName)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/button Apply Filter'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_BRICaMS Cash  Trade/Investment/Tabel Data'), 4)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/button Reset'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/input_Deposit No_depositNo'), depositNo)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/button Apply Filter'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_BRICaMS Cash  Trade/Investment/Tabel Data'), 4)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/button Reset'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/input date created'), dateCreated + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/button Apply Filter'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_BRICaMS Cash  Trade/Investment/Tabel Data'), 4)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/button Reset'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/input date modified'), dateModified + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/button Apply Filter'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_BRICaMS Cash  Trade/Investment/Tabel Data'), 4)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Filter/button Reset'))

