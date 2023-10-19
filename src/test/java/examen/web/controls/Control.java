package examen.web.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import examen.web.session.Session;

public class Control {

    protected By locator;
    protected WebElement control;
    public Control(By locator){
        this.locator = locator;
    }
    public void getControl(){
        control = Session.getInstance().getBrowser().findElement(this.locator);
    }
    public void click(){
        getControl();
        this.control.click();
    }
    public String getTextValue(){
        this.getControl();
        return this.control.getText();
    }

    public boolean isControlDisplayed(){
        try{
        getControl();
        return control.isDisplayed();}
        catch(Exception e){
            return false;
        }
    }
}
