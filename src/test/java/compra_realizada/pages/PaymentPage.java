package compra_realizada.pages;

import org.openqa.selenium.By;

public class PaymentPage {

    private By btn_placeOrder = By.xpath("//button[@title='Place Order']");
    private By inpt_check = By.id("billing-address-same-as-shipping-checkmo");

    public By getBtn_placeOrder() {
        return btn_placeOrder;
    }

    public By getInpt_check() {
        return inpt_check;
    }
}
