package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LibraryMainPage extends BasePage {
    @FindBy(xpath = "//div[@class='language-component header-dropdown']//summary[1]")
    public WebElement changeLanguage;
    @FindBy(xpath = "(//ul[@class='locale-options dropdown-menu']//a)[3]")
    public WebElement englishIdioma;
    @FindBy(tagName = "html")
    public WebElement lang;
}
