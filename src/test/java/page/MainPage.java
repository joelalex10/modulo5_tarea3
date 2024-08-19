package page;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {
    public Button accountButton = new Button(By.xpath("//button[@id='navbarAccount']"));
    public Button loginButton = new Button(By.xpath("//button[@id='navbarLoginButton']"));
}
