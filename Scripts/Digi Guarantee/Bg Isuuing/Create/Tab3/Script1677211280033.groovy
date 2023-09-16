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

String NoKontrak = ExcelKeywords.getCellValueByAddress(sheet, 'Q' + cell)

String NamaProyek = ExcelKeywords.getCellValueByAddress(sheet, 'R' + cell)

String Cur1 = ExcelKeywords.getCellValueByAddress(sheet, 'S' + cell)

String Ammount1 = ExcelKeywords.getCellValueByAddress(sheet, 'T' + cell)

String Cur2 = ExcelKeywords.getCellValueByAddress(sheet, 'U' + cell)

String Ammount2 = ExcelKeywords.getCellValueByAddress(sheet, 'V' + cell)

String TypeJaminan = ExcelKeywords.getCellValueByAddress(sheet, 'W' + cell)

String NoRek2 = ExcelKeywords.getCellValueByAddress(sheet, 'X' + cell)

String NomCash = ExcelKeywords.getCellValueByAddress(sheet, 'Y' + cell)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/No Kontak'), NoKontrak)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/Nama Proyek'), NamaProyek)

def today = LocalDate.now()

def todayString = today.format(DateTimeFormatter.ofPattern('MM-dd-yyyy'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/Tanggal Proyek'), todayString +
	Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/NilProyCur'), Cur1 + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/NilProyekAmmount'), Ammount1)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/NilBGCur'), Cur2 + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/BgAmmount'), Ammount2)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/TypeJaminan'), TypeJaminan +
	Keys.ENTER)

WebUI.getText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/ValueTypeJaminan'))


WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/No Rek'), NoRek2 + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/Nominal Cash'), NomCash)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/Button Next 3'))

