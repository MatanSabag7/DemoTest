package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class productsPage
{
    @FindBy(how = How.XPATH, using = "//button[@id='add-to-cart-sauce-labs-backpack']")
    public WebElement labs_backpack;

    @FindBy (how = How.ID, using = "add-to-cart-sauce-labs-bike-light")
    public WebElement labs_bike_light;

    @FindBy (how = How.ID, using = "add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement bolt_t_shirt;

    @FindBy (how = How.ID, using = "add-to-cart-sauce-labs-fleece-jacket")
    public WebElement fleece_jacket;

    @FindBy (how = How.ID, using = "add-to-cart-sauce-labs-onesie")
    public WebElement labs_onesie;

    @FindBy (how = How.ID, using = "add-to-cart-test.allthethings()-t-shirt-(red)")
    public WebElement t_shirt_red;
}
