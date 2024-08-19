package page;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox emailTxtBox = new TextBox(By.xpath("//input[@id='email']"));
    public TextBox passwordTxtBox = new TextBox(By.xpath("//input[@id='password']"));
    public Button loginButton  = new Button(By.xpath("//button[@id='loginButton']"));

}
