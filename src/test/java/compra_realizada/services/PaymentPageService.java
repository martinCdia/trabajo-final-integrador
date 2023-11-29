package compra_realizada.services;

import compra_realizada.DriverActions;
import compra_realizada.pages.PaymentPage;

public class PaymentPageService {

    private PaymentPage paymentPage;

    public PaymentPageService(){
        this.paymentPage = new PaymentPage();
    }

    public void pagar(){
        DriverActions.click(this.paymentPage.getBtn_placeOrder());
    }

    public void checkFacturacion(){
        DriverActions.isEnabled(paymentPage.getBtn_placeOrder());
        DriverActions.click(paymentPage.getInpt_check());
        DriverActions.isSelected(paymentPage.getInpt_check());
    }
}
