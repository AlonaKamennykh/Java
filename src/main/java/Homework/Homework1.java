package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

/*
Написать программу, которая будет открывать четыри различных страниц в новых окнах:
https://zoo.kiev.ua/
https://zoo.kiev.ua/
https://taxi838.ua/ru/dnepr/
https://klopotenko.com/

        Прописать цикл, который будет переключаться поочередно через все страницы,
для каждой страницы выводить в консоль название и ссылку на эту страницу.
И будет закрывать ту страницу в названии которой есть слово зоопарк.
*/

public class Homework1 {
   /* public static void openLinkInNewTab(WebDriver driver, String url) throws InterruptedException {
        Set<String> set1=driver.getWindowHandles();

        ((JavascriptExecutor)driver).executeScript("window.open()");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        Set<String> set2=driver.getWindowHandles();

        System.out.println(driver.getWindowHandles());
        set2.removeAll(set1);

        String windowDescription2=set2.iterator().next();
        System.out.println(windowDescription2);
        driver.switchTo().window(windowDescription2);
        driver.get(url);
    }
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zoo.kiev.ua/");
        openLinkInNewTab(driver,"https://zoo.kiev.ua/");
        openLinkInNewTab(driver,"https://taxi838.ua/ru/dnepr/");
        openLinkInNewTab(driver,"https://klopotenko.com/");

        Set<String> windwHandles=driver.getWindowHandles();
        for (String windowId:windwHandles){
            driver.switchTo().window(windowId);
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
            String pageTitle=driver.getTitle();
            String woedToChek="зоопарк";
            if (pageTitle.contains(woedToChek)){
                driver.close();
            }
        }

    }*/


    /*
        2)
        Написать метод в параметры которого принимаются два ВебЭлемента.
        метод выводит в консоль информацию какой из двух элементов располагается выше на странице,
                какой из элементов располагается левее на странице,
        а также какой из элементов занимает большую площадь.
        Параметры метода могут также включать в себя другие аргументы, если это необходимо.*/
      /*  public static void compereWebElements(WebElement webElement1, WebElement webElement2){

             int a1=((webElement1.getSize().height)*(webElement1.getSize().width));
            int a2=((webElement2.getSize().height)*(webElement2.getSize().width));
            if (a1>a2){
                System.out.println("Первый елемент больше");
            }else {
                System.out.println("Второй елемент больше");
            }
            int b1=webElement1.getLocation().x;
            int b2=webElement2.getLocation().x;
            int c1=webElement1.getLocation().y;
            int c2=webElement2.getLocation().y;
            if (b1<b2){
                System.out.println("Первый елемент левее ");
            }else {
                System.out.println("Второй елемент левее ");
            }
            if (c1<c2){
                System.out.println("Первый елемент выше ");
            }else {
                System.out.println("Второй елемент выше ");
            }

        }

    public static void main(String[] args) {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zoo.kiev.ua/");
        WebElement webElement1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[1]/div/div/div[1]/a/span"));
        WebElement webElement2=driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div[1]/div[3]/ul/li[5]/a"));
        compereWebElements(webElement1,webElement2);
    }*/

       /* 3)
        Написать метод который выводит сообщение об айди элемента,
        значении тэга элемента , значении класса элемента,
        значении атрибута name элемента, текста данного элемента,
        а также о координатах центра контейнера данного элемента.*/
      /* public static void infoWebElement(WebElement webElement1){
           System.out.println("TagName: "+webElement1.getTagName());
           System.out.println("Text: "+webElement1.getText());
           System.out.println("Class: "+webElement1.getClass());
           System.out.println("Id: "+webElement1.getAttribute("id"));
           System.out.println("Name: "+webElement1.getAttribute("name"));
           int centreX=webElement1.getLocation().x+webElement1.getSize().width/2;
           int centreY=webElement1.getLocation().y+webElement1.getSize().height/2;
           Point centre=new Point(centreX,centreY);
           System.out.println("Центр контейнера: "+centre);
       }

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zoo.kiev.ua/");
        WebElement webElement1=driver.findElement(By.xpath("/html/body/div[1]/div[3]"));
        infoWebElement(webElement1);
        Thread.sleep(2500);
        driver.quit();
       }*/
       /* 4)
        Написать программу, которая повторит действия на видео “HW_AUTOMATION_LESSON_3_UPDATE.mp4”.
        http://www.automationpractice.pl/index.php*/
       public static void main(String[] args) throws InterruptedException {

         WebDriverManager.chromedriver().clearDriverCache().setup();
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://www.automationpractice.pl/index.php");
         WebElement searchField=driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]"));

         searchField.sendKeys("Printed Chiffon Dress");

         WebElement searchButton=driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button"));
         searchButton.click();

         WebElement linkPrintedChiffonDress=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/h5/a"));
         linkPrintedChiffonDress.click();
         Thread.sleep(3000);
           new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[4]/div/div/div/div[4]/form/div/div[2]/div/fieldset[1]/div/div/select"))).selectByVisibleText("M");
           Thread.sleep(4000);
           WebElement addToCart1=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[4]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span"));
             addToCart1.click();

           Thread.sleep(4000);
           WebElement continueShopping=driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span/span"));

           continueShopping.click();

          Thread.sleep(4000);

         WebElement women=driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
         women.click();

         Thread.sleep(3000);

         /* searchField.sendKeys("Faded Short");*/
         driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]")).sendKeys("Faded Short");

           Thread.sleep(3000);
         /*searchButton.click();*/
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
         Thread.sleep(3000);

         WebElement linkFadedShort=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/h5/a"));
         linkFadedShort.click();
         Thread.sleep(3000);
         new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/div/fieldset[1]/div/div/select"))).selectByVisibleText("M");
         Thread.sleep(4000);

         WebElement addToCart2=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span"));
         addToCart2.click();
         Thread.sleep(4000);

         //continueShopping.click();
         driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span/span")).click();
         Thread.sleep(4000);

         WebElement cart=driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a/b"));
         cart.click();
         Thread.sleep(4000);

         driver.quit();
       }


}
