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
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.callTestCase(findTestCase('Login/Login_CU_S'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/liquidities/cash-pooling?tab=active-tasks')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Filter'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/status'), 'draf' + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/History/Filter/Button Apply Filter'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Edit/Edit'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Edit/Button save approve'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Edit/Submit edit'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Edit/Done edit'))

