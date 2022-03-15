package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage
{
    @FindBy(how = How.XPATH, using = "//a[@class='shopping_cart_link']")
    public WebElement go_to_cart;



}
