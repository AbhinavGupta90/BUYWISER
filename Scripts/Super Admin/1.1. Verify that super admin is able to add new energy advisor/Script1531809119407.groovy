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
import org.apache.commons.lang.RandomStringUtils as RandStr

'Call login test case'
WebUI.callTestCase(findTestCase('Super Admin/1.0. Verify that super admin is able to login with valid details'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Click on add new account link'
WebUI.click(findTestObject('1.1. Energy Advisors listing page/Add New Account link'))

'Wait for header create new advisor account'
WebUI.waitForElementPresent(findTestObject('1.2. Add Energy Advisor page/Header create new advisor account'), 0)

'Enter advisor identifier code'
WebUI.sendKeys(findTestObject('1.2. Add Energy Advisor page/Advisor Identifier Code'), 5 + CustomKeywords.'newPackage.TestDataGenerator.getRandomHeading'(
        1))

'Enter company name'
WebUI.sendKeys(findTestObject('1.2. Add Energy Advisor page/Company Name'), CustomKeywords.'newPackage.TestDataGenerator.getRandomFirstName'())

'Enter first name'
WebUI.sendKeys(findTestObject('1.2. Add Energy Advisor page/First Name'), CustomKeywords.'newPackage.TestDataGenerator.getRandomFirstName'())

'Enter last name'
WebUI.sendKeys(findTestObject('1.2. Add Energy Advisor page/Last Name'), CustomKeywords.'newPackage.TestDataGenerator.getRandomLastName'())

'Enter business phone'
WebUI.sendKeys(findTestObject('1.2. Add Energy Advisor page/Business Phone'), '9876543210')

'Enter home phone'
WebUI.sendKeys(findTestObject('1.2. Add Energy Advisor page/Home Phone'), '9876543210')

'Enter mobile number'
WebUI.sendKeys(findTestObject('1.2. Add Energy Advisor page/Mobile Number'), '9876543210')

'Enter Extension'
WebUI.sendKeys(findTestObject('1.2. Add Energy Advisor page/Extension'), '12345')

'Generate random email and store in object1'
def object1 = CustomKeywords.'newPackage.TestDataGenerator.getRandomEmail'()

'Enter email'
WebUI.sendKeys(findTestObject('1.2. Add Energy Advisor page/Email Address'), object1)

'Get text of First object'
println('Email entered is ' + object1)

'Enter street'
WebUI.sendKeys(findTestObject('1.2. Add Energy Advisor page/Street'), CustomKeywords.'newPackage.TestDataGenerator.getRandomCity'())

'Enter City'
WebUI.sendKeys(findTestObject('1.2. Add Energy Advisor page/City'), CustomKeywords.'newPackage.TestDataGenerator.getRandomCity'())

'Enter postal code'
WebUI.sendKeys(findTestObject('1.2. Add Energy Advisor page/Postal Code'), 'A1A 1A1')

'Enter postal code'
WebUI.sendKeys(findTestObject('1.2. Add Energy Advisor page/Postal Code'), 'A1A 1A1')

'Select alternate address checkbox'
WebUI.click(findTestObject('1.2. Add Energy Advisor page/Alternate Address checkbox'))

'Click on create account button'
WebUI.click(findTestObject('1.2. Add Energy Advisor page/Create Account button'))

'Wait for header Energy Advisors'
WebUI.waitForElementPresent(findTestObject('1.1. Energy Advisors listing page/Header Energy Advisors '), 0)

'Get email of energy advisor'
def object2 = WebUI.getText(findTestObject('1.1. Energy Advisors listing page/First record email ID'))

'Compare text'
WebUI.verifyMatch(object1, object2, false)

WebUI.closeBrowser()

