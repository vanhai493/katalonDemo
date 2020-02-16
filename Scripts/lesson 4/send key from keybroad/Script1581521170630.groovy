import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('http://demo.guru99.com/V4/index.php')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(3)

WebDriver driver = DriverFactory.getWebDriver()

//WebUI.setText(findTestObject('Object Repository/LoginPages/txt_name'), GlobalVariable.name_d)
WebUI.setText(findTestObject('Object Repository/LoginPages/txt_name'), 'hai123')

WebUI.delay(2)

driver.findElement(By.name('uid')).sendKeys(Keys.chord(Keys.COMMAND, "a"))

