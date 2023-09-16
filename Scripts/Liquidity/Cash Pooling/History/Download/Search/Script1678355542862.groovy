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

WebUI.delay(3)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/liquidities/cash-pooling?tab=active-tasks')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('Search cashpooling')

WebUI.scrollToElement(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Searching/Table'), 0)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Searching/Search Table'), 'LCP-1678177528-M91PJF')

WebUI.delay(3)

WebUI.takeFullPageScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Searching/Search Table'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/Tab Ongoing Schema'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Searching/Search Table'), 'LCP-1678335856-48J4Y7')

WebUI.delay(3)

WebUI.takeFullPageScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Searching/Search Table'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/Tab History'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Searching/Search Table'), 'LCP-1678344183-LHRFGD')

WebUI.delay(3)

WebUI.takeFullPageScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Searching/Search Table'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Searching/Search Log'), 'CU_Rosneft_m')

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Searching/Select Activity'), 'Last Week', 
    false)

WebUI.delay(3)

WebUI.takeFullPageScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Searching/Search Log'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Searching/Select Activity'), 'Last Week', 
    false)

WebUI.delay(3)

WebUI.takeFullPageScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Searching/Select Activity'), 'Last Month', 
    false)

WebUI.delay(3)

WebUI.takeFullPageScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Searching/Select Activity'), 'Last 3 Months', 
    false)

WebUI.delay(3)

WebUI.takeFullPageScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Searching/Select Activity'), 'Last 6 Months', 
    false)

WebUI.delay(3)

WebUI.takeFullPageScreenshot(FailureHandling.STOP_ON_FAILURE)

