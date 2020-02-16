import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://auth.passport.io/signup?client_id=fasterpay')

WebDriver driver = DriverFactory.getWebDriver()

WebUI.delay(3)

JavascriptExecutor js = ((driver) as JavascriptExecutor)

js.executeScript('document.querySelector("[for=\'agree-privacy\']").click();')

//js.executeScript(("document.querySelector(\"[for=\'agree-privacy\']\").click();"))
WebUI.executeJavaScript('document.querySelector("[for=\'agree-privacy\']").click();',null)