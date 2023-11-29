package compra_realizada.pages;

import org.openqa.selenium.By;

public class ShoppingCartPage {

    private By btn_proceed_to_checkout = By.xpath("//button[@data-role='proceed-to-checkout']");

    public By getBtn_proceed_to_checkout(){
        return btn_proceed_to_checkout;
    }
}
