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

'Open browser'
WebUI.openBrowser('')

'Launch the URL'
WebUI.navigateToUrl('http://buy-buywiser-qc.netsol.local/')

'Maximize window'
WebUI.maximizeWindow()

'Wait for email field'
WebUI.waitForElementPresent(findTestObject('1.0. Log in page/Email field'), 0)

'Enter email'
WebUI.sendKeys(findTestObject('1.0. Log in page/Email field'), 'admin@admin.com')

'Enter password'
WebUI.sendKeys(findTestObject('1.0. Log in page/Password field'), 'Admin@123456')

'Click on submit button'
WebUI.click(findTestObject('1.0. Log in page/Submit Button'))

'Wait for header energy advisor'
WebUI.waitForElementPresent(findTestObject('1.1. Energy Advisors listing page/Header Energy Advisors '), 1)

