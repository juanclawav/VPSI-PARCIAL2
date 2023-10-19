package examen.web.pages.todolyPages;

import org.openqa.selenium.By;
import examen.web.controls.Button;
import examen.web.controls.CheckBox;
import examen.web.controls.TextBox;

public class signupPopup {
    public TextBox nameTb = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox emailTb = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox pwTb= new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public CheckBox termCb = new CheckBox(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    public Button signupBtn = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));

}
