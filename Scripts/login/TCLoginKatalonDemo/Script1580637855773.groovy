import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.stringtemplate.v4.compiler.STParser.namedArg_return as namedArg_return
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('demoKatalon/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.waitForElementVisible(findTestObject('demoKatalon/Page_CURA Healthcare Service/input_Username_username'), 5)

//WebUI.setText(findTestObject('Object Repository/LoginPages/txt_name'), GlobalVariable.name_d)
WebUI.setText(findTestObject('demoKatalon/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setText(findTestObject('demoKatalon/Page_CURA Healthcare Service/input_Password_password'), 'ThisIsNotAPassword')

WebUI.delay(1)

WebUI.click(findTestObject('demoKatalon/Page_CURA Healthcare Service/button_Login'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('demoKatalon/Page_CURA Healthcare Service/lbl_txt'))


WebUI.selectOptionByIndex(findTestObject('demoKatalon/Page_CURA Healthcare Service/dropdown'), '0-1')

