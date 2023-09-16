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



class SwiftStepDef {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	//create swift
	@When("User Create Swift (.*)")
	def User_Create_Swift (String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/SWIFT/Create/Input detail'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User Klik Send&Approval")
	def User_Klik_SendApprove() {
	}

	@Then("User Klik Submit")
	def User_Klik_Submit() {
		WebUI.delay(3)
		
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/button_Submit1'))
		WebUI.delay(3)
		
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/button_Done'))
	}
	
	//SAVE AS DRAF
	@When("User Create SwiftDraft (.*)")
	def User_Create_SwiftDraft (String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/SWIFT/Create/Input Save As Draf'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("User Klik Done")
	def User_Klik_Done() {
		WebUI.delay(5)
		
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/Button Done Save As Draf'))

	}

	//CreateSwiftSchedule
	@When("User Create SwiftS (.*)")
	def User_Create_SwiftS (String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/SWIFT/Create/Input schedule'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User Klik Send&ApprovalS")
	def User_Klik_SendApproveS() {
	}

	@Then("User Klik SubmitS")
	def User_Klik_SubmitS() {
		WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/button_Submit1'))

		WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Create/button_Done'))
	}

	//Approval
	@When("User Melakukan Approval (.*)")
	def User_Melakukan_Approval (String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/SWIFT/Approval/Approval'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}


	@Then("Transaksi Berhasil di Approve")
	def Transaksi_Berhasil_di_Approve () {
	}

	//Rejected
	@When("User Melakukan Rejected (.*)")
	def User_Melakukan_Rejected (String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/SWIFT/Approval/Reject'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}


	@Then("Transaksi Berhasil di Reject")
	def Transaksi_Berhasil_di_Reject () {
	}

	//Rework
	@When("User Melakukan Rework (.*)")
	def User_Melakukan_Rework (String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/SWIFT/Approval/Send to Rework'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}


	@Then("Transaksi Berhasil di Rework")
	def Transaksi_Berhasil_di_Rework () {
	}


	//filter
	@When("Filter Tabel by (.*)")
	def Filter_Tabel_by(String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/SWIFT/Filter/Filter'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Tampil sesuai filter")
	def Tampil_sesuai_filter() {
	}


	//Searching
	@When("Input Keyword Searching by (.*)")
	def Input_Keyword_Searching_by(String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/SWIFT/Filter/Searching'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Input Kerword Searching Activity Log")
	def Input_Keyword_Searching_Activity_Log() {
	}
	@Then("Data Tampil sesuai Searching")
	def data_Tampil_sesuai_Search () {
	}


	//Download
	@When ("Download by data table")
	def Download_by_data_table() {
		WebUI.callTestCase(findTestCase('Fund Transfer/SWIFT/History/Download_data_by_table'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And ("Download By Filter")
	def Download_by_Filter() {
		WebUI.callTestCase(findTestCase('Fund Transfer/SWIFT/History/Download by Filter'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And ("Download by Log")
	def Download_by_Log() {
		WebUI.callTestCase(findTestCase('Fund Transfer/SWIFT/History/Download Activity Log'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And ("Download by Log search")
	def Download_by_Log_search() {
		WebUI.callTestCase(findTestCase('Fund Transfer/SWIFT/History/Download Activity Log by Seach'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Data terdownload")
	def Data_terdownload() {
	}

}