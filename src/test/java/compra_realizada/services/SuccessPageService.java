package compra_realizada.services;

import compra_realizada.DriverActions;
import compra_realizada.pages.SuccessPage;
import org.apache.commons.lang3.StringUtils;

public class SuccessPageService {

    private SuccessPage successPage;

    public SuccessPageService(){
        this.successPage = new SuccessPage();
    }

    public void continuar(){
        DriverActions.click(this.successPage.getBtn_continue());
    }

    public void carritoVisible(){
        DriverActions.isDisplayed(this.successPage.getBtn_cart());
    }

    public Boolean botonContinueHabilitado(){
        return DriverActions.isEnabled(this.successPage.getBtn_continue());
    }

    public Boolean esNumero(){
        String order = DriverActions.getText(this.successPage.getTxt_your_order());
        String[] parts = order.split(": ");
        String numero = parts[1].substring(0, parts[1].length() - 1); // Elimina el ultimo caracter de la cadena (.)
        return StringUtils.isNumeric(numero); // Retorna True si la cadena es un numero
    }

    public Boolean createAccountVisible(){
        return DriverActions.isDisplayed(this.successPage.getBtn_create_an_account());
    }

    public String getIgual_titulo(){
        return DriverActions.getText(this.successPage.getTxt_titulo());
    }

}
