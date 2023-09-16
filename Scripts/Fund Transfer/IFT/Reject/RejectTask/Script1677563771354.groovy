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

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Checker Role/Page_BRICaMS Cash  Trade/span_Reject'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Signer Role/Pop up Not Approve/Others Click Box'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Signer Role/Pop up Not Approve/textarea_Description Remark'), 
    'Automate Reject')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Signer Role/Pop up Not Approve/span_Reject Task'))

WebUI.verifyElementVisible(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Checker Role/Page_BRICaMS Cash  Trade/button_Close setelah approve'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/IFT/Checker Role/Page_BRICaMS Cash  Trade/button_Close setelah approve'))

