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

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/internal-transfer/history')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Checker Role/Page_BRICaMS Cash  Trade/ID a_IFT57335 Detail Click'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Rework/Page_BRICaMS Cash  Trade/button_Edit'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Rework/Page_BRICaMS Cash  Trade/button_Check'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/button_Next Create Single Transfer'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/input_Amount_transactionScheduleType Immediate'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/textarea_Remark_remark'), 
    'Remaks Automaton Rework')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/button_Next Create Single Transfer'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/span_Save  Send for Approval Create Single Transfer'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/span_Cancel Pop up Send Transaction for Approval'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/span_Save  Send for Approval Create Single Transfer'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/span_Submit Pop up Send Transaction for Approval'))

WebUI.verifyElementVisible(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/button_Close Pop up Done'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Maker Role/Page_BRICaMS Cash  Trade/button_Close Pop up Done'))

