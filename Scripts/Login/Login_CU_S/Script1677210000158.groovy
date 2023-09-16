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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.excelFile, 'Login')

cell = 3

String Username = ExcelKeywords.getCellValueByAddress(sheet, 'A' + cell)

String Password = ExcelKeywords.getCellValueByAddress(sheet, 'B' + cell)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/login')

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Login/Page_BRICaMS Cash  Trade/input_Username'), Username)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Login/Page_BRICaMS Cash  Trade/input_PasswordAddson'), Password)

WebUI.delay(3)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Login/Page_BRICaMS Cash  Trade/button_Sign In'))

WebUI.delay(3)

