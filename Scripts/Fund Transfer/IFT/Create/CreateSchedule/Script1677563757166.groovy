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

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.excelFile, 'IFT')

String Account = ExcelKeywords.getCellValueByAddress(sheet, 'A' + cell)

String remark = ExcelKeywords.getCellValueByAddress(sheet, 'C' + cell)

String amount = ExcelKeywords.getCellValueByAddress(sheet, 'B' + cell)

String startPeriod = ExcelKeywords.getCellValueByAddress(sheet, 'D' + cell)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/internal-transfer/history')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/Tab Left Make a Transfer'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/Pop Out Single Transfer'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/Pop Up button_Next Create New Transfer BRI to BRI'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/Create/SelectAccountNumber'), Account + Keys.ENTER)

WebUI.delay(3)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Select Beneficiary Account Number'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/div_BENXXXXXXOSO - 033901018887530'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/button_Next Create Single Transfer'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/input_Amount_amount Single Transfer'), 
    amount)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Transaction Schedule/Page_BRICaMS Cash  Trade/Schedule input_Amount_transactionScheduleType'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Transaction Schedule/Page_BRICaMS Cash  Trade/Input Pick Date ddMMYYYY'), 
    startPeriod)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Transaction Schedule/Page_BRICaMS Cash  Trade/Select Time Dropdown'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Transaction Schedule/Page_BRICaMS Cash  Trade/Select Time 10.00'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/textarea_Remark_remark'), 
    remark)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/button_Next Create Single Transfer'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/span_Save  Send for Approval Create Single Transfer'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/span_Submit Pop up Send Transaction for Approval'))

WebUI.verifyElementVisible(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/button_Close Pop up Done'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/button_Close Pop up Done'))

detail1 = WebUI.getText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Transaction detail/Page_BRICaMS Cash  Trade/div_Transaction IDIFT57339'))

String substring = detail1.substring(detail1.indexOf('IFT'))

System.out.println('global1: ' + GlobalVariable.taskId)

System.out.println(substring)

GlobalVariable.taskId = substring

System.out.println('global2: ' + GlobalVariable.taskId)

