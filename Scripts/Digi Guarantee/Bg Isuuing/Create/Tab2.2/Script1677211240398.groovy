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

String NoRekApl = ExcelKeywords.getCellValueByAddress(sheet, 'F' + cell)

String NamaApl = ExcelKeywords.getCellValueByAddress(sheet, 'G' + cell)

String tgl_lhr = ExcelKeywords.getCellValueByAddress(sheet, 'H' + cell)

String Alamat = ExcelKeywords.getCellValueByAddress(sheet, 'I' + cell)

String Narahubung = ExcelKeywords.getCellValueByAddress(sheet, 'J' + cell)

String NoTlp = ExcelKeywords.getCellValueByAddress(sheet, 'K' + cell)

String email = ExcelKeywords.getCellValueByAddress(sheet, 'L' + cell)

String NIK = ExcelKeywords.getCellValueByAddress(sheet, 'M' + cell)

String NPWP = ExcelKeywords.getCellValueByAddress(sheet, 'N' + cell)

String BenefName = ExcelKeywords.getCellValueByAddress(sheet, 'O' + cell)

String BenefAddress = ExcelKeywords.getCellValueByAddress(sheet, 'P' + cell)

String CompanyType = ExcelKeywords.getCellValueByAddress(sheet, 'AB' + cell)

String TanggalBerdiri = ExcelKeywords.getCellValueByAddress(sheet, 'AC' + cell)

String BenefName2 = ExcelKeywords.getCellValueByAddress(sheet, 'AD' + cell)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/NoRekApplication'), NoRekApl +
	Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/AplicationName'), NamaApl)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/CompanyType'), CompanyType +
	Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/Tanggal berdiri'), TanggalBerdiri +
	Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/Alamat'), Alamat)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/Narahubung'), Narahubung)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/No Tlp'), NoTlp)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/Email'), email)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/NPWP'), NPWP)

if (WebUI.verifyElementPresent(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/BenefName Text'), 5)) {
    // Lakukan tindakan jika elemen ditemukan
    WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/BenefName Text'), BenefName2)
} else {
    // Lakukan tindakan jika elemen tidak ditemukan
    WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/BenefName'), BenefName + Keys.ENTER)
}
WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/BenefAddress'), BenefAddress)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/Button Next 2'))

