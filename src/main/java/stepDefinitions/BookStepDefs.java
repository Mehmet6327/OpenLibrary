package stepDefinitions;

import api.GetMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.BookPage;
import utilities.Driver;
public class BookStepDefs {

    BookPage bookPage = new BookPage();
    String authorNameFromApi;
    String authorNameOnBook;
    @When("user searches for {string}")
    public void user_searches_for(String expectedBook)  {
        bookPage.searchBox.sendKeys(expectedBook);
        bookPage.searchButton.click();
    }
    @When("user chooses book published in {string}")
    public void user_chooses_book_published_in(String string)  {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].scrollIntoView();", bookPage.publishYear);
        authorNameOnBook = bookPage.authorName.getText();
        bookPage.publishYear.click();
    }
    @And("get author from API with Endpoint {string}")
    public void getAuthorFromAPIWithEndpoint(String endPoint) {
        GetMethod get = new GetMethod();
        authorNameFromApi = get.getAuthorName(endPoint);
    }
    @Then("author from API matches author on book page")
    public void authorFromAPIMatchesAuthorOnBookPage()  {
        Assert.assertEquals(authorNameOnBook,authorNameFromApi);
    }
}
