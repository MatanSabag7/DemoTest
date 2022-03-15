package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPage
{

    @FindBy(how = How.ID, using = "user-name")
    public WebElement InsertUserName;

    @FindBy (how = How.ID, using = "password")
    public WebElement InsertPassword;

    @FindBy (how = How.XPATH, using = "//input[@id='login-button']")
    public WebElement ClickLogin;

    @FindBy (how = How.ID, using = "react-burger-menu-btn")
    public WebElement ClickTougleMenu;

    @FindBy (how = How.ID, using = "logout_sidebar_link")
    public WebElement ClickLogOut;

    @FindBy (how = How.ID, using = "remove-sauce-labs-backpack")
    public WebElement remove_red_shirt;

    @FindBy (how = How.ID, using = "remove-sauce-labs-bike-light")
    public WebElement remover_red_Shirt_2;



    //@FindBy (how = How.XPATH, using = "//a[@class='btnDeposit show']//i[@class='btn btn-border theme-border btn-icon']//*[name()='svg']")
    // public WebElement ClickCurrency;

    // @FindBy (how = How.ID,using = "methods_wrapper")
    // public WebElement MethodFrame;

    //@FindBy (how = How.XPATH, using = "//iframe[@id='accframe']")
    //public WebElement ClickTypeMethod;









}
