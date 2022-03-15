package Extensions;

import Utilities.commonOps;
import org.openqa.selenium.WebElement;
import org.w3c.dom.Text;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class verify extends commonOps
{
    public static void textInElement (WebElement elem, String expectedValue)
    {
        try
        {
            assertEquals(elem.getText(),expectedValue);
            System.out.println("Text Found In Element");
        }
        catch (Exception e)
        {
            System.out.println("Error with finding text, see details" + e);
            fail ("Error With Finding Element");
        }
        catch (AssertionError e)
        {
            System.out.println("Text Not Found In Element, See details:" + e);
            fail ("Text NOT Found in Element");
        }
    }

}