package helpdesk_portal
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



class ticketStepDef {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */


	@When("User Download Ticket")
	def User_Download_Ticket() {
		WebUI.callTestCase(findTestCase('Helpdesk Portal/Ticket/Download'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Data ticket Terdownload")
	def Data_Terdownload() {
	}

	@When("User Filter Ticket (.*)")
	def User_Filter_Ticket (String cell) {
		WebUI.callTestCase(findTestCase('Helpdesk Portal/Ticket/Filter'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Data Ticket Tampil sesuai Filter")
	def Data_Ticket_Tampil_sesuai_Filter() {
	}

	@When("User Update Ticket (.*) Status Ticket dari (.*) menjadi (.*) dengan priority (.*)")
	def User_Update_Ticket(String cell, String before, String after, String priority) {
		WebUI.callTestCase(findTestCase('Helpdesk Portal/Ticket/UpdateStatus'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Data Ticket Terupdate")
	def Data_TerUpdate() {
	}

	@When("User Resolve Ticket Number (.*) Status Ticket dari (.*) menjadi (.*) dengan priority (.*)")
	def User_Download_Ticket_Resolve (String cell, String before, String after, String priority) {
		WebUI.callTestCase(findTestCase('Helpdesk Portal/Ticket/UpdateStatusResolve'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Data Ticket Terupdate Resolve")
	def Data_TerUpdate_Resolve() {
	}
}