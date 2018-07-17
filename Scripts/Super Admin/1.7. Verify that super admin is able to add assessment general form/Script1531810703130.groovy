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
import org.openqa.selenium.Keys as Keys

'Call login test case'
WebUI.callTestCase(findTestCase('Super Admin/1.0. Verify that super admin is able to login with valid details'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Wait for "Assessments" in top navigation'
WebUI.waitForElementPresent(findTestObject('1.1. Energy Advisors listing page/Top navigation assessments'), 0)

'Click on assessments'
WebUI.click(findTestObject('1.1. Energy Advisors listing page/Top navigation assessments'))

'Wait for header assessment'
WebUI.waitForElementPresent(findTestObject('1.7. Assessment listing page/Header assessments'), 0)

'Click on add new property link'
WebUI.click(findTestObject('1.7. Assessment listing page/Add new assessment link'))

WebUI.waitForElementVisible(findTestObject('1.7. Assessment listing page/Add new property assessment button'), 0)

'Click on "New Property Assessment" button'
WebUI.click(findTestObject('1.7. Assessment listing page/Add new property assessment button'))

WebUI.delay(5)

'Iterate 10 times'
for (def index : (0..10)) {
    'Click + button to add ceiling'
    WebUI.click(findTestObject('1.7. Assessment listing page/Add button ceiling'))

    'Click + button to add main wall'
    WebUI.click(findTestObject('1.7. Assessment listing page/Add button main wall'))

    'Click + button to add basement'
    WebUI.click(findTestObject('1.7. Assessment listing page/Add button basement'))

    'Click + button to add exposed floor'
    WebUI.click(findTestObject('1.7. Assessment listing page/Add button exposed floor'))

    'Click + button to add header'
    WebUI.click(findTestObject('1.7. Assessment listing page/Add button header'))
}

'Iterate 15 times'
for (def index : (0..15)) {
    'Click + button to add door'
    WebUI.click(findTestObject('1.7. Assessment listing page/Add button door'))
}

'Iterate 50 times'
for (def index : (0..50)) {
    'Click + button to add window'
    WebUI.click(findTestObject('1.7. Assessment listing page/Add button window'))
}

'Click on start button'
WebUI.click(findTestObject('1.7. Assessment listing page/Start button'))

'Wait for general title'
WebUI.waitForElementPresent(findTestObject('1.8. Add assessment house form/1.8.1. General form/General title'), 0)

'Enter street'
WebUI.sendKeys(findTestObject('1.8. Add assessment house form/1.8.1. General form/Property street'), CustomKeywords.'newPackage.TestDataGenerator.getRandomCity'())

'Enter city'
WebUI.sendKeys(findTestObject('1.8. Add assessment house form/1.8.1. General form/Property city'), CustomKeywords.'newPackage.TestDataGenerator.getRandomCity'())

'Enter postal code'
WebUI.sendKeys(findTestObject('1.8. Add assessment house form/1.8.1. General form/Property postal code'), 'A1A1A1')

'Enter postal code'
WebUI.sendKeys(findTestObject('1.8. Add assessment house form/1.8.1. General form/Property postal code'), 'A1A1A1')

'Click on ownership drop down'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.1. General form/Select ownership'))

'Select ownership'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.1. General form/Select dwelling private'))

'Enter builder name'
WebUI.sendKeys(findTestObject('1.8. Add assessment house form/1.8.1. General form/Builder name'), CustomKeywords.'newPackage.TestDataGenerator.getRandomFirstName'())

'Enter property tax roll'
WebUI.sendKeys(findTestObject('1.8. Add assessment house form/1.8.1. General form/Property tax roll', [('variable') : 'a']), 
    CustomKeywords.'newPackage.TestDataGenerator.getRandomFirstName'())

'Enter file number'
WebUI.sendKeys(findTestObject('1.8. Add assessment house form/1.8.1. General form/File number'), CustomKeywords.'newPackage.TestDataGenerator.getRandomZip'())

'Enter client ID'
WebUI.sendKeys(findTestObject('1.8. Add assessment house form/1.8.1. General form/Client ID'), 'C1')

'Select client'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.1. General form/Select client ID'), FailureHandling.CONTINUE_ON_FAILURE)

'Click on evaluation date'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.1. General form/Evaluation date'))

'Select date'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.1. General form/Select date'))

'Click on Save and continue button'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.1. General form/Save and continue button'))

WebUI.waitForElementVisible(findTestObject('1.8. Add assessment house form/1.8.1. General form/Ok button'), 0)

WebUI.click(findTestObject('1.8. Add assessment house form/1.8.1. General form/Ok button'))

