package ohtu;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Stepdefs {
    WebDriver driver = new ChromeDriver();
    String baseUrl = "http://localhost:4567";
    
    @Given("^login is selected$")
    public void login_selected() throws Throwable {
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.linkText("login"));       
        element.click();          
    } 
    
    @Given("^new user is selected$")
    public void new_user_is_selected() throws Throwable {
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.linkText("register new user"));       
        element.click();          
    } 
    
    @Given("^user with username \"([^\"]*)\" with password \"([^\"]*)\" is successfully created$")
    public void user_is_succesfully_created(String username, String password) throws Throwable {
        new_user_is_selected();
        valid_username_and_password_are_given(username, password);
    }
    
    @Given("^user with username \"([^\"]*)\" and password \"([^\"]*)\" is unsuccessfully created$")
    public void user_is_unsuccesfully_created(String username, String password) throws Throwable {
        new_user_is_selected();
        valid_username_and_password_are_given(username, password);
    }

    @When("^username \"([^\"]*)\" and password \"([^\"]*)\" are given$")
    public void username_and_password_are_given(String username, String password) throws Throwable {
        WebElement element = driver.findElement(By.name("username"));
        element.sendKeys(username);
        element = driver.findElement(By.name("password"));
        element.sendKeys(password);
        element = driver.findElement(By.name("login"));
        element.submit();  
    }
    
    @When("^valid username \"([^\"]*)\" and password \"([^\"]*)\" are given$")
    public void valid_username_and_password_are_given(String username, String password) throws Throwable {
        createUserWith(username, password);
    }
    
    @When("^valid username \"([^\"]*)\" and valid password \"([^\"]*)\" are given but confirmation \"([^\"]*)\" is different$")
    public void valid_username_and_valid_password_are_given_but_confirmation_is_different(String username, String password, String confirmation) throws Throwable {
        failUserCreationWith(username, password, confirmation);
    }
    
    @When("^valid but taken username \"([^\"]*)\" and valid password \"([^\"]*)\" are given$")
    public void valid_but_taken_username_and_valid_password_are_given(String username, String password) throws Throwable {
        createUserWith(username, password);
    }
    @When("^valid username \"([^\"]*)\" and invalid password \"([^\"]*)\" are given$")
    public void valid_username_and_invalid_password_are_given(String username, String password) throws Throwable {
        createUserWith(username, password);
    }
    
    @When("^invalid username \"([^\"]*)\" and valid password \"([^\"]*)\" are given$")
    public void invalid_username_and_valid_password_are_given(String username, String password) throws Throwable {
        createUserWith(username, password);
    }

    @Then("^system will respond \"([^\"]*)\"$")
    public void system_will_respond(String pageContent) throws Throwable {
        assertTrue(driver.getPageSource().contains(pageContent));
    }

    @When("^correct username \"([^\"]*)\" and password \"([^\"]*)\" are given$")
    public void username_correct_and_password_are_given(String username, String password) throws Throwable {
        logInWith(username, password);
    }
    
    @When("^nonexistent username \"([^\"]*)\" and nonexistent password \"([^\"]*)\" are given$")
    public void nonexistent_username_correct_and_password_are_given(String username, String password) throws Throwable {
        logInWith(username, password);
    }

    @When("^correct username \"([^\"]*)\" and incorrect password \"([^\"]*)\" are given$")
    public void username_and_incorrect_password_are_given(String username, String password) throws Throwable {
        logInWith(username, password);
    }
    
    @Then("^user is logged in$")
    public void user_is_logged_in() throws Throwable {
        pageHasContent("Ohtu Application main page");
    }
    
    @Then("^user is created and logged in to the app$")
    public void user_is_created_and_logged_in() throws Throwable {
        pageHasContent("Welcome to Ohtu Application!");
    }
    
    @Then("^user is not created and error \"([^\"]*)\" is reported$")
    public void user_is_not_created_and_error_is_reported(String errorMessage) throws Throwable {
        pageHasContent(errorMessage);
    }
    
    @Then("^user is not logged in and error message is given$")
    public void user_is_not_logged_in_and_error_message_is_given() throws Throwable {
        pageHasContent("invalid username or password");
        pageHasContent("Give your credentials to login");
    }   
    
    @Then("^nonexistent user is not logged in and error message is given$")
    public void nonexistent_user_is_not_logged_in_and_error_message_is_given() throws Throwable {
        pageHasContent("invalid username or password");
        pageHasContent("Give your credentials to login");
    }   
    
    @After
    public void tearDown(){
        driver.quit();
    }
        
    /* helper methods */
 
    private void pageHasContent(String content) {
        assertTrue(driver.getPageSource().contains(content));
    }
        
    private void logInWith(String username, String password) {
        assertTrue(driver.getPageSource().contains("Give your credentials to login"));
        WebElement element = driver.findElement(By.name("username"));
        element.sendKeys(username);
        element = driver.findElement(By.name("password"));
        element.sendKeys(password);
        element = driver.findElement(By.name("login"));
        element.submit();  
    } 
    
    private void createUserWith(String username, String password) {
        assertTrue(driver.getPageSource().contains("Create username and give password"));
        WebElement element = driver.findElement(By.name("username"));
        element.sendKeys(username);
        element = driver.findElement(By.name("password"));
        element.sendKeys(password);
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys(password);
        element = driver.findElement(By.name("signup"));
        element.submit();  
    }
    
    private void failUserCreationWith(String username, String password, String confirmation) {
        assertTrue(driver.getPageSource().contains("Create username and give password"));
        WebElement element = driver.findElement(By.name("username"));
        element.sendKeys(username);
        element = driver.findElement(By.name("password"));
        element.sendKeys(password);
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys(confirmation);
        element = driver.findElement(By.name("signup"));
        element.submit();  
    }
}
