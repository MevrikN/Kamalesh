package pages;

import org.openqa.selenium.WebDriver;

public class Page {

    private WebDriver driver = Driver.getDriver();


    public void getUrl(final String url) {
        driver.navigate().to(url);
    }

}
