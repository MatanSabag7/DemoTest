package WorkFlow;

import Extensions.Click;
import Extensions.update;
import Utilities.commonOps;
import com.google.common.base.Verify;

import java.awt.event.ActionListener;

public class Web_Login extends commonOps
{

    public static void go (String email, String validPassword)
    {
        update.text(swaglabsMain.InsertUserName,email);
        update.text(swaglabsMain.InsertPassword,validPassword);
        Click.go(swaglabsMain.ClickLogin);
    }

    public static void no (String email, String notValidPassword)
    {
        update.text(swaglabsMain.InsertUserName,email);
        update.text(swaglabResult.notValidLogin,notValidPassword);
        Click.go(swaglabsMain.ClickLogin);
    }

    public static void switchmail ()
    {
        Click.go(swaglabsMain.ClickTougleMenu);
        Click.go(swaglabsMain.ClickLogOut);
    }


    public static void removeitemfromcart ()
    {
        Click.go(swaglabsMain.remove_red_shirt);
        Click.go(swaglabsMain.remover_red_Shirt_2);
    }

}