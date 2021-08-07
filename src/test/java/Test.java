import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test {


    @org.testng.annotations.Test
    public void baseTest(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://rozetka.com.ua/");

        TestRealization realization = new TestRealization(webDriver);

//        realization.webElement.click();

//        realization.webElement1.click();
//
//        realization.webElement2.click();
//
//        realization.webElement3.sendKeys("xiaomi");
//        realization.webElement4.click();
//        realization.webElement5.click();

        realization.webElement6.click();
        realization.webElement7.click();

    }
}
