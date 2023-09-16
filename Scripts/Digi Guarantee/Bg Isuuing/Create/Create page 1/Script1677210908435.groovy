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

cell = 2

String CabPem = ExcelKeywords.getCellValueByAddress(sheet, 'A' + cell)

String ThridParty = ExcelKeywords.getCellValueByAddress(sheet, 'B' + cell)

String BankGaransi = ExcelKeywords.getCellValueByAddress(sheet, 'C' + cell)

String Deskripsi = ExcelKeywords.getCellValueByAddress(sheet, 'D' + cell)

String PeriodKlaim = ExcelKeywords.getCellValueByAddress(sheet, 'E' + cell)

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

String NoKontrak = ExcelKeywords.getCellValueByAddress(sheet, 'Q' + cell)

String NamaProyek = ExcelKeywords.getCellValueByAddress(sheet, 'R' + cell)

String Cur1 = ExcelKeywords.getCellValueByAddress(sheet, 'S' + cell)

String Ammount1 = ExcelKeywords.getCellValueByAddress(sheet, 'T' + cell)

String Cur2 = ExcelKeywords.getCellValueByAddress(sheet, 'U' + cell)

String Ammount2 = ExcelKeywords.getCellValueByAddress(sheet, 'V' + cell)

String TypeJaminan = ExcelKeywords.getCellValueByAddress(sheet, 'W' + cell)

String NoRek2 = ExcelKeywords.getCellValueByAddress(sheet, 'X' + cell)

String NomCash = ExcelKeywords.getCellValueByAddress(sheet, 'Y' + cell)

String TypeAsuransi = ExcelKeywords.getCellValueByAddress(sheet, 'Z' + cell)

String NoSp3 = ExcelKeywords.getCellValueByAddress(sheet, 'AA' + cell)

WebUI.callTestCase(findTestCase('Login/Login_CU_S'), [:], FailureHandling.STOP_ON_FAILURE)

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

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/NoRekApplication'), NoRekApl +
	Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/AplicationName'), NamaApl)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/BirthDate'), tgl_lhr + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/GenderL'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/Alamat'), Alamat)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/Narahubung'), Narahubung)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/No Tlp'), NoTlp)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/Email'), email)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/NIK'), NIK)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/NPWP'), NPWP)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/BenefName'), BenefName + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/BenefAddress'), BenefAddress)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page2/Button Next 2'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/No Kontak'), NoKontrak)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/Nama Proyek'), NamaProyek)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/Tanggal Proyek'), todayString +
	Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/NilProyCur'), Cur1 + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/NilProyekAmmount'), Ammount1)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/NilBGCur'), Cur2 + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/BgAmmount'), Ammount2)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/TypeJaminan'), TypeJaminan +
	Keys.ENTER)

WebUI.getText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/ValueTypeJaminan'))

//try {
//    if (WebUI.getText(findTestObject('Page_BRICaMS Cash Trade/Digi Guarantee/BG Issuing/Create/Page3/ValueTypeJaminan')) ==
//    'Tunai') {
//        WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/No Rek'), NoRek2 +
//            Keys.ENTER)
//
//        WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/Nominal Cash'), NomCash)
//    }
//	else if (WebUI.getText(findTestObject('Page_BRICaMS Cash Trade/Digi Guarantee/BG Issuing/Create/Page3/ValueTypeJaminan')) ==
//    'Asuransi') {
//        WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/Type Asuransi'), TypeAsuransi +
//            Keys.ENTER)
//
//        WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/No SP3'), NoSp3)
//    }
//}
//catch (Exception e) {
//    //handle exception
//    println('Error occurred while trying to get the text of the object: ' + e.getMessage())
//}

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/No Rek'), NoRek2 + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/Nominal Cash'), NomCash)
WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page3/Button Next 3'))

WebUI.uploadFile(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page4/InputFile Legalitas Usaha'),
	'D:\\File\\Rose.pdf')

WebUI.uploadFile(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page4/InputFile Tender'), 'D:\\File\\Rose.pdf')

WebUI.uploadFile(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page4/InputFile Dok Lainnya'),
	'D:\\File\\Rose.pdf')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page4/Button Next 4'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 3'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 4'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 5'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 6'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 7'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 8'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 9'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 10'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Checkbox 11'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Button Save as Draf'),
	FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Button Save Approve'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Button Done Save'), FailureHandling.STOP_ON_FAILURE)

