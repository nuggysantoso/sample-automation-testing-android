import common.BaseAndroidTest;
import org.junit.Test;
import org.springframework.context.annotation.Description;
import page.CalculatorHomePage;

/**
 * Created by Nuggy Santoso on 8/4/2018
 */
public class CalculatorHomePageTest extends BaseAndroidTest {
    CalculatorHomePage calculatorHomePage;

    @Description("Test_01 : To Verify User Able To Calculate Two Number With Add Formula")
    @Test()
    public void Test_01(){
        calculatorHomePage = new CalculatorHomePage(getAppiumDriver());
        calculatorHomePage.checkCalculatorHomePageIsDisplayed();
        calculatorHomePage.clickButtonFive();
        calculatorHomePage.clickButtonAdd();
        calculatorHomePage.clickButtonFour();
        calculatorHomePage.checkResultIsCorrect();
        calculatorHomePage.clickButtonEquals();
        calculatorHomePage.checkResultStillCorrectAfterPressEquals();
    }

    @Description("Test_02 : To Verify User Able To Calculate Two Number With Substract Formula")
    @Test()
    public void Test_02(){
        calculatorHomePage = new CalculatorHomePage(getAppiumDriver());
        calculatorHomePage.checkCalculatorHomePageIsDisplayed();
        calculatorHomePage.clickButtonFive();
        calculatorHomePage.clickButtonSubstract();
        calculatorHomePage.clickButtonFour();
        calculatorHomePage.checkResultIsCorrect();
        calculatorHomePage.clickButtonEquals();
        calculatorHomePage.checkResultStillCorrectAfterPressEquals();
    }

    @Description("Test_03 : To Verify User Able To Calculate Two Number With Multiply Formula")
    @Test()
    public void Test_03(){
        calculatorHomePage = new CalculatorHomePage(getAppiumDriver());
        calculatorHomePage.checkCalculatorHomePageIsDisplayed();
        calculatorHomePage.clickButtonFive();
        calculatorHomePage.clickButtonMultiply();
        calculatorHomePage.clickButtonFour();
        calculatorHomePage.checkResultIsCorrect();
        calculatorHomePage.clickButtonEquals();
        calculatorHomePage.checkResultStillCorrectAfterPressEquals();
    }
}
