package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {
    public static String takeScreenshot(WebDriver driver, String testName){

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String filePath = "test-output/screenshots/" + testName + "_" + timestamp + ".png";
        try {
            FileUtils.copyFile(srcFile, new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filePath;

    }
}
