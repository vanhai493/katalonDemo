import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Input username and password on authentication dialog.'
WebUI.openBrowser('http://the-internet.herokuapp.com')

'get current driver'
WebDriver driver = DriverFactory.getWebDriver()

println(driver)

'get all element to  list webelement '
List<WebElement> lits = driver.findElements(By.xpath('//li/a'))

println(lits.size())

'using for var - with type of element'

//for ( WebElement element in lits) {
//	println element.getText()
//}
'using for loop with int ->> get text of element inxdex i'
for (int i = 0; i < lits.size(); i++) {
    println(lits.get(i).getText())
}

WebUI.closeBrowser()