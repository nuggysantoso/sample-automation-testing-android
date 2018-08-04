package page;

import io.appium.java_client.AppiumDriver;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by Nuggy Santoso on 8/4/2018
 */
public class CalculatorHomePage extends AbstractPage {
    public CalculatorHomePage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    private String buttonEquals = "eq";
    private String buttonPoint = "dec_point";
    private String buttonZero = "//android.widget.Button[@text='0']";
    private String buttonOne = "//android.widget.Button[@text='1']";
    private String buttonTwo = "digit_2";
    private String buttonThree = "digit_3";
    private String buttonFour = "digit_4";
    private String buttonFive = "digit_5";
    private String buttonSix = "digit_6";
    private String buttonSeven = "digit_7";
    private String buttonEight = "digit_8";
    private String buttonNine = "digit_9";
    private String buttonDelete = "del";
    private String buttonDivide = "op_div";
    private String buttonMultiply = "op_mul";
    private String buttonSubstract = "op_sub";
    private String buttonAdd = "op_add";
    private String textViewFormula = "formula";
    private String textViewResult = "result";
    private String viewAdvanced = "pad_advanced";
    private String result = "";

    public void setResult(String result){
        this.result = result;
    }

    public String getResult(){
        return this.result;
    }

    public void checkCalculatorHomePageIsDisplayed(){
        waitForPresenceOfElementById(buttonEquals);
    }

    public void clickButtonEquals(){
        clickElement(getElementById(buttonEquals));
    }

    public void clickButtonPoint(){
        clickElement(getElementById(buttonPoint));
    }

    public void clickButtonZero(){
        clickElement(getElementByXpath(buttonZero));
    }

    public void clickButtonOne(){
        clickElement(getElementByXpath(buttonOne));
    }

    public void clickButtonTwo(){
        clickElement(getElementById(buttonTwo));
    }

    public void clickButtonThree(){
        clickElement(getElementById(buttonThree));
    }

    public void clickButtonFour(){
        clickElement(getElementById(buttonFour));
    }

    public void clickButtonFive(){
        clickElement(getElementById(buttonFive));
    }

    public void clickButtonSix(){
        clickElement(getElementById(buttonSix));
    }

    public void clickButtonSeven(){
        clickElement(getElementById(buttonSeven));
    }

    public void clickButtonEight(){
        clickElement(getElementById(buttonEight));
    }

    public void clickButtonNine(){
        clickElement(getElementById(buttonNine));
    }

    public void clickButtonDelete(){
        clickElement(getElementById(buttonDelete));
    }

    public void clickButtonDivide(){
        clickElement(getElementById(buttonDivide));
    }

    public void clickButtonMultiply(){
        clickElement(getElementById(buttonMultiply));
    }

    public void clickButtonSubstract(){
        clickElement(getElementById(buttonSubstract));
    }

    public void clickButtonAdd(){
        clickElement(getElementById(buttonAdd));
    }

    public void openViewAdvanced(){
        dragElement(getElementById(viewAdvanced), getElementById(buttonSeven));
    }

    public void checkResultIsCorrect(){
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");
        try {
            setResult(scriptEngine.eval(getTextOrValueElement(getElementById(textViewFormula))).toString());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        assertTextElementIsEquals(getElementById(textViewResult), getResult());
    }

    public void checkFormulaIsCorrectAfterPressEquals(){
        assertTextElementIsEquals(getElementById(textViewFormula), getResult());
    }
}
