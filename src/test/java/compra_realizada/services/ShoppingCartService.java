package compra_realizada.services;

import compra_realizada.DriverActions;
import compra_realizada.pages.ShoppingCartPage;

public class ShoppingCartService {

    private ShoppingCartPage shoppingCartPage;

    public ShoppingCartService(){
        this.shoppingCartPage = new ShoppingCartPage();
    }

    public void procederCompra(){
        DriverActions.click(this.shoppingCartPage.getBtn_proceed_to_checkout());
    }
}
