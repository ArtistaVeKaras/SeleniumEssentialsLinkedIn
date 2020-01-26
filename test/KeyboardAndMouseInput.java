import driver.util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAndMouseInput {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = util.getDriver();
        fillInForm();
        autoComplete();
        scroolToElement();
    }

    //Open the browser and fill in the form (Task 1)
    public static void fillInForm() throws InterruptedException {
        WebElement first_name = driver.findElement(By.id("name"));
        first_name.click();
        first_name.sendKeys("Claudio");
        WebElement button = driver.findElement(By.id("button"));
        button.click();
        Thread.sleep(1000);
    }

    //Open browser and perform a autocomplete (Task 2)
    public static void autoComplete() throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("87 Oxford Street, London, UK");
        Thread.sleep(1000);
        WebElement autoCompleteResult = driver.findElement(By.className("pac-item"));
        autoCompleteResult.click();
    }

    //Scroll to element on the page (Task 3)
    public static void scroolToElement() throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/scroll");
        //Actions will scroll the to the botton of the page and click on the name field
        //This is because the name element is located at the botton!
        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Claudio Correia");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2020");
        Thread.sleep(1000);
    }


}
