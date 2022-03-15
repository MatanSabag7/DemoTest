package Extensions;

import Utilities.commonOps;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.fail;

public class Click extends commonOps
{
    public static void go (WebElement elem)
    {
        try
        {
            elem.click();
            System.out.println("Element Click Successfully");
        }
        catch (Exception e)
        {
            System.out.println("Failed to Click on Element, See details:" + e);
            fail("field to Click on element field");
        }





    }
}
