package com.ourvirtual.pages;

import com.ourvirtual.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductsPage extends BasePage{
    public String productText;
    public String productLine;
    public void chooseProduct(String line){
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("window.scrollBy(0,350)", "");

        WebElement element = Driver.get().findElement(By.xpath("(//div[@class='right-block'])[" + line + "]"));
        Actions actions=new Actions(Driver.get());
        actions.moveToElement(element).perform();
        productText= element.getText();
        productLine=line;
        System.out.println("productText = " + productText);
        System.out.println("productLine = " + productLine);
    }
    public void validateAddToCardIcon(){
        WebElement element = Driver.get().findElement(By.xpath("(//span[.='Add to Cart']/ancestor::button)["+productLine+"]"));
        Assert.assertTrue(element.isDisplayed());
    }
    public void addToCard(){
        WebElement element = Driver.get().findElement(By.xpath("(//span[.='Add to Cart']/ancestor::button)["+productLine+"]"));
        element.click();
    }
}
