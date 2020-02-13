import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://auth.passport.io/signup?client_id=fasterpay')

WebDriver driver = DriverFactory.getWebDriver()

WebUI.delay(3)

//JavascriptExecutor js = (JavascriptExecutor) driver


//js.executeScript(("document.querySelector(\"[for=\'agree-privacy\']\").click();"))
//js.executeScript(("document.querySelector(\"[for=\'agree-privacy\']\").click();"))
WebUI.executeJavaScript('document.querySelector(\"[for=\'agree-privacy\']\").click();',null)

//WebElement label = driver.findElement(By.cssSelector("[for='agree-privacy']"));
//new Actions(driver).moveToElement(driver.findElement(By.className("checkbox__label")), 1, 1).click().perform();

//Actions action = new Actions(driver);
//action.moveToElement(driver.findElement(By.cssSelector("[for='agree-privacy']"))).click().perform();

//WebUI.click(findTestObject('dropdown/checkbox_FP'))

