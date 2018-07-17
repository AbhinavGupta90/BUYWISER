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

'Wait for search field'
WebUI.waitForElementPresent(findTestObject('1.1. Energy Advisors listing page/Search Field'), 0)

'Get ID of first record'
def object1 = WebUI.getText(findTestObject('1.1. Energy Advisors listing page/First record ID'))

'Get name of first record'
def object2 = WebUI.getText(findTestObject('1.1. Energy Advisors listing page/First record name'))

'Get company of first record'
def object3 = WebUI.getText(findTestObject('1.1. Energy Advisors listing page/First record company'))

'Get email ID of first record'
def object4 = WebUI.getText(findTestObject('1.1. Energy Advisors listing page/First record email ID'))

'Enter email in search field'
WebUI.sendKeys(findTestObject('1.1. Energy Advisors listing page/Search Field'), object4)

'Click on search button'
WebUI.click(findTestObject('1.1. Energy Advisors listing page/Search button'))

'Get email ID of searched record'
def object5 = WebUI.getText(findTestObject('1.1. Energy Advisors listing page/Searched record email ID'))

'Compare text'
WebUI.verifyMatch(object4, object5, false)

WebUI.closeBrowser()

