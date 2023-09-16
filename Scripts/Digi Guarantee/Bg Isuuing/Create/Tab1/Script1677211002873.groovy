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

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.excelFile, 'BG ISSUING')

String CabPem = ExcelKeywords.getCellValueByAddress(sheet, 'A' + cell)

String ThridParty = ExcelKeywords.getCellValueByAddress(sheet, 'B' + cell)

String BankGaransi = ExcelKeywords.getCellValueByAddress(sheet, 'C' + cell)

String Deskripsi = ExcelKeywords.getCellValueByAddress(sheet, 'D' + cell)

String PeriodKlaim = ExcelKeywords.getCellValueByAddress(sheet, 'E' + cell)

WebUI.delay(5)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/digi-guarantee/bg-issuing')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page1/TypeAplicationIndividu'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page1/publishingTypeSingle'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page1/CabangPembuka'), CabPem + 
    Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page1/ThridPartyId'), ThridParty + 
    Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page1/Bank Garansi'), BankGaransi + 
    Keys.ENTER)

def today = LocalDate.now()

def todayString = today.format(DateTimeFormatter.ofPattern('MM-dd-yyyy'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page1/TanggalEfektif'), todayString + 
    Keys.ENTER)

def tomorrow = LocalDate.now().plusDays(7)

def tomorrowString = tomorrow.format(DateTimeFormatter.ofPattern('MM-dd-yyyy'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page1/TanggalKadaluarsa'), tomorrowString + 
    Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page1/Deskripsi'), Deskripsi)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page1/PeriodeKlaim'), PeriodKlaim + 
    Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page1/Button Next 1'), FailureHandling.STOP_ON_FAILURE)

