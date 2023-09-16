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

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.excelFile, 'LM HISTORY')


String SchemaType = ExcelKeywords.getCellValueByAddress(sheet, 'A' + cell)

String CreatedBy = ExcelKeywords.getCellValueByAddress(sheet, 'B' + cell)

String ReviewedBy = ExcelKeywords.getCellValueByAddress(sheet, 'C' + cell)

String PeriodeBy = ExcelKeywords.getCellValueByAddress(sheet, 'D' + cell)

String StartDate = ExcelKeywords.getCellValueByAddress(sheet, 'E' + cell)

String EndDate = ExcelKeywords.getCellValueByAddress(sheet, 'F' + cell)

String Status = ExcelKeywords.getCellValueByAddress(sheet, 'H' + cell)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/Tab Ongoing Schema'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Input Schema Type'), SchemaType + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/input createdby'), CreatedBy + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/reviewdby'), ReviewedBy + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/periodeby'), PeriodeBy + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/stardate'), StartDate + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/EndDate'), EndDate + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Status tab 2'), Status + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Apply Filter'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Filter'))

