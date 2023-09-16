package subscription
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



class SubscriptionStefDev {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@When("User Filter Subscription (.*)")
	def User_Filter_Subscription(String cell) {
		WebUI.callTestCase(findTestCase('Subscription Management/Filter/Filter'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Data Subscription Tampil sesuai Filter")
	def Data_Subscription_Tampil_sesuai_Filter() {
		
	}
	
	@When("User Search Subscription (.*)")
	def User_Search_Subscription(String cell) {
		WebUI.callTestCase(findTestCase('Subscription Management/Search/Search'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Data Subscription Tampil")
	def Data_Subscription_Tampil() {
		
	}
	
	@When("User Download Subscription")
	def User_Download_Subscription() {
		WebUI.callTestCase(findTestCase('Subscription Management/Download/Download'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Data Subscription Terdownload")
	def Data_Subscription_Terdownload() {
		
	}
}