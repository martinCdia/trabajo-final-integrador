package compra_realizada.services;

import compra_realizada.DriverActions;
import compra_realizada.pages.CheckoutPage;

public class CheckoutPageService {

    private CheckoutPage checkoutPage;

    public CheckoutPageService(){
        this.checkoutPage = new CheckoutPage();
    }

    public void formularioDireccionEnvio(
            String userName, String firstName, String lastName, String street, String city, String country,
            String region, String postalCode, String telephone){
        DriverActions.insertText(this.checkoutPage.getTxt_userName(), userName);
        DriverActions.insertText(this.checkoutPage.getTxt_firstName(), firstName);
        DriverActions.insertText(this.checkoutPage.getTxt_lastName(), lastName);
        DriverActions.insertText(this.checkoutPage.getTxt_street(), street);
        DriverActions.insertText(this.checkoutPage.getTxt_city(), city);
        DriverActions.selectByVisibleText(this.checkoutPage.getSlct_country(), country);
        DriverActions.selectByVisibleText(this.checkoutPage.getTxt_region(), region);
        DriverActions.insertText(this.checkoutPage.getTxt_postalCode(), postalCode);
        DriverActions.insertText(this.checkoutPage.getTxt_telephone(), telephone);
        DriverActions.click(this.checkoutPage.getOpt_shippingMethods());
        DriverActions.click(this.checkoutPage.getBtn_next());

    }
}
