package pages;

import org.openqa.selenium.By;
import utils.Utils;

public class Homepage extends Utils {


    public void clickOnSignInTab(){
        driverClickOnElement(By.id("idcta-username"));
    }
}
