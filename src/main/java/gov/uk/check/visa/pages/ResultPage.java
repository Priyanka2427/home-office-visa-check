package gov.uk.check.visa.pages;

import gov.uk.check.visa.browserfactory.ManageBrowser;
import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ManageBrowser.class);


    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement resultMessage;


    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement heathCareVisaText;


    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You may need a visa']")
    WebElement needVisaMessage;



    public String getResultMessage() {
        log.info("get result message");
        return getTextFromElement(resultMessage);
    }

    public String confirmResultMessage() {
        log.info("confirm result message");
        return getTextFromElement(heathCareVisaText);
    }

    public String getResultMessage1() {
        log.info("confirm result message1");
        return getTextFromElement(needVisaMessage);
    }
}
