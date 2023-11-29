package compra_realizada.services;

import compra_realizada.DriverActions;
import compra_realizada.pages.HomePages;

public class HomePageService {

    private HomePages homePages;

    public HomePageService(){
        this.homePages = new HomePages();
    }

    public void seleccionarPrenda(){
        DriverActions.click(this.homePages.getLink_prenda());
    }
}
