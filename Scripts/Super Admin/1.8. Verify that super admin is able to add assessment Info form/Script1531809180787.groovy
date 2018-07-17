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

'Wait for "Assessments" in top navigation'
WebUI.waitForElementPresent(findTestObject('1.1. Energy Advisors listing page/Top navigation assessments'), 0)

'Click on assessments'
WebUI.click(findTestObject('1.1. Energy Advisors listing page/Top navigation assessments'))

'Wait for menu button'
WebUI.waitForElementPresent(findTestObject('1.8. Add assessment house form/1.8.1. General form/Assessment menu button'), 
    0)

'Click on menu button'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.1. General form/Assessment menu button'))

'Click on edit button'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.1. General form/Assessment edit button'))

'Wait for header assessment'
WebUI.waitForElementPresent(findTestObject('1.7. Assessment listing page/Header assessments'), 0)

'Click on info tab'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.2. Info form/Info tab'))

'Wait for first value field'
WebUI.waitForElementPresent(findTestObject('1.8. Add assessment house form/1.8.2. Info form/Info value 1'), 0)

'Enter first value'
WebUI.sendKeys(findTestObject('1.8. Add assessment house form/1.8.2. Info form/Info value 1'), 'Value 1 here')

'Enter second value'
WebUI.sendKeys(findTestObject('1.8. Add assessment house form/1.8.2. Info form/Info value 2'), 'Value 2 here')

'Enter third value'
WebUI.sendKeys(findTestObject('1.8. Add assessment house form/1.8.2. Info form/Info value 3'), 'Value 3 here')

WebUI.delay(5)

'Click on save and continue button'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.2. Info form/Save and continue button'))

