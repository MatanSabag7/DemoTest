package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class resultPage
{
        @FindBy(how = How.ID, using = "password")
        public WebElement notValidLogin;

        @FindBy (how = How.XPATH, using = "//h3[contains(text(),'Epic sadface: Username and password do not match a')]")
        public WebElement ErrorLogin;

        @FindBy (how = How.XPATH, using = "//span[@class='title']")
        public WebElement ValidLogin;

        @FindBy (how = How.XPATH, using = "//span[@class='shopping_cart_badge']")
        public WebElement FullCaret;

        @FindBy(how = How.XPATH, using = "//span[@class='shopping_cart_badge']")
        public WebElement ClearItemDFromCaret;




        // @FindBy (how = How.ID, using = "password")
        //public WebElement InsertPassword;

        //@FindBy (how = How.ID, using = "login-button")
        // public WebElement ClickLogin;


}
