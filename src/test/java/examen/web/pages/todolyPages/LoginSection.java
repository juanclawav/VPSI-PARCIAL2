package examen.web.pages.todolyPages;

import examen.web.controls.Button;
import examen.web.controls.TextBox;
import org.openqa.selenium.By;
import examen.web.controls.Toast;

public class LoginSection {
    public TextBox emailTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"));
    public TextBox pwdTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"));
    public Button loginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));
    public Toast errorToast = new Toast(By.id("HeaderMessageError"));
}
