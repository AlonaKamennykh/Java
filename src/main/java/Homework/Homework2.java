package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;

public class Homework2 {
  /*
    1) http://only-testing-blog.blogspot.com/2014/01/textbox.html?
    Написать программу реализующую действие показанное на "видео1.mp4".
    После выполнения программы на консоли должна выводится информация в следующем виде:

    Автомобили доступные для выбора:
    Volvo, BMW, Opel, Audi, Toyota, Renault, Maruti Car.
    Страны из первой таблицы:
    USA, Russia, Japan, Mexico, India, Malaysia, Greece.
    Страны из второй таблицы:
    France, Germany, Italy, Spain.*/

   /* public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
        Thread.sleep(2000);
        Select car=new Select(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/select")));
        car.selectByVisibleText("Renault");
        Thread.sleep(2000);
        //!!!
        List<WebElement> carsList=car.getOptions();
        System.out.println("Автомобили доступные для выбора:");
        for (WebElement singlCar:carsList){
            System.out.print(singlCar.getText()+", ");

        }
        System.out.print("\b\b.");

       Select countryLeft=new Select((driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/form[2]/table/tbody/tr/td[1]/select"))));

        List<WebElement> countryLeftList=countryLeft.getOptions();
        System.out.println("\n"+"Страны из первой таблицы:");
        for (WebElement singlCountryLeft:countryLeftList){
            System.out.print(singlCountryLeft.getText()+", ");

        }
        System.out.print("\b\b.");

        countryLeft.selectByVisibleText("France");
        countryLeft.selectByVisibleText("India");
        Thread.sleep(2000);
        countryLeft.deselectByVisibleText("India");
        countryLeft.selectByVisibleText("Germany");
        countryLeft.selectByVisibleText("Italy");
        countryLeft.selectByVisibleText("Malaysia");
        Thread.sleep(2000);
        countryLeft.deselectByVisibleText("Malaysia");
        countryLeft.selectByVisibleText("Spain");
        Thread.sleep(2000);
        WebElement button=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/form[2]/table/tbody/tr/td[2]/input[1]"));
        button.click();
        Thread.sleep(2000);

        Select countryRight=new Select((driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/form[2]/table/tbody/tr/td[3]/select"))));

        List<WebElement> countryRightList= countryRight.getOptions();
        System.out.println("\n"+"Страны из второй таблицы:");
        for (WebElement singlCountryRight:countryRightList){
            System.out.print(singlCountryRight.getText()+", ");

        }
        System.out.print("\b\b.\n");
        Thread.sleep(2000);

        driver.quit();
    }*/


    /*2) https://demo.guru99.com/test/drag_drop.html
    Написать программу, которая будет автоматизировать сценарий показанный на видео “Сценарий для автоматизии.mov”.
    После выполнения сценария на видео вывести в консоль теуст кнопки “Perfect!”*/

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(2000);
        //cookie
        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[4]/iframe")));
        driver.findElement(By.xpath("/html/body/app-root/app-theme/div/div/app-notice/app-theme/div/div/app-home/div/div[2]/app-footer/div/div[2]/app-action-buttons/div/button[3]/span[1]/div/span")).click();
        driver.switchTo().defaultContent();
        //Thread.sleep(2500);
       // WebElement button5002=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[2]/a"));

        Thread.sleep(2500);

        WebElement button5002=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[2]/a"));
        WebElement button5004=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[4]/a"));
        WebElement bank=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[5]/a"));
        WebElement sales=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[6]/a"));
        WebElement fild1=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/div/ol/li"));
        WebElement fild2=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol"));
        WebElement fild3=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div/ol/li"));
        WebElement fild4=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/ol/li"));


        Actions actions = new Actions(driver);
        actions.clickAndHold(button5002)
                .moveToElement(fild2).release().build().perform();
        Thread.sleep(2500);
        actions.clickAndHold(button5004)
                .moveToElement(fild4).release().build().perform();

        Thread.sleep(2000);
        actions.clickAndHold(bank)
                .moveToElement(fild1).release().build().perform();

        Thread.sleep(2000);
        actions.clickAndHold(sales)
                .moveToElement(fild3).release().build().perform();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[5]/a")).getText());


        driver.quit();

    }

}
