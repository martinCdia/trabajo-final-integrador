package compra_realizada.pages;

import org.openqa.selenium.By;

public class RadiantTeePage {

    private By div_size = By.id("option-label-size-143-item-169");
    private By div_color = By.id("option-label-color-93-item-50");
    private By txt_qty = By.id("qty");
    private By btn_add_to_cart = By.id("product-addtocart-button");
    private By link_shopping_cart = By.xpath("//a[normalize-space()='shopping cart']");

    public By getDiv_size(){
        return div_size;
    }

    public By getDiv_color(){
        return div_color;
    }

    public By getTxt_qty(){
        return txt_qty;
    }

    public By getBtn_add_to_cart(){
        return btn_add_to_cart;
    }

    public By getLink_shopping_cart(){
        return link_shopping_cart;
    }
}
