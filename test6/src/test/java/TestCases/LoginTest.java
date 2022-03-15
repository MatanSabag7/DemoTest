package TestCases;

import Extensions.verify;
import Utilities.commonOps;
import Utilities.managePages;
import WorkFlow.Add_Items;
import WorkFlow.Web_Login;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends commonOps
{
    @BeforeClass
    public void startSession ()
    {
        System.setProperty("webdriver.chrome.driver","/Users/msabag/Documents/chromedriver");
        driver = new ChromeDriver();
        managePages.init();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);

    }
    @AfterClass

    public void closeSession()
    {
        driver.quit();
    }
    @BeforeTest
    public void BeforeTest () throws InterruptedException
    {
        Thread.sleep(1000);
    }
    @Test

    public void test01_Login_Faield ()
    {
        Web_Login.no("problem_user","123");
        swaglabsMain.InsertUserName.clear();
        swaglabsMain.InsertPassword.clear();
        Web_Login.no("problem_user","123");
        verify.textInElement(swaglabResult.ErrorLogin,"Epic sadface: Username and password do not match any user in this service");
        if (Web_Login.swaglabResult.notValidLogin.isDisplayed())
        {
            System.out.println("Email Or Password Not Valid");

        }
    }
    @Test
    public void Test02_LoginSuccecsfuly ()
    {
        Web_Login.go("problem_user","secret_sauce");
        Web_Login.switchmail();
        Web_Login.go("standard_user","secret_sauce");
        verify.textInElement(swaglabResult.ValidLogin,"PRODUCTS");
        if (Web_Login.swaglabResult.ValidLogin.isDisplayed())
        {
            System.out.println("login successfully");
        }

    }
    @Test
    public void Test03_Add_All_Item_To_Cart()
    {
        Web_Login.go("standard_user","secret_sauce");
        verify.textInElement(swaglabResult.ValidLogin,"PRODUCTS");
        Add_Items.addToCart();
        Add_Items.GoToCart();
        verify.textInElement(swaglabResult.FullCaret,"6");
        if (Web_Login.swaglabResult.FullCaret.isDisplayed())
        {
            System.out.println("All items Added successfully");
        }
        Web_Login.switchmail();

    }
    @Test
    public void Test04Add_all_item_to_cart_problem_user()
    {
        Web_Login.go("problem_user","secret_sauce");
        verify.textInElement(swaglabResult.ValidLogin,"PRODUCTS");
        Add_Items.addToCart();
        Add_Items.GoToCart();
        verify.textInElement(swaglabResult.FullCaret,"6");
        if (Web_Login.swaglabResult.FullCaret.isDisplayed())
        {
            System.out.println("All items Added successfully");
        }
    }
    @Test
    public void Test05Remove_2_Item_From_Cart()
    {
        Web_Login.go("standard_user","secret_sauce");
        verify.textInElement(swaglabResult.ValidLogin,"PRODUCTS");
        Add_Items.addToCart();
        Add_Items.GoToCart();
        verify.textInElement(swaglabResult.FullCaret,"6");
        if (Web_Login.swaglabResult.FullCaret.isDisplayed());
        {
            System.out.println("All items Added successfully");
        }
        Web_Login.removeitemfromcart();
        verify.textInElement(swaglabResult.ClearItemDFromCaret,"4");
        if (Web_Login.swaglabResult.ClearItemDFromCaret.isDisplayed())
        {
            System.out.println("2 item deleted from cart");
        }
        else
        {
            System.out.println("item was not delete");
        }
    }
    @Test
    public void Test_Problome_User_Remove_2_Item_From_Cart ()
    {
        Web_Login.go("problem_user","secret_sauce");
        Add_Items.addToCart();
        Add_Items.GoToCart();
        if (equals(swaglabResult.FullCaret.isDisplayed()))
        {
            System.out.println("item Add");
        }
        else
        {
            System.out.println("item not added");
        }


        Add_Items.GoToCart();
        verify.textInElement(swaglabResult.FullCaret,"6");
        if (equals(swaglabResult.FullCaret));
        {
            System.out.println("All items Added Succesfully");
        }
        Web_Login.removeitemfromcart();
        verify.textInElement(swaglabResult.ClearItemDFromCaret,"4");
    }

}

