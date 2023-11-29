package compra_realizada.pages;

import org.openqa.selenium.By;

public class CheckoutPage {
    private By txt_userName = By.id("customer-email");
    private By txt_firstName = By.name("firstname");
    private By txt_lastName = By.name("lastname");
    private By txt_street = By.name("street[0]");
    private By txt_city = By.name("city");
    private By slct_country = By.name("country_id");
    private By txt_region = By.name("region_id");
    private By txt_postalCode = By.name("postcode");
    private By txt_telephone = By.name("telephone");
    private By opt_shippingMethods = By.name("ko_unique_1");
    private By btn_next = By.xpath("//button[@class='button action continue primary']");

    public By getSlct_country(){
        return slct_country;
    }

    public By getTxt_region(){
        return txt_region;
    }

    public By getTxt_userName() {
        return txt_userName;
    }

    public By getTxt_firstName() {
        return txt_firstName;
    }

    public By getTxt_lastName() {
        return txt_lastName;
    }

    public By getTxt_street() {
        return txt_street;
    }

    public By getTxt_city() {
        return txt_city;
    }

    public By getTxt_postalCode() {
        return txt_postalCode;
    }

    public By getTxt_telephone() {
        return txt_telephone;
    }

    public By getOpt_shippingMethods() {
        return opt_shippingMethods;
    }

    public By getBtn_next() {
        return btn_next;
    }
}
