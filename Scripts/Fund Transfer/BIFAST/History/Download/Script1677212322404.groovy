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

WebUI.delay(2)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/external-transfer/history?tab=bi-fast')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('Download Bifast')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/History/Page_BRICaMS Cash  Trade/button_Download'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/History/Page_BRICaMS Cash  Trade/button_PDF'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/History/Page_BRICaMS Cash  Trade/button_Download'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/History/Page_BRICaMS Cash  Trade/button_Excel (.xls)'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/History/Page_BRICaMS Cash  Trade/button_Download'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/History/Page_BRICaMS Cash  Trade/button_CSV'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/History/Page_BRICaMS Cash  Trade/button_Download log'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/History/Page_BRICaMS Cash  Trade/button_PDF log'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/History/Page_BRICaMS Cash  Trade/button_Download log'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/History/Page_BRICaMS Cash  Trade/button_Excel (.xls) log'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/History/Page_BRICaMS Cash  Trade/button_Download log'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/BIFAST/History/Page_BRICaMS Cash  Trade/button_CSVlog'))

WebUI.takeFullPageScreenshot()

