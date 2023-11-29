package compra_realizada.services;

import compra_realizada.DriverActions;
import compra_realizada.pages.RadiantTeePage;

public class RadiantTeeService {

    private RadiantTeePage radiantTeePages;

    public RadiantTeeService(){
        this.radiantTeePages = new RadiantTeePage();
    }

    public void configurarOpcionesPrenda(String cantidad){
        DriverActions.click(this.radiantTeePages.getDiv_size());
        DriverActions.click(this.radiantTeePages.getDiv_color());
        DriverActions.insertText(this.radiantTeePages.getTxt_qty(), cantidad);
        DriverActions.click(this.radiantTeePages.getBtn_add_to_cart());
        DriverActions.click(this.radiantTeePages.getLink_shopping_cart());
    }
}
