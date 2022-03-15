package Utilities;

import PageObject.CartPage;
import PageObject.mainPage;
import PageObject.productsPage;
import PageObject.resultPage;
import org.openqa.selenium.support.PageFactory;

import static Utilities.base.*;

public class managePages
{
    public static void init ()
    {
        swaglabsMain = PageFactory.initElements(driver, mainPage.class);
        swaglabResult = PageFactory.initElements(driver, resultPage.class);
        productsPageMain = PageFactory.initElements(driver, productsPage.class);
        cartPageMain = PageFactory.initElements(driver, CartPage.class);
    }
}
