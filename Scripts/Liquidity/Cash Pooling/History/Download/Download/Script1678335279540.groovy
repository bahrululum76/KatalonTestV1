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

WebUI.takeFullPageScreenshotAsCheckpoint('Download cashpooling')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/Button Download Task'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/pdf1'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/Button Download Task'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/excel1'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/Button Download Task'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/csv1'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/Tab Ongoing Schema'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/Button Download Task'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/pdf1'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/Button Download Task'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/excel1'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/Button Download Task'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/csv1'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/Tab History'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/Button Download Task'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/pdf1'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/Button Download Task'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/excel1'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/Button Download Task'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/csv1'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/Download Log'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/pdf2'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/Download Log'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/excel2'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/Download Log'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Download/csv2'))

