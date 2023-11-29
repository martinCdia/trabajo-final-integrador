package compra_realizada.pages;

import org.openqa.selenium.By;

public class SuccessPage {

    private By txt_titulo = By.xpath("//h1[@class='page-title']");
    private By btn_continue = By.xpath("//span[normalize-space()='Continue Shopping']");
    private By btn_cart = By.xpath("//a[@class='action showcart']");
    private By txt_your_order = By.xpath("//div[@class='page-wrapper']//p[1]");
    private By btn_create_an_account = By.xpath("//a[@class='action primary']");

    public By getTxt_titulo() {
        return txt_titulo;
    }

    public By getBtn_continue() {
        return btn_continue;
    }

    public By getBtn_cart() {
        return btn_cart;
    }

    public By getTxt_your_order() {
        return txt_your_order;
    }

    public By getBtn_create_an_account() {
        return btn_create_an_account;
    }
}
