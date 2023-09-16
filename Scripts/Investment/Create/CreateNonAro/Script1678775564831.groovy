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

account = ExcelKeywords.getCellValueByAddress(sheet, 'L' + cell)

String amount = ExcelKeywords.getCellValueByAddress(sheet, 'M' + cell)

String tenor = ExcelKeywords.getCellValueByAddress(sheet, 'N' + cell)

GlobalVariable.tenor = tenor

WebUI.delay(4)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/online-time-deposit/time-deposit-account')

WebUI.delay(2)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Create/button Open New Time Deposit'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Create/Tab 5 Liquidation n Early Withdrawal'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Create/checklist Read and agree term of services'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Create/button Next pop up create new deposit'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Create/Select Input Source Account'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page_BRICaMS Cash  Trade/Investment/Create/Select Input Source Account'), account + Keys.ENTER, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Create/button_CheckBalance'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Create/input_Non Automatic Roll Over (Non-ARO)_deposit_type'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Create/button Next Tab 1'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Investment/Create/input_IDR_amount'), amount)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Create/Select Tenor'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Create/Tenor Options'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Create/button Next Tab 2'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Create/button Next tab 3'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Create/button Submit'))

WebUI.verifyElementPresent(findTestObject('Page_BRICaMS Cash  Trade/Investment/Create/button_Done'), 4, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Create/button_Done'))

