package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.LibraryMainPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import static org.junit.Assert.assertEquals;
public class LibraryStepDefs {
    @Given("user goes to the OpenLibrary page")
    public void user_goes_to_the_OpenLibrary_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        String expectedUrl = ConfigurationReader.get("url");
        String actualUrl = Driver.get().getCurrentUrl();
        assertEquals(expectedUrl,actualUrl);
    }
    @Given("user sets website in English")
    public void user_sets_website_in_English()  {
        LibraryMainPage libraryMainPage = new LibraryMainPage();
        libraryMainPage.changeLanguage.click();
        libraryMainPage.englishIdioma.click();
        Assert.assertTrue(libraryMainPage.lang.getAttribute("lang").equals("en"));
    }
    }

