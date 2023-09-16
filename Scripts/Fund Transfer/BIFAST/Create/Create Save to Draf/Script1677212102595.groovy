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

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.excelFile, 'BIFAST')

String Account = ExcelKeywords.getCellValueByAddress(sheet, 'A' + cell)

String AccountType = ExcelKeywords.getCellValueByAddress(sheet, 'B' + cell)

String BenefBank = ExcelKeywords.getCellValueByAddress(sheet, 'C' + cell)

String Receive = ExcelKeywords.getCellValueByAddress(sheet, 'D' + cell)

String Mail = ExcelKeywords.getCellValueByAddress(sheet, 'E' + cell)

String Ammount = ExcelKeywords.getCellValueByAddress(sheet, 'F' + cell)

String Remark = ExcelKeywords.getCellValueByAddress(sheet, 'G' + cell)

WebUI.delay(10)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/external-transfer/history?tab=bi-fast')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/Page_BRICaMS Cash  Trade/Button Create Trx'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/Page_BRICaMS Cash  Trade/Single'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/Page_BRICaMS Cash  Trade/bifast'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/Page_BRICaMS Cash  Trade/Button Next Create'))

WebUI.delay(3)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/SelectAccountNumber'), Account + Keys.ENTER)

//WebUI.getText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/Balance 0'), FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/SelectInputType'), AccountType + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/SelectBankCode'), BenefBank + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/ReceiveAccount'), '1001001234')

WebUI.scrollToElement(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/ReceiveAccountEmail'), 3)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/ReceiveAccountEmail'), Mail)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/button_Nextpage1'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/Ammount'), Ammount)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/input_Transfer Amount_Immediate'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/InputRemark'), Remark)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/button_NextPage2'))

try {
    if (WebUI.verifyElementPresent(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/Button Next Cut Off'), 
        0)) {
        WebUI.takeFullPageScreenshot()

        WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/Button Next Cut Off'))
    }
}
catch (Exception e) {
    println('Element tidak ditemukan')
} 

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/Button Save as Draf'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/Button Confirm Save As Draf'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

