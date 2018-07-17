import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Call login test case'
WebUI.callTestCase(findTestCase('Super Admin/1.0. Verify that super admin is able to login with valid details'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Click on status filter'
WebUI.click(findTestObject('1.1. Energy Advisors listing page/Filter by status'))

'Select active status'
WebUI.click(findTestObject('1.1. Energy Advisors listing page/Filter by status active'))

'Get status of first record'
def object1 = WebUI.getText(findTestObject('1.1. Energy Advisors listing page/First record status'))

'Verify the status of first record'
boolean bol = object1 == 'Active'

'Get result of comparison'
assert bol == true

'Click on status filter'
WebUI.click(findTestObject('1.1. Energy Advisors listing page/Filter by status'))

'Select Inactive status'
WebUI.click(findTestObject('1.1. Energy Advisors listing page/Filter by status inactive'))

'Get status of first record'
def object2 = WebUI.getText(findTestObject('1.1. Energy Advisors listing page/First record status'))

'Verify the status of first record'
boolean bol1 = object2 == 'Inactive'

'Get result of comparison'
assert bol1 == true

'Click on status filter'
WebUI.click(findTestObject('1.1. Energy Advisors listing page/Filter by status'))

'Select all status'
WebUI.click(findTestObject('1.1. Energy Advisors listing page/Filter by status all'))

WebUI.closeBrowser()

