package testSuite;

import org.junit.jupiter.api.*;
import page.LoginPage;
import page.MainPage;
import page.MenuSection;
import session.Session;


public class LoginTest {

    MenuSection menuSection = new MenuSection();
    LoginPage loginSection = new LoginPage();
    MainPage mainPage = new MainPage();

    @BeforeEach
    public void openBrowser(){
        Session.getSession().getBrowser().get("http://demo.owasp-juice.shop/");
    }

    @Order(1)
    @Test
    public void loginTest() throws InterruptedException {
        mainPage.accountButton.click();
        mainPage.loginButton.click();
        loginSection.emailTxtBox.setText("jquispe3600@gmail.com");
        loginSection.passwordTxtBox.setText("Abc.123");
        loginSection.loginButton.click();
        Assertions.assertTrue(menuSection.basketButton.isControlDisplayed());
    }

    @AfterEach
    public void closeBrowser(){
        Session.getSession().closeSession();

    }
}
