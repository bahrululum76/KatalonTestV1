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

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/external-transfer/history?tab=remittance-transfer')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/div_Remittance Transfer'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/button_Customize'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Customize_ All'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Account No'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Action'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Ammount'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Beneficiary Account No'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_BeneficiaryName'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Beneficiary Bank Name'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_BeneficiaryName'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Countri'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_createdby'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Currency'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Date'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_DateComplete'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_ReviewedBy'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Select  Transaction id'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Status'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Filter/Page_BRICaMS Cash  Trade/input_Customize_ All'))

