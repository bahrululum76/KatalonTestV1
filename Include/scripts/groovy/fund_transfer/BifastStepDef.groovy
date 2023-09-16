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



class BifastStepDef {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	//Create Immediate
	@When("User Create BI FAST Immediate (.*)")
	def User_Create_BI_FAST_Immediate (String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/BIFAST/Create/CreateImmediate'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("BIFAST Immediate CREATED")
	def BIFAST_Immediate_CREATED() {
	}

	//Create Bifast save as draf
	@When("User Create BI FAST SaveAsDraf (.*)")
	def User_Create_BI_FAST_SaveAsDraf (String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/BIFAST/Create/Create Save to Draf'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("BIFAST SaveAsDraf CREATED")
	def BIFAST_SaveAsDraf_CREATED() {
	}

	//Create Bifast Min
	@When ("User Create BI FAST Min (.*)")
	def User_Created_BIFAST_min (String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/BIFAST/Create/min'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	//Create Bifast Max
	@When ("User Create BI FAST Max (.*)")
	def User_Created_BIFAST_mAX (String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/BIFAST/Create/max'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	//Create Schedule
	@When("User Create BI FAST Schedule (.*)")
	def User_Create_BI_FAST_Schedule(String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/BIFAST/Create/CreateSchedule'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("BIFAST Schedule CREATED")
	def BIFAST_Schedule_CREATED() {
	}

	//Create Recurring Daily
	@When("User Create BI FAST Recurring Daily (.*)")
	def User_Create_BI_FAST_Recurring_Daily (String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/BIFAST/Create/Recurring/RecurringDaily'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("BIFAST Recurring Daily CREATED")
	def BIFAST_Recurring_Daily_CREATED() {
	}

	//Create Recurring Weekly
	@When("User Create BI FAST Recurring weekly (.*)")
	def User_Create_BI_FAST_weekly (String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/BIFAST/Create/Recurring/RecurringWeekly'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("BIFAST Recurring weekly CREATED")
	def BIFAST_weekly_CREATED() {
	}

	//Create Recurring Monthly
	@When("User Create BI FAST Recurring Monthly (.*)")
	def User_Create_BI_FAST_monthly (String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/BIFAST/Create/Recurring/CreateReccuringMonthly'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("BIFAST Recurring monthly CREATED")
	def BIFAST_monthly_CREATED() {
	}

	//Approve
	@When("User Approve Transaksi BIFAST (.*)")
	def User_Approve_Transaksi_BIFAST(String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/BIFAST/Approval/Approval'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Transaksi BIFAST Terapprove")
	def Transaksi_BIFAST_Terapprove() {
	}

	//Reject
	@When("User Rejected Transaksi BIFAST (.*)")
	def User_Reject_Transaksi_BIFAST(String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/BIFAST/Approval/Rejected'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Transaksi BIFAST Tereject")
	def Transaksi_BIFAST_Tereject() {
	}

	//Rework
	@When("User Kirim Transaksi BIFAST ke Rework (.*)")
	def User_Kirim_Transaksi_BIFAST_ke_Rework(String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/BIFAST/Approval/Rework'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Transaksi BIFAST di kirim ke Rework")
	def Transaksi_BIFAST_di_kirim_ke_Rework() {
	}

	//Download
	@When("User Download BIFAST")
	def User_Download_BIFAST() {
		WebUI.callTestCase(findTestCase('Fund Transfer/BIFAST/History/Download'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("Data Terdownload")
	def Data_Terdownload() {
	}

	//filter
	@When("User Filter BIFAST (.*)")
	def User_Filter_BIFAST(String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/BIFAST/History/Filter'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("Data Tampil sesuai Filter")
	def Data_Tampil_sesuai_Filter() {
	}

	//Search
	@When("User Search BIFAST (.*)")
	def User_Search_BIFAST(String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/BIFAST/History/Searching'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Data Tampil sesuai Search")
	def Data_Tampil_sesuai_Search() {
	}

	//delete bifast draft
	@When("User Delete BIFAST Draft (.*)")
	def User_Delete_BIFAST_Draft (String cell) {
		WebUI.callTestCase(findTestCase('Fund Transfer/BIFAST/History/Delete Status Draf'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Data Terhapus")
	def Data_Terhapus() {
	}

}