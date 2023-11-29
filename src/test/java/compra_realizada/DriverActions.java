package compra_realizada;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class DriverActions {

    public static void click(By element){
        DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.elementToBeClickable(element),
                        ExpectedConditions.visibilityOfElementLocated(element)
                )
        );
        DriverManager.getDriver().findElement(element).click();
    }

    public static void insertText(By element, String text){
        DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.visibilityOfElementLocated(element)
                )
        );
        DriverManager.getDriver().findElement(element).clear();
        DriverManager.getDriver().findElement(element).sendKeys(text);
    }

    public static void selectByVisibleText(By element, String option){
        DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.visibilityOfElementLocated(element)
                )
        );
        Select select = new Select(DriverManager.getDriver().findElement(element));
        select.selectByVisibleText(option);
    }

    public static String getText(By element){
        DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.visibilityOfElementLocated(element)
                )
        );
        return DriverManager.getDriver().findElement(element).getText();
    }

    public static Boolean isEnabled(By element) {
        return DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.visibilityOfElementLocated(element),
                        ExpectedConditions.elementToBeClickable(element)
                )
        );
    }

    public static Boolean isDisplayed(By element) {
        return DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.visibilityOfElementLocated(element),
                        ExpectedConditions.elementToBeClickable(element)
                )
        );
    }

    public static Boolean isSelected(By element) {
        return DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.visibilityOfElementLocated(element),
                        ExpectedConditions.elementToBeSelected(element)
                )
        );
    }
}

