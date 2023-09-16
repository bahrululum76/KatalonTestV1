package fund_transfer
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



class IFTStepDef {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	//Create Immediate
	@When("User Create IFT Immediate (.*)")
	def User_Create_BI_FAST_Immediate (String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/IFT/Create/CreateImmediate'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("IFT Immediate CREATED")
	def IFT_Immediate_CREATED () {
	}

	//Create Schedule
	@When("User Create IFT Schedule (.*)")
	def User_Create_BI_FAST_Schedule (String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/IFT/Create/CreateSchedule'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("IFT Schedule CREATED")
	def IFT_Schedule_CREATED () {
	}

	//Create Recurring
	@When("User Create IFT Recurring (.*)")
	def User_Create_BI_FAST_Recurring (String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/IFT/Create/CreateRecurring'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("IFT Recurring CREATED")
	def IFT_Recurring_CREATED () {
	}

	@When("User Approve IFT Task 03 (.*)")
	def User_Approve_IFT_Task(String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/IFT/Approve/ApproveIFT'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("IFT Approved")
	def IFT_Approved() {
	}

	@When("User Reject IFT Task 02 (.*)")
	def User_Reject_IFT_Task(String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/IFT/Reject/RejectTask'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("IFT Rejected")
	def IFT_Rejected() {
	}

	@When("User Send to Rework IFT Task 01 (.*)")
	def User_SendToRework_IFT_Task(String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/IFT/Reject/SendToReworkTask'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("IFT SendToReworked")
	def IFT_SendtoReworked() {
	}
}