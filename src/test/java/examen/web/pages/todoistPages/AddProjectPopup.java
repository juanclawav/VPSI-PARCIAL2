package examen.web.pages.todoistPages;

import org.openqa.selenium.By;
import examen.web.controls.Button;
import examen.web.controls.TextBox;

public class AddProjectPopup {
    public TextBox projectNameTb = new TextBox(By.xpath("//input[@id='edit_project_modal_field_name']"));
    public Button submitBtn = new Button(By.xpath("//button[@type='submit']"));

}
