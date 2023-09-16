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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

String filePatch = RunConfiguration.getProjectDir() + '/Data Files/Rose.pdf'

Path absolutePath = Paths.get(filePatch)

String absolutePathStr = absolutePath.toString()

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.excelFile, 'Swift')

String Account = ExcelKeywords.getCellValueByAddress(sheet, 'A' + cell)

String BankCode = ExcelKeywords.getCellValueByAddress(sheet, 'B' + cell)

String BenefMail = ExcelKeywords.getCellValueByAddress(sheet, 'C' + cell)

String BenefAccount = ExcelKeywords.getCellValueByAddress(sheet, 'D' + cell)

String Country = ExcelKeywords.getCellValueByAddress(sheet, 'E' + cell)

String Address = ExcelKeywords.getCellValueByAddress(sheet, 'F' + cell)

String Cur = ExcelKeywords.getCellValueByAddress(sheet, 'G' + cell)

String Ammount = ExcelKeywords.getCellValueByAddress(sheet, 'H' + cell)

WebUI.delay(10)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/external-transfer/history?tab=remittance-transfer')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Button Create Trx'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Single'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Swift'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Button Next Create'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Input Account Number'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Input Account Number'), Account + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Button Check 1'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Input Bank code'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Input Bank code'), BankCode)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Input Bank code'), BankCode + Keys.ENTER)

//WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Input Benef Account'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Input Benef Account'), BenefAccount +
//	Keys.ENTER)
try {
    if (WebUI.verifyElementPresent(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Input Benef Account'), 
        0)) {
        WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Input Benef Account'), BenefAccount + 
            Keys.ENTER)
    }
}
catch (Exception e) {
    println('Element tidak ditemukan')
} 

try {
    if (WebUI.verifyElementPresent(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Input Benef Accoun Number'), 
        0)) {
        WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Input Benef Accoun Number'), '1234455425')

        WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/BenefName'), 'Bideons')
    }
}
catch (Exception e) {
    println('Element tidak ditemukan')
} 

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/input_Beneficiary Email (Optional)'), 
    BenefMail)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Input Country'), Country + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Input Address'), 'District 7')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/button_Next_1'))

WebUI.scrollToElement(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Input Currency'), 0)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Input Currency'), Cur + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Input Ammount'), Ammount)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Input Immediatte'))

WebUI.delay(3)

not_run: WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Input TF Purpose'), 'Famil')

WebUI.delay(10)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Input TF Purpose'), 'Famil' + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/textarea_remark (1)'), 'remark')

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/textarea_Remark'), 'Remark')

try {
    if (WebUI.verifyElementPresent(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Recalculate'), 3)) {
        WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Recalculate'))
    }
}
catch (Exception e) {
    println('Element tidak ditemukan')
} 

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/button_Next22'))

try {
    if (WebUI.verifyElementPresent(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Page_BRICaMS Cash  Trade/button_NextCutOff'), 
        3)) {
        WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Next Btn Cutt off'))
    }
}
catch (Exception e) {
    println('Element tidak ditemukan')
} 

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/button_Save  Send for Approval'))

try {
    if (WebUI.verifyElementPresent(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/input_Masukan OTP'), 
        0)) {
        WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/input_Masukan OTP'), '53423234356')
    }
}
catch (Exception e) {
    println('Element tidak ditemukan')
} 

try {
    if (WebUI.verifyElementPresent(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/InputFile'), 3)) {
        WebUI.uploadFile(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/InputFile'), absolutePathStr)
    }
}
catch (Exception e) {
    println('Element tidak ditemukan')

    WebUI.delay(3)

    WebUI.takeFullPageScreenshot()
} 

//WebUI.uploadFile(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/InputFile'), 'D:\\File\\Rose.pdf')
not_run: WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/button_Submit1'))

not_run: WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/button_Done'))

