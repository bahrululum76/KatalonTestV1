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

String filePatch = RunConfiguration.getProjectDir() + '/Data Files/Rose.pdf'

Path absolutePath = Paths.get(filePatch)

String absolutePathStr = absolutePath.toString()


WebUI.uploadFile(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page4/InputFile Legalitas Usaha'),
	absolutePathStr)

WebUI.uploadFile(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page4/InputFile Tender'), absolutePathStr)

try {
	if (WebUI.verifyElementPresent(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page4/InputFile SP3'),
		0)) {
		WebUI.uploadFile(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page4/InputFile SP3'),
			absolutePathStr)
	}
}
catch (Exception e) {
	println('Element not found: ' + e.getMessage())
}

WebUI.uploadFile(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page4/InputFile Dok Lainnya'),
	absolutePathStr)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page4/Button Next 4'), FailureHandling.STOP_ON_FAILURE)

