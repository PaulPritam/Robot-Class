//Robot class to handle upload by keyboard
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileHandlingRobot {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritam Paul\\Downloads\\demo1\\RobotClassOperations" +
                "\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        Robot robot = new Robot();


        driver.get("https://www.monsterindia.com/seeker/registration");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='browse-text']")).click();
        Thread.sleep(2000);

        StringSelection selection = new StringSelection("C:\\Users\\Pritam Paul\\Downloads\\demo1\\" +
                "RobotClassOperations\\src\\Fileoperations\\newup.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
        robot.delay(2000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(1000);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
