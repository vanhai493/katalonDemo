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

WebUI.openBrowser('http://demo.guru99.com/V4/index.php')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(3)

//WebUI.setText(findTestObject('Object Repository/LoginPages/txt_name'), GlobalVariable.name_d)
WebUI.setText(findTestObject('Object Repository/LoginPages/txt_name'), usernameValue)

WebUI.setText(findTestObject('Object Repository/LoginPages/txt_password'), GlobalVariable.pass_d)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/LoginPages/btn_login'))

WebUI.delay(2)

/*
//verify text contain ID mà mình login vào
String containerID = WebUI.getText(findTestObject('Object Repository/LoginPages/lbl_id'))

println(containerID)


WebUI.verifyEqual(containerID.contains(usernameValue), true)

*/
WebUI.verifyElementVisible(findTestObject('Object Repository/LoginPages/lbl_welcome'))

WebUI.closeBrowser()