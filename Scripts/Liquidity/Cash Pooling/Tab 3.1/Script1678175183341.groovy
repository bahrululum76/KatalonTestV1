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

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.excelFile, 'LM')

String TabType = ExcelKeywords.getCellValueByAddress(sheet, 'H' + cell)

String Ammount = ExcelKeywords.getCellValueByAddress(sheet, 'J' + cell)

String TbaValue = ExcelKeywords.getCellValueByAddress(sheet, 'K' + cell)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Tab 3'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Input TBA Type'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Input TBA Type'), TabType + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Checkbox Rounded Base'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Input Ammount'), Ammount)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/TBA Value 0'), TbaValue + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/TBA Value 1'), TbaValue + Keys.ENTER)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/TBA Value 2'), TbaValue + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/TBA Value 3'), TbaValue + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/TBA Value 4'), TbaValue + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/TBA Value 5'), TbaValue + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/TBA Value 6'), TbaValue + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/TBA Value 7'), TbaValue + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/TBA Value 8'), TbaValue + Keys.ENTER)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/TBA Value 9'), TbaValue + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Page_BRICaMS Cash  Trade/Pag 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/TBA Value 10'), TbaValue + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Button save approval'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

try {
    if (WebUI.verifyElementPresent(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Page_BRICaMS Cash  Trade/input_Masukan OTP'), 
        0)) {
        WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Page_BRICaMS Cash  Trade/input_Masukan OTP'), 
            '4347898')
    }
}
catch (Exception e) {
    // Handle the exception
    println('Element Tidak ada ')
} 

WebUI.takeFullPageScreenshot([])

try {
    if (WebUI.verifyElementPresent(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Button Submit'), 0)) {
        WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Button Submit'), FailureHandling.STOP_ON_FAILURE)
    }
}
catch (Exception e) {
    // Handle the exception
    println('Element Tidak ada ')
} 

try {
    if (WebUI.verifyElementPresent(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Page_BRICaMS Cash  Trade/Button Submit 2'), 
        0)) {
        WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Page_BRICaMS Cash  Trade/Button Submit 2'), 
            FailureHandling.STOP_ON_FAILURE)
    }
}
catch (Exception e) {
    // Handle the exception
    println('Element Tidak ada ')
} 

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Liquidity/LM/Create/Tab 3/Button Done'), FailureHandling.STOP_ON_FAILURE)

