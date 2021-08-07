import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestRealization {

    @FindBy(xpath = "/html/body/app-root/div/div/rz-main-page/div/aside/main-page-sidebar/sidebar-fat-menu//a")
    WebElement webElement;

    @FindBy(xpath = "//a[@href='https://rozetka.com.ua/jobs/']")
    WebElement webElement1;

    @FindBy(xpath = "/html/body/app-root/div/div/rz-header/header/div/div/ul/li[1]/rz-lang/ul/li[2]/a")
    WebElement webElement2;

    @FindBy(xpath = "/html/body/app-root/div/div/rz-header/header/div/div/div/form/div/div/input")
    WebElement webElement3;

    @FindBy(className = "button_color_green")
    WebElement webElement4;

    @FindBy(className = "goods-tile__picture")
    WebElement webElement5;

    @FindBy(xpath = "html/body/app-root/div/div/rz-header/header/div/div/ul/li[1]/rz-lang/ul/li[2]/a")
    WebElement webElement6;

    @FindBy(className = "menu__toggle")
    WebElement webElement7;




    public TestRealization(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
}
