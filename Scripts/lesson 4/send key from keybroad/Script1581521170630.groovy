import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('demoKatalon/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.waitForElementVisible(findTestObject('demoKatalon/Page_CURA Healthcare Service/input_Username_username'), 5)

//WebUI.setText(findTestObject('Object Repository/LoginPages/txt_name'), GlobalVariable.name_d)
WebUI.setText(findTestObject('demoKatalon/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

//WebUI.sendKeys(findTestObject('Object Repository/demoKatalon/Page_CURA Healthcare Service/input_Username_username'), Keys.TAB)
WebUI.sendKeys(findTestObject('demoKatalon/Page_CURA Healthcare Service/input_Username_username'), Keys.chord(Keys.TAB))

WebUI.closeBrowser()