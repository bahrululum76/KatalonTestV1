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

WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/Tab 1.3'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/Tab 2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/Tab 3'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/liquidities/cash-pooling/create')

not_run: WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input Company Group'), 'rosneft' + 
    Keys.ENTER)

not_run: WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input Company'), 'rosneft' + Keys.ENTER)

not_run: WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input Schema Description'), 'DESCRIPTION')

not_run: WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input Currency'), 'IDR' + Keys.ENTER)

not_run: def today = LocalDate.now()

not_run: def todayString = today.format(DateTimeFormatter.ofPattern('dd/MM/yyyy'))

not_run: WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input StarDate'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input StarDate'), todayString + 
    Keys.ENTER)

not_run: Calendar cal = Calendar.getInstance()

not_run: cal.add(Calendar.DATE, 7)

not_run: SimpleDateFormat dateFormat = new SimpleDateFormat('dd/MM/yyyy')

not_run: String nextWeekDate = dateFormat.format(cal.getTime())

not_run: WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input EndDate'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input EndDate'), nextWeekDate + 
    Keys.ENTER)

not_run: WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input Ontime'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input Cashflow Type'), 'Topping' + 
    Keys.ENTER)

not_run: WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input Cashflow periode'), 'Daily' + 
    Keys.ENTER)

not_run: WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input Time'), '07:00' + Keys.ENTER)

not_run: WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 2/Tab 2'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 2/Checkbox CA IDR'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 2/Button Add Benef'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 2/CheckBox select all account source'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 2/Button Add account'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Tab 3'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Input TBA Type'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Input TBA Type'), 'Zero' + Keys.ENTER)

not_run: WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Button save approval'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Button Submit'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(3)

not_run: WebUI.takeFullPageScreenshot()

not_run: WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Button Done'), FailureHandling.STOP_ON_FAILURE)

