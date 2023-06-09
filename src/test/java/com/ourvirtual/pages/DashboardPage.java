package com.ourvirtual.pages;

import com.ourvirtual.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage{

    public String productTextInTheBasket;
    @FindBy(xpath = "//span[@class='icon-c']")
    public WebElement basketIcon;
    public void selectTab(String tab){
        Driver.get().findElement(By.xpath("(//a[contains(.,'"+tab+"')])[1]")).click();
    }
    public void hoverTheBasket(){
        Actions actions=new Actions(Driver.get());
        actions.moveToElement(basketIcon).perform();
    }
    public void CheckTheBasket(){
        List<WebElement> elements = Driver.get().findElements(By.xpath(""));

    }
    public void validateTheProductIsInTheBasket(){
        WebElement element = Driver.get().findElement(By.xpath("(//td[@class='text-left'])[1]"));
        productTextInTheBasket= element.getText();
        System.out.println("productTextInTheBasket = " + productTextInTheBasket);
    }

}
