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

WebUI.openBrowser('https://addons.cms.dev.bri.co.id/login')

WebUI.takeFullPageScreenshotAsCheckpoint('Checkpoint login 1')

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Login/Page_BRICaMS Cash  Trade/input_Username'), 'CU_KATALON01_M')

WebUI.takeFullPageScreenshotAsCheckpoint('Checkpoint login 2')

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Login/Page_BRICaMS Cash  Trade/input_PasswordAddson'), 'Nsel@1234')

WebUI.takeFullPageScreenshotAsCheckpoint('Checkpoint login 3')

WebUI.delay(3)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Login/Page_BRICaMS Cash  Trade/button_Sign In'))

WebUI.takeFullPageScreenshotAsCheckpoint('Checkpoint login 5')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('Checkpoint login 4')

