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

'Wait for "Properties" in top navigation'
WebUI.waitForElementPresent(findTestObject('1.1. Energy Advisors listing page/Top navigation properties'), 0)

'Click on properties'
WebUI.click(findTestObject('1.1. Energy Advisors listing page/Top navigation properties'))

'Wait for header properties'
WebUI.waitForElementPresent(findTestObject('1.5. Property listing page/Header Properties'), 0)

'Click on add new property link'
WebUI.click(findTestObject('1.5. Property listing page/Add new property link'))

'Wait for header add new property'
WebUI.waitForElementPresent(findTestObject('1.6. Add property page/Header add new property'), 0)

'Enter client ID'
WebUI.sendKeys(findTestObject('1.6. Add property page/Enter client'), 'C1')

'Wait for client list'
WebUI.waitForElementPresent(findTestObject('1.6. Add property page/Select client'), 0)

'Select client'
WebUI.click(findTestObject('1.6. Add property page/Select client'), FailureHandling.CONTINUE_ON_FAILURE)

'Enter street'
WebUI.sendKeys(findTestObject('1.6. Add property page/Enter street1'), CustomKeywords.'newPackage.TestDataGenerator.getRandomCity'())

'Generate random city and store in object1'
def object1 = CustomKeywords.'newPackage.TestDataGenerator.getRandomCity'()

'Enter city'
WebUI.sendKeys(findTestObject('1.6. Add property page/Enter city'), object1)

'Enter postal code'
WebUI.sendKeys(findTestObject('1.6. Add property page/Enter postal code'), 'A1A 1A1')

'Click on ownership drop-down'
WebUI.click(findTestObject('1.6. Add property page/Select ownership'))

'Select dewlling private option'
WebUI.click(findTestObject('1.6. Add property page/Select dwelling private'))

'Enter builder name'
WebUI.sendKeys(findTestObject('1.6. Add property page/Enter builder name'), CustomKeywords.'newPackage.TestDataGenerator.getRandomFirstName'())

'Enter property tax roll'
WebUI.sendKeys(findTestObject('1.6. Add property page/Enter property tax roll'), '12345')

'Click on add new property button'
WebUI.click(findTestObject('1.6. Add property page/Add new property button'))

'Wait for header properties'
WebUI.waitForElementPresent(findTestObject('1.5. Property listing page/Header Properties'), 0)

'Get city of property'
def object2 = WebUI.getText(findTestObject('1.5. Property listing page/First row city'))

'Compare text'
WebUI.verifyMatch(object1, object2, false)

