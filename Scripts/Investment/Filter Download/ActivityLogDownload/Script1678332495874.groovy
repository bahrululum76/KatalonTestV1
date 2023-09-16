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
String activity = ExcelKeywords.getCellValueByAddress(sheet, 'J' + cell)

WebUI.delay(4)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/online-time-deposit/time-deposit-account')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_BRICaMS Cash  Trade/Investment/Tab Activity'), 4)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/button_Download_ActivityLog'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Activity Log/button Download CSV'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/button_Download_ActivityLog'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Activity Log/button Download Excel (.xls)'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/button_Download_ActivityLog'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Activity Log/button Download PDF'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Investment/Activity Log/input search table activity table'), depositNo, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/button_Download_ActivityLog'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Activity Log/button Download CSV'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/button_Download_ActivityLog'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Activity Log/button Download Excel (.xls)'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/button_Download_ActivityLog'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Activity Log/button Download PDF'))

WebUI.clearText(findTestObject('Page_BRICaMS Cash  Trade/Investment/Activity Log/input search table activity table'))

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Investment/Activity Log/select Activity'), activity, 
    false)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/button_Download_ActivityLog'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Activity Log/button Download CSV'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/button_Download_ActivityLog'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Activity Log/button Download Excel (.xls)'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/button_Download_ActivityLog'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Investment/Activity Log/button Download PDF'))

