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

'Wait for "Client" in top navigation'
WebUI.waitForElementPresent(findTestObject('1.1. Energy Advisors listing page/Top navigation clients '), 0)

'Click on client'
WebUI.click(findTestObject('1.1. Energy Advisors listing page/Top navigation clients '))

'Wait for add new client link'
WebUI.waitForElementPresent(findTestObject('1.3. Client listing page/Add new client link'), 0)

'Click on add new client link'
WebUI.click(findTestObject('1.3. Client listing page/Add new client link'))

'Wait for header add new client'
WebUI.waitForElementPresent(findTestObject('1.4. Add Client page/Header add new client'), 0)

'Generate random business name and store in object1'
def object1 = CustomKeywords.'newPackage.TestDataGenerator.getRandomFirstName'()

'Enter business name'
WebUI.sendKeys(findTestObject('1.4. Add Client page/Business name'), object1)

'Enter business phone'
WebUI.sendKeys(findTestObject('1.4. Add Client page/Business phone'), '9876543210')

'Enter business email'
WebUI.sendKeys(findTestObject('1.4. Add Client page/Business email'), CustomKeywords.'newPackage.TestDataGenerator.getRandomEmail'())

'Enter business street'
WebUI.sendKeys(findTestObject('1.4. Add Client page/Business details street'), CustomKeywords.'newPackage.TestDataGenerator.getRandomCity'())

'Enter business city'
WebUI.sendKeys(findTestObject('1.4. Add Client page/Business details city'), CustomKeywords.'newPackage.TestDataGenerator.getRandomCity'())

'Enter business postal code'
WebUI.sendKeys(findTestObject('1.4. Add Client page/Business details postal code'), 'A1A 1A1')

'Enter business postal code'
WebUI.sendKeys(findTestObject('1.4. Add Client page/Business details postal code'), 'A1A 1A1')

'Enter contact person firstname'
WebUI.sendKeys(findTestObject('1.4. Add Client page/Contact person firstname'), CustomKeywords.'newPackage.TestDataGenerator.getRandomFirstName'())

'Enter contact person lastname'
WebUI.sendKeys(findTestObject('1.4. Add Client page/Contact person lastname'), CustomKeywords.'newPackage.TestDataGenerator.getRandomLastName'())

'Enter contact person email'
WebUI.sendKeys(findTestObject('1.4. Add Client page/Contact person email'), CustomKeywords.'newPackage.TestDataGenerator.getRandomEmail'())

'Enter contact person role'
WebUI.sendKeys(findTestObject('1.4. Add Client page/Contact person role'), CustomKeywords.'newPackage.TestDataGenerator.getRandomLastName'())

'Enter contact person phone number'
WebUI.sendKeys(findTestObject('1.4. Add Client page/Contact person phone number'), '9876543210')

'Enter contact person mobile'
WebUI.sendKeys(findTestObject('1.4. Add Client page/Contact person mobile'), '9876543210')

'Enter contact person ext'
WebUI.sendKeys(findTestObject('1.4. Add Client page/Contact person ext'), '12345')

'Enter evaluation property street'
WebUI.sendKeys(findTestObject('1.4. Add Client page/Evaluation property street'), CustomKeywords.'newPackage.TestDataGenerator.getRandomCity'())

'Enter evaluation property city'
WebUI.sendKeys(findTestObject('1.4. Add Client page/Evaluation property city'), CustomKeywords.'newPackage.TestDataGenerator.getRandomCity'())

'Enter evaluation property postal code'
WebUI.sendKeys(findTestObject('1.4. Add Client page/Evaluation property postal code'), 'A1A 1A1')

'Click on ownership drop-down'
WebUI.click(findTestObject('1.4. Add Client page/Evaluation property select ownership'), FailureHandling.CONTINUE_ON_FAILURE)

'Select dewlling private option'
WebUI.click(findTestObject('1.4. Add Client page/Evaluation property select dwelling private'), FailureHandling.CONTINUE_ON_FAILURE)

'Enter evaluation property builder name'
WebUI.sendKeys(findTestObject('1.4. Add Client page/Evaluation property builder name'), CustomKeywords.'newPackage.TestDataGenerator.getRandomFirstName'())

'Enter evaluation property tax roll'
WebUI.sendKeys(findTestObject('1.4. Add Client page/Evaluation property tax roll'), '12345')

'Click on add new client button'
WebUI.click(findTestObject('1.4. Add Client page/Add new client button'), FailureHandling.CONTINUE_ON_FAILURE)

'Wait for add new client link'
WebUI.waitForElementPresent(findTestObject('1.3. Client listing page/Add new client link'), 0)

'Get name of client'
def object2 = WebUI.getText(findTestObject('1.3. Client listing page/First record name'))

'Compare text'
WebUI.verifyMatch(object1, object2, false)

WebUI.delay(10)

WebUI.closeBrowser()

