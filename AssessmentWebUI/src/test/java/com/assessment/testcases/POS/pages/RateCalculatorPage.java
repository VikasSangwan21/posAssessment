package com.assessment.testcases.POS.pages;

import com.assessment.constants.FrameworkConstants;
import com.assessment.testcases.POS.BasePage;
import com.assessment.helpers.ExcelHelpers;

import static com.assessment.keywords.WebUI.*;


import org.openqa.selenium.By;

public class RateCalculatorPage extends BasePage {

    //Navigation Bar
    private By fromPostCodeTextBox  = By.xpath("(//input[@placeholder='Postcode'])[1]");
    private By toCountryDD  = By.xpath("//input[@placeholder='Select country']");
    private By firstCountryDD  = By.xpath("//small[1]");
    private By toPostCodeTextBox   = By.xpath("(//input[@placeholder='Postcode (optional)'])");
    private By itemWeightTextBox   = By.xpath("(//input[@formcontrolname='itemWeight'])");
    private By submitButton   = By.xpath("//a[@type=' button']");
    private By quotesList   = By.tagName("dl");
    private By quotesHeader   = By.xpath("//h1[text()='Your Quote']");

    public void calculateRateAndVerifyQuotes() {
        openWebsite(FrameworkConstants.URL_POS);
        // From country is not a textbox on the website
        setText(fromPostCodeTextBox, excelHelpers.getCellData(1, "fromPostCode"));
        clearText(toCountryDD);
        setText(toCountryDD, excelHelpers.getCellData(1, "toCountry"));
        sleep(1);
        clickElement(firstCountryDD);
        setText(itemWeightTextBox, excelHelpers.getCellData(1, "weight"));
        clickElement(submitButton);
        scrollToPageBottom();
        verifyElementVisible(quotesHeader);
        verifyMultipleElementsAreDisplayed(quotesList);
    }

    

}


