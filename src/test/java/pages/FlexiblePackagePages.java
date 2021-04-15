package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FlexiblePackagePages {
   public FlexiblePackagePages(){
       PageFactory.initElements(Driver.getDriver(),this);

   }
    @FindBy(xpath = "(//span[@class='select2-selection__arrow'])[1]")
    public WebElement selectDurationArrow;

    @FindBy(xpath= "//li[@class='select2-results__option select2-results__option--highlighted']")
    public WebElement selectDuration;

    @FindBy(xpath = "(//span[@class='select2-selection__arrow'])[2]")
    public WebElement subscribedClassArrow;

    @FindBy(xpath = "//li[@id='select2-per_week_class_number-result-tijt-3']")
    public WebElement subscribedClass;

    @FindBy(xpath ="(//span[@class='select2-selection__arrow'])[3]")
    public WebElement ClassArrow;

    @FindBy(id="select2-per_week_class_number-result-kssk-2")
    public WebElement Class;

    @FindBy(xpath ="(//span[@class='select2-selection__arrow'])[3]")
    public WebElement ProgramArrow;

    @FindBy(id = "select2-course_program-result-n9zl-201")
    public WebElement typeProgram;

    @FindBy(xpath = "//span[@class='btn-icon']")
    public WebElement buyButton;

}
