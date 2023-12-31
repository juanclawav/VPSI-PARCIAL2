package examen.web.pages.todoistPages;

import examen.web.controls.Button;
import examen.web.controls.Label;
import org.openqa.selenium.By;
import examen.web.controls.TextBox;

public class Workspace {
    public Button profileButton = new Button(By.xpath("//button[@aria-label='Settings']"));

    public Button settingsButton = new Button(By.id("user_menu_settings_menuitem"));
    public Button addTaskBtn = new Button(By.xpath(("//li[@class='controller actions task_actions full_width_actions']//button")));
    public TextBox taskNameTextBox = new TextBox(By.xpath("//p[@data-placeholder='Task name']"));
    public TextBox taskDescTextBox = new TextBox(By.xpath("//p[@data-placeholder='Description']"));
    public Button addProjectBtn = new Button(By.xpath("//button[@aria-label='Add project']"));
    public Button addTaskInProjectViewBtn = new Button(By.xpath("//button[@class='plus_add_button']"));
    public Button logoutButton = new Button(By.xpath("//span[contains(text(), 'Log out')]/parent::button"));

    public Label checkNewProject(String xpath){
        return new Label(By.xpath("//span[text()='" + xpath + "'][last()]"));
    }
}