//Robot class to handle download by keyboard
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.KeyEvent;

public class HandleDwonload {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritam Paul\\Downloads\\demo1\\RobotClassOperations" +
                "\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.automationtesting.in/FileDownload.html");
        Thread.sleep(2000);

        Robot robot = new Robot();

        for (int i = 0; i < 13; i++) {
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_TAB);
        }

        robot.delay(1000);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.delay(1000);

        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_T);
        robot.delay(2000);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_T);
        robot.delay(1000);

        driver.findElement(By.xpath("//button[@id='createTxt']")).click();
        Thread.sleep(1000);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);

        robot.delay(1000);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_ENTER);

        driver.close();
    }
}
