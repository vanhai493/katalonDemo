import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('http://the-internet.herokuapp.com/')

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Object Repository/dropdown/btnDropdown'), 5)

WebUI.click(findTestObject('Object Repository/dropdown/btnDropdown'))

WebUI.verifyElementText(findTestObject('dropdown/titlePage'), 'Dropdown List')

//WebUI.selectOptionByValue(findTestObject('Object Repository/dropdown/chooseValue'), '1', false)

//WebUI.selectOptionByLabel(findTestObject('Object Repository/dropdown/chooseValue'), 'Option 2', false)

WebUI.selectOptionByIndex(findTestObject('Object Repository/dropdown/chooseValue'), '1,2')


WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/dropdown/chooseValue'), 'Option 1', false, 5)

//WebUI.closeBrowser()