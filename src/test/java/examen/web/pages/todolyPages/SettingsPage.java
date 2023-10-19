package examen.web.pages.todolyPages;

import examen.web.controls.Button;
import examen.web.controls.TextBox;
import org.openqa.selenium.By;

public class SettingsPage {
    public TextBox fullNameInput = new TextBox(By.id("FullNameInput"));
    public Button accountStgsBtn = new Button(By.xpath("//a[text()='Account']"));
    public Button deleteAccountBtn = new Button(By.id("DeleteAccountBtn"));
    public TextBox oldPwdTxtBox = new TextBox(By.xpath("//input[@id='TextPwOld']"));

    public TextBox newPwdTxtBox = new TextBox(By.xpath("//input[@id='TextPwNew']"));

    public Button saveButton = new Button(By.xpath("//button//span[text()='Ok']"));
    //despues un enter
    public Button okButton = new Button(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']"));
}