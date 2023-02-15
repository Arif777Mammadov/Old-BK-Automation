package Steps;

import Driver.Driver;
import Elements.GeneralElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class BK {

    protected WebDriver chrome = Driver.getDriver();


    @Given("Go to BK")
    public void go_to_bk(){
        chrome.get("https://oldbk2.com/");
    }

    GeneralElements page = new GeneralElements(chrome);

    @When("Fill login input")
    public void fill_login_input(){
        page.insert_login();
        //loginInput.sendKeys(Keys.ENTER);
    }

    @And("Fill password input")
    public void fill_password_input(){
        page.insert_password();
    }

    @Then("Press Enter button")
    public void press_enter_button() throws InterruptedException {
        page.submit();
    }//LOG IN

    @When("Go to anketa")
    public void go_to_anketa() throws InterruptedException {
        page.v_anketu();
    }

    @Then("Insert name")
    public void insert_name() {
        chrome.switchTo().frame(0);
        page.real_name();
    }

    @And("Choose birth day")
    public void choose_birth_day() {
        page.choose_day();
    }

    @And("Choose birth month")
    public void choose_birth_month() {
        page.choose_month();
    }

    @And("Choose birth year")
    public void choose_birth_year() {
        page.choose_year();
    }

    @When("Enter city")
    public void enter_city() {
        page.e_city1();
    }

    @Then("Enter another city")
    public void enter_another_city() {
        page.e_city2();
    }

    @When("Enter ICQ?")
    public void enter_ICQ() {
        page.e_icq();
    }

    @Then("Enter phrase")
    public void enter_phrase() {
        page.e_phrase();
    }

    @And("Save anketa")
    public void save_anketa() {
        page.ssAve();
    }
    //ANKETA

    @When("Go to poyedinki")
    public void go_to_poyedinki() throws InterruptedException {
        chrome.switchTo().parentFrame();
        page.v_poyedinki();
    }

    @Then("Enter chaos")
    public void enter_chaos() throws InterruptedException {
        chrome.switchTo().frame(0);
        page.enter_chaos();
        page.quit(chrome);
    }
}