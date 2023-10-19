package examen.web;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import examen.web.pages.todolyPages.*;
import examen.web.session.Session;

public class testBaseTodoly {

    protected LoginSection loginSection = new LoginSection();
    protected MainPage mainPage = new MainPage();
    protected MenuSection menuSection = new MenuSection();
    protected SettingsPage settingsPage = new SettingsPage();
    protected signupPopup signupPopup = new signupPopup();

    @BeforeEach
    public void openBroswer() {
        Session.getInstance().goTo("https://todo.ly/");
    }

    @AfterEach
    public void closeBroswer() {

        Session.getInstance().closeSession();

    }
}