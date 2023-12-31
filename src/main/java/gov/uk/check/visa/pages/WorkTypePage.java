package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickNextStepButton;

    public void selectJobType(String reason) {
        log.info("enter JobTitle " + reason);
        clickOnElement(By.xpath("//label[contains(text(),'" + reason + "')]"));
    }

    public void clickNextStepButton(){
        log.info("click Next StepButton " + clickNextStepButton.toString());
        clickOnElement(clickNextStepButton);
    }
}
