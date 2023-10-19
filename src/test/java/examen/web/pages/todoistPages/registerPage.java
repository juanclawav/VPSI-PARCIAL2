package examen.web.pages.todoistPages;

import org.openqa.selenium.By;
import examen.web.controls.Button;
import examen.web.controls.TextBox;

public class registerPage {
    public TextBox emailTextBox = new TextBox(By.xpath("//input[@type='email']"));
    public TextBox pwTextBox = new TextBox(By.xpath("//input[@type='password']"));
    public Button registerBtn = new Button(By.xpath("//button[@type='submit']"));
    public TextBox accountNameTb = new TextBox(By.xpath("//div[@class='F7UYB8b _2a3b75a1']//input"));
    public Button submitNameBtn = new Button(By.xpath("//span[text()='Continue']/parent::button"));
    public Button markPersonalBtn = new Button(By.xpath("//button[@aria-label='Personal']"));
    public Button launchBtn = new Button(By.xpath("//button[@aria-label='Launch Todoist']"));


}
