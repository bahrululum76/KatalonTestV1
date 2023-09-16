package liquidity
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class CashPoolingStepDef {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	//Create
	@When("User Create cashpooling tab1 (.*)")
	def User_Create_cashpooling_tab1 (String cell) {
		WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/Tab 1'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@When("User Create cashpooling tab1_BA (.*)")
	def User_Create_cashpooling_tab1_ba (String cell) {
		WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/Tab 1 - BA'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User Create cashpooling tab11 (.*)")
	def User_Create_cashpooling_tab11 (String cell) {
		WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/Tab 1.1'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@When("User Create cashpooling tab12 (.*)")
	def User_Create_cashpooling_tab12 (String cell) {
		WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/Tab 1.2'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User Create cashpooling tab13 (.*)")
	def User_Create_cashpooling_tab13 (String cell) {
		WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/Tab 1.3'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User Edit cashpooling draft (.*)")
	def User_Edit_cashpooling_draft (String cell) {
		WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/Tab 1 edit'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User Create cashpooling tab2")
	def User_Create_cashpooling_tab2 () {
		WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/Tab 2'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User Create cashpooling tab3 (.*)")
	def User_Create_cashpooling_tab3 (String cell) {
		WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/Tab 3'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User Create cashpooling tab31 (.*)")
	def User_Create_cashpooling_tab31 (String cell) {
		WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/Tab 3.1'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@And("User Create cashpooling tab33 (.*)")
	def User_Create_cashpooling_tab33 (String cell) {
		WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/Tab3.3'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Cashpooling created")
	def Cashpooling_created() {
	}

	//Filter
	@When("User Filter CashPooling1 (.*)")
	def User_Filter_CashPooling1 (String cell) {
		WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/History/Filter/Tab1'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@And("User Filter CashPooling2 (.*)")
	def User_Filter_CashPooling2 (String cell) {
		WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/History/Filter/Tab 2'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@And("User Filter CashPooling3 (.*)")
	def User_Filter_CashPooling3 (String cell) {
		WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/History/Filter/Tab 3'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("Data cashpooling Tampil sesuai Filter")
	def Data_cashpooling_Tampil_sesuai_Filter() {
	}

	//Search
	@When("User Search CashPooling")
	def User_Search_CashPooling () {
		WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/History/Download/Search'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("Data CashPooling Tampil")
	def Data_CashPooling_Tampil() {
	}

	//Download
	@When("User Download CashPooling")
	def User_Download_CashPooling () {
		WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/History/Download/Download'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("Data CashPooling Terdownload")
	def Data_CashPooling_Terdownload() {
	}

	//Approve
	@When("User Approve CashPooling")
	def User_Approve_CashPooling () {
		WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/Approval/Approval'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("Data CashPooling Terapprove")
	def Data_CashPooling_Terapprove() {
	}
	
	//Reject
	@When("User Reject CashPooling")
	def User_Reject_CashPooling () {
		WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/Approval/Rejected'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("Data CashPooling Tereject")
	def Data_CashPooling_Tereject() {
	}

	//Rework
	@When("User Rework CashPooling")
	def User_Rework_CashPooling () {
		WebUI.callTestCase(findTestCase('Liquidity/Cash Pooling/Approval/Rework'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("Data CashPooling Terework")
	def Data_CashPooling_Terework() {
	}
}