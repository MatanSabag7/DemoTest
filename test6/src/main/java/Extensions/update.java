package Extensions;

import Utilities.commonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.fail;

public class update extends commonOps
{
    public static void text (WebElement elem, String value)
    {
        try
        {
            elem.sendKeys(value);
            System.out.println("Text Field Updated Successfully");
        }
        catch (Exception e)
        {
            System.out.println("Failed to Update Text Field on Element, See details:" + e);
            fail ("Error with finding test, see details : " + e);
        }
    }

    public static void dropDownText (WebElement elem, String value)
    {
        try
        {
            Select myValue = new Select(elem);
            myValue.deselectByVisibleText(value);
            System.out.println("Text dropDown Updated Successfully");
        }
        catch (Exception e)
        {
            System.out.println("Failed to Update dropDown Field on Element, See details:" + e);
            fail("field to update text field");
        }
    }

}

