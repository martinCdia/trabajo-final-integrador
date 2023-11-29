package compra_realizada.pages;

import org.openqa.selenium.By;

public class HomePages {

    private By link_prenda = By.xpath("//a[normalize-space()='Radiant Tee']");

    public By getLink_prenda(){
        return link_prenda;
    }
}
