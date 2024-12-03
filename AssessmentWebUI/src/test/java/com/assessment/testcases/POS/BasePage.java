package com.assessment.testcases.POS;

import com.assessment.helpers.ExcelHelpers;
import com.assessment.testcases.POS.pages.RateCalculatorPage;

public class BasePage {

    private RateCalculatorPage rateCalculatorPage;
    public ExcelHelpers excelHelpers = new ExcelHelpers();
    

    public RateCalculatorPage getRateCalculatorPage() { 
        if (rateCalculatorPage == null) {
            rateCalculatorPage = new RateCalculatorPage();
        }
        return rateCalculatorPage;
    }

  

}
