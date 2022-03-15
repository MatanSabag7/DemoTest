package WorkFlow;

import Extensions.Click;
import Utilities.commonOps;

public class Add_Items extends commonOps
{
    public static void  addToCart()
    {
        Click.go(productsPageMain.labs_backpack);
        Click.go(productsPageMain.labs_bike_light);
        Click.go(productsPageMain.bolt_t_shirt);
        Click.go(productsPageMain.fleece_jacket);
        Click.go(productsPageMain.labs_onesie);
        Click.go(productsPageMain.t_shirt_red);
    }

    public static void GoToCart()
    {
        Click.go(cartPageMain.go_to_cart);
        Click.go(swaglabResult.FullCaret);
    }

}