package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GeneralElements {
    public GeneralElements(WebDriver chrome){
        PageFactory.initElements(chrome, this);
    }

    @FindBy(xpath = "//input[@name='enter_login']")
    WebElement loginInput;//ok
    @FindBy(xpath = "//input[@name='enter_pass']")
    WebElement passInput;//ok
    @FindBy(xpath = "//input[@type='submit']")
    WebElement submit;//ok
    //Log In elements end here

    @FindBy(xpath = "//a[@href='/main.php?anketa=1']")
    WebElement anketa;
    @FindBy(xpath = "//input[@name='name']")
    WebElement r_name;
    //
    @FindBy(xpath = "//select[@name='DD']")
    WebElement day_select;
    @FindBy(xpath = "//select[@name='DD']//option[@value='31']")
    WebElement des_day;
    @FindBy(xpath = "//select[@name='MM']")
    WebElement month_select;
    @FindBy(xpath = "//select[@name='MM']//option[@value='02']")
    WebElement des_month;
    @FindBy(xpath = "//select[@name='YYYY']")
    WebElement year_select;
    @FindBy(xpath = "//select[@name='YYYY']//option[@value='1920']")
    WebElement des_year;
    //
    @FindBy(xpath = "//input[@name='city']")
    WebElement city1;
    @FindBy(xpath = "//input[@name='city2']")
    WebElement city2;
    //
    @FindBy(xpath = "//input[@name='icq']")
    WebElement icq;
    @FindBy(xpath = "//input[@name='deviz']")
    WebElement phrase;
    //
    @FindBy(xpath = "//input[@name='saveanketa']")
    WebElement save_anketa;
    //Anketa elements end here

    @FindBy(xpath = "//a[@href='/main.php?zayvka=1']")
    WebElement poyedinki;//ok
    @FindBy(xpath = "//a[@href='main.php?zayvka=1&r=5&rnd=1']")
    WebElement chaos;//ok

    public void sleep() throws InterruptedException {
        Thread.sleep(8000);
    }//doesn't let low-speed internet fail the test

    public void insert_login(){
        loginInput.click();
        loginInput.sendKeys("dude_test");
    }

    public void insert_password(){
        passInput.click();
        passInput.sendKeys("tester");
    }

    public void submit() throws InterruptedException {
        submit.click();
        sleep();
    }//log in functions end here

    public void v_anketu() throws InterruptedException {
        anketa.click();
        sleep();
    }

    public void real_name() {
        r_name.click();
        r_name.sendKeys("Daniel Grace");
    }

    public void choose_day() {
        day_select.click();
        des_day.click();
    }

    public void choose_month() {
        month_select.click();
        des_month.click();
    }

    public void choose_year() {
        year_select.click();
        des_year.click();
    }

    public void e_city1(){
        city1.click();
        city1.sendKeys("Chinatown");
    }

    public void e_city2(){
        city2.click();
        city2.sendKeys("Rivia");
    }

    public void e_icq() {
        icq.click();
        icq.sendKeys("160, как у Стивена Хокинга");
    }

    public void e_phrase() {
        phrase.click();
        phrase.sendKeys("Victory will be mine!");
    }

    public void ssAve() {
        save_anketa.click();
    }//Anketa stuff ends here.

    public void v_poyedinki() throws InterruptedException {
        poyedinki.click();
        sleep();
    }

    public void enter_chaos() throws InterruptedException {
        chaos.click();
        sleep();
    }

    public void quit(WebDriver chrome){
        chrome.quit();
    }
}
