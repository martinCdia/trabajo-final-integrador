package compra_realizada;

import compra_realizada.services.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CompraPrendaTest {

    @BeforeMethod
    public void setup(){
        DriverManager.create("chrome");
        DriverManager.goSite("https://magento.softwaretestingboard.com/");
    }

    @Test
    public void compraRealizada(){
        HomePageService homePageService = new HomePageService();
        homePageService.seleccionarPrenda();

        RadiantTeeService radiantTeeService = new RadiantTeeService();
        radiantTeeService.configurarOpcionesPrenda("2");

        ShoppingCartService shoppingCartService = new ShoppingCartService();
        shoppingCartService.procederCompra();

        CheckoutPageService checkoutPageService = new CheckoutPageService();
        checkoutPageService.formularioDireccionEnvio(
                "martin.2023@gmail.com", "Martin", "Forissi", "Humberto Primo 1454",
                "Concordia", "United States", "Florida", "32000", "3454567890"
        );

        PaymentPageService paymentPageService = new PaymentPageService();
        paymentPageService.checkFacturacion();
        paymentPageService.pagar();

        SuccessPageService successPageService = new SuccessPageService();
        successPageService.carritoVisible();

        //El título es igual a “Thank you for your purchase!”
        Assert.assertEquals(
                successPageService.getIgual_titulo(),
                "Thank you for your purchase!",
                "El titulo no es igual a Thank you for your purchase!"
        );

        //El botón “Continue Shopping” está habilitado.
        Assert.assertTrue(
                successPageService.botonContinueHabilitado(),
                "El boton Continue Shopping no esta habilitado"
        );

        //El botón “Create an Account” está visible.
        Assert.assertTrue(
                successPageService.createAccountVisible(),
                "El boton Create an Account no esta visible!"
        );

        //El número de la orden (Your order # is:) es un número.
        Assert.assertTrue(
                successPageService.esNumero(),
                "El numero de la orden No es un numero"
        );

        successPageService.continuar();

    }

}
