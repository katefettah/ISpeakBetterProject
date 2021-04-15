package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class ElementUtil extends Driver{
    public static int DEFAULT_TIMEOUT = 20;
    WebDriver driver;
    static WebDriverWait wait;
    JavaScriptUtil javaScriptUtil;
    Properties prop;

    public  ElementUtil(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        javaScriptUtil = new JavaScriptUtil(driver);
    }


    public boolean waitForTitlePresent(String title) {
        wait.until(ExpectedConditions.titleIs(title));
        return true;
    }


    public static boolean waitForElementPresent(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return true;
    }
    public static boolean waitForElementPresent(WebElement locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated((By) locator));
        return true;
    }

    public boolean waitForElementVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return true;
    }

    public String doGetPageTitle() {

        try {
            return driver.getTitle();
        } catch (Exception e) {
            System.out.println("some exception got occured while getting the title...");
        }
        return null;
    }


    public static WebElement getElement( By locator) {

        WebElement element = null;

        try {
            if(waitForElementPresent(locator));
            element = getDriver().findElement(locator);


        } catch (Exception e) {
            System.out.println("some exception got occured while creating the web element");
        }
        return element;
    }
    public static WebElement getElement(WebElement locator) {

        WebElement element = null;

        try {
            if(waitForElementPresent(locator));
            element = getDriver().findElement((By) locator);


        } catch (Exception e) {
            System.out.println("some exception got occured while creating the web element");
        }
        return element;
    }
    /**
     * This method is used to click the webelement on the basis of by locator
     * @param locator
     */
    public void doClick(By locator) {

        try {
            getElement(locator).click();
        } catch (Exception e) {
            System.out.println("some exception got occured while clicking the web element");
        }
    }
    public static void doClick(WebElement locator) {

        try {
            getElement(locator).click();
        } catch (Exception e) {
            System.out.println("some exception got occured while clicking the web element");
        }
    }

    /**
     * This method is used to send value in a field
     * @param locator
     * @param value
     */
    public void doSendKeys(By locator, String value) {

        try {
            WebElement element = getElement(locator);
            element.clear();
            element.sendKeys(value);

        } catch (Exception e) {
            System.out.println("some exception got occured while entering values in a field");
        }
    }

    /**
     * isDisplayed
     * @param locator
     * @return
     */
    public boolean doIsDisplayed(By locator) {

        try {
            return getElement(locator).isDisplayed();
        } catch (Exception e) {
            System.out.println("some exception got occured isDisplayed method");
        }
        return false;
    }

    /**
     * isEnabled
     * @param locator
     * @return
     */
    public boolean doIsEnabled(By locator) {

        try {
            return getElement(locator).isEnabled();
        } catch (Exception e) {
            System.out.println("some exception got occured isEnabled method");
        }
        return false;
    }

    /**
     * isSelected
     * @param locator
     * @return
     */
    public boolean doIsSelected(By locator) {

        try {
            return getElement(locator).isSelected();
        } catch (Exception e) {
            System.out.println("some exception got occured isSelected method");
        }
        return false;
    }
    public static WebElement waitforvisibility(WebElement element,int timetowaitinsec){

        WebDriverWait wait=new WebDriverWait(getDriver(),timetowaitinsec);
       return wait.until(ExpectedConditions.visibilityOf(element));

    }


    /**
     * GetText()
     * @param locator
     * @return
     */
    public String doGetText(By locator) {

        try {
            return getElement(locator).getText();
        } catch (Exception e) {
            System.out.println("some exception got occured while getting text...");
        }
        return null;


    }

//    public void selectOption(By locator, String value){
//        WebElement element=getElement(locator);
//        Select select=new Select(element);
//        select.selectByVisibleText(value);
//    }

}
