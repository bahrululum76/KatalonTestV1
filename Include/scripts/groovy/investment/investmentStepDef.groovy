package investment
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



class investmentStepDef {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */


	@When("User Download and Filter Data (.*) Investment on (.*)")
	def User_Download_and_Filter_Data_Investment (String cell, String tab) {
		WebUI.callTestCase(findTestCase('Investment/Filter Download/FilterDownload'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Data Investment Terdownload")
	def Data_Investment_Terdownload() {
	}

	@When("User Download and Filter Data (.*) Activity Log")
	def User_Download_and_Filter_Data_Investment_Activity_LOG (String cell) {
		WebUI.callTestCase(findTestCase('Investment/Filter Download/ActivityLogDownload'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Data Investment Activity Log Terdownload")
	def Data_Investment_Terdownload_Activity_Log() {
	}

	@When("User Create New NON ARO Deposito (.*) Account (.*) dengan tenor (.*) bulan")
	def User_Create_New_NON_ARO_Deposito(String cell, String account, String tenor) {
		WebUI.callTestCase(findTestCase('Investment/Create/CreateNonAro'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("Data NON ARO Terbuat")
	def Data_Non_ARO_Terbuat() {
	}

	@When("User Create New ARO Deposito (.*) Account (.*) dengan tenor (.*) bulan")
	def User_Create_New_ARO_Deposito(String cell, String account, String tenor) {
		WebUI.callTestCase(findTestCase('Investment/Create/CreateAro'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("Data ARO Terbuat")
	def Data_ARO_Terbuat() {
	}

	@When("User Create New ARO Combo Deposito (.*) Account (.*) dengan tenor (.*) bulan")
	def User_Create_New_ARO_Combo_Deposito(String cell, String account, String tenor) {
		WebUI.callTestCase(findTestCase('Investment/Create/CreateAroCombo'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("Data ARO Combo Terbuat")
	def Data_ARO_Combo_Terbuat() {
	}

	@When("User Approve Deposito (.*)")
	def User_Approve_Deposito(String cell) {
		WebUI.callTestCase(findTestCase('Investment/Signer/Approve'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("Data Deposito Terapprove")
	def Data_Deposito_TerApprove() {
	}

	@When("User Reject Deposito (.*)")
	def User_Reject_Deposito(String cell) {
		WebUI.callTestCase(findTestCase('Investment/Signer/Reject'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("Data Deposito Ter Reject")
	def Data_Deposito_Ter_Reject() {
	}

	@When("User Rework Deposito (.*)")
	def User_Rework_Deposito(String cell) {
		WebUI.callTestCase(findTestCase('Investment/Signer/Rework'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("Data Deposito Ter Rework")
	def Data_Deposito_Ter_Rework() {
	}

	@When("Save as Draft Deposito (.*) ")
	def User_Save_Draft_Deposito(String cell) {
		WebUI.callTestCase(findTestCase('Investment/Create/Create as draft'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("Data Deposito Save as Draft")
	def Data_Deposito_Save_as_Draft() {
	}

	@When("Delete Save as Draft Deposito (.*) ")
	def User_Delete_Draft_Deposito(String cell) {
		WebUI.callTestCase(findTestCase('Investment/Create/Delete Draft'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("Data Deposito Deleted")
	def Data_Deposito_Deleted() {
	}

	@When("User Search Data (.*) on Investment Tab (.*)")
	def User_Search_Data_On_Investment (String cell, String tab) {
		WebUI.callTestCase(findTestCase('Investment/Filter Download/Search'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Data Investment Searched")
	def Data_Investment_Searched() {
	}

	@When("User Filter Data (.*) on Investment Tab (.*)")
	def User_Filter_Data_Investment (String cell, String tab) {
		WebUI.callTestCase(findTestCase('Investment/Filter Download/Filter'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Data Investment Filtered")
	def Data_Investment_Filtered() {
	}
}