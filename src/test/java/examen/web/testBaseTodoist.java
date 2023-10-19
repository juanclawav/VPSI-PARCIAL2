package examen.web;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import examen.web.pages.todoistPages.*;
import examen.web.session.Session;
public class testBaseTodoist {

    protected MainPage mainTodoistPage = new MainPage();
    protected LoginPage loginPage = new LoginPage();
    protected Workspace workspace = new Workspace();
    protected registerPage registerPage = new registerPage();
    protected AddProjectPopup addProjectPopup = new AddProjectPopup();

    protected SettingsOverlay settingsOverlay = new SettingsOverlay();

    protected examen.web.pages.todoistPages.changePasswordSection changePasswordSection = new changePasswordSection();



    @BeforeEach
    public void openBroswer() {
        Session.getInstance().goTo("https://todoist.com/");
    }

    @AfterEach
    public void closeBroswer() {

        Session.getInstance().closeSession();

    }

}
