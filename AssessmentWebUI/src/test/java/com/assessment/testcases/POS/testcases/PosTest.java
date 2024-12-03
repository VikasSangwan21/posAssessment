package com.assessment.testcases.POS.testcases;

import com.assessment.common.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Epic("Regression Test CMS")
@Feature("Login Test")
public class PosTest extends BaseTest {
    
    @Test(priority = 1)
    public void Task1_Verify_Maximum_Items_Per_Page() {
        getRateCalculatorPage().calculateRateAndVerifyQuotes();
        
    }

}
