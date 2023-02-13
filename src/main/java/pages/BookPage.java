package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookPage extends BasePage{
    @FindBy(xpath = "//form[@class='search-bar-input']//input[1]")
    public WebElement searchBox;
    @FindBy(className = "search-bar-submit")
    public WebElement searchButton;
    @FindBy(xpath = "(//span[@class='bookcover']//img)[2]")
    public WebElement publishYear;
    @FindBy(xpath = "(//span[@class='bookauthor']//a)[2]")
    public WebElement authorName;
}
