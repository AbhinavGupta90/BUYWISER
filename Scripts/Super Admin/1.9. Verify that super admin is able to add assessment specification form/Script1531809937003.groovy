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

'Click on specification tab'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.3. Specification form/Specification tab'))

'Wait for house type drop down'
WebUI.waitForElementPresent(findTestObject('1.8. Add assessment house form/1.8.3. Specification form/House type drop down'), 
    0)

'Click on house type drop down'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.3. Specification form/House type drop down'))

'Select House type double semi-detached (double)'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.3. Specification form/House type Double Semi-Detached (Double)'))

'Click on the storey drop down'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.3. Specification form/Storey drop down'))

'Select storeys one and a half'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.3. Specification form/Storeys One and a half'))

'Click on front orientation drop down'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.3. Specification form/Front orientation drop down'))

'Select front orientation northeast'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.3. Specification form/Front orientation Northeast'))

'Click on year build drop down'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.3. Specification form/Year build drop down'))

'Select year build before 1920'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.3. Specification form/Year build before 1920'))

'Click on wall color drop down'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.3. Specification form/Wall color drop down'))

'Select wall color medium brown'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.3. Specification form/Wall color medium brown'))

'Enter above grade heated floor area'
WebUI.sendKeys(findTestObject('1.8. Add assessment house form/1.8.3. Specification form/Above grade'), '100')

'Enter below grade heated floor area'
WebUI.sendKeys(findTestObject('1.8. Add assessment house form/1.8.3. Specification form/Below grade'), '10')

WebUI.delay(3)

'Click on save and continue button'
WebUI.click(findTestObject('1.8. Add assessment house form/1.8.3. Specification form/input_submit-btn-new'))

