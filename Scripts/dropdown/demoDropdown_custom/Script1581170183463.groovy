import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://the-internet.herokuapp.com/')

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Object Repository/dropdown/btnDropdown'), 5)

CustomKeywords.'custom.clickLinkText.clickLink'('Dropdown')

//WebUI.click(findTestObject('Object Repository/dropdown/btnDropdown'))

WebUI.verifyElementText(findTestObject('dropdown/titlePage'), 'Dropdown List')

WebUI.selectOptionByValue(findTestObject('Object Repository/dropdown/chooseValue'), '1', false)

WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/dropdown/chooseValue'), 'Option 1', false, 5)

WebUI.closeBrowser()



