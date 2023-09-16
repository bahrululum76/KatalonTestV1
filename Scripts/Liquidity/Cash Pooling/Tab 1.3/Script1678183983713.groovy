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

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.excelFile, 'LM')

String CompanyGroup = ExcelKeywords.getCellValueByAddress(sheet, 'A' + cell)

String Company = ExcelKeywords.getCellValueByAddress(sheet, 'B' + cell)

String Desc = ExcelKeywords.getCellValueByAddress(sheet, 'C' + cell)

String Cur = ExcelKeywords.getCellValueByAddress(sheet, 'D' + cell)

String CashflowType = ExcelKeywords.getCellValueByAddress(sheet, 'E' + cell)

String Periode = ExcelKeywords.getCellValueByAddress(sheet, 'F' + cell)

String Time = ExcelKeywords.getCellValueByAddress(sheet, 'G' + cell)

String PeriodeOther = ExcelKeywords.getCellValueByAddress(sheet, 'I' + cell)

WebUI.navigateToUrl('https://addons.cms.dev.bri.co.id/liquidities/cash-pooling/create')

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input Company Group'), CompanyGroup + Keys.ENTER)

not_run: WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input Company'), Company + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input Schema Description'), Desc)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input Currency'), Cur + Keys.ENTER)

def today = LocalDate.now()

def todayString = today.format(DateTimeFormatter.ofPattern('dd/MM/yyyy'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input StarDate'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input StarDate'), todayString + Keys.ENTER)

Calendar cal = Calendar.getInstance()

cal.add(Calendar.DATE, 30)

SimpleDateFormat dateFormat = new SimpleDateFormat('dd/MM/yyyy')

String nextWeekDate = dateFormat.format(cal.getTime())

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input EndDate'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input EndDate'), nextWeekDate + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input Ontime'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input Cashflow Type'), CashflowType + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input Cashflow periode'), Periode + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input select date'), PeriodeOther + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 1/Input Time 1.3'), Time + Keys.ENTER)

