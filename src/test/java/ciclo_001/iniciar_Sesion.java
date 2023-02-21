package ciclo_001;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class iniciar_Sesion {
WebDriver driver;
	
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
	}
	
	@Test
	public void Test_1() {
		String username = "standard_user";
        String password = "secret_sauce";

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));

        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        System.out.println("Cuantos elementos hemos encontrado?" + inputs);

        for(int i = 0; i < inputs.size(); i++){
            if (i==0){
                inputs.get(i).sendKeys(username);
            }else if(i == 1){
                inputs.get(i).sendKeys(password);
            } else{
                inputs.get(i).click();
            }
        }
        
        
        
		
	}
	
	@Test
	public void Test_2() {
		String username = "standard_user";
        String password = "secret_sauce";

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));

        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        System.out.println("Cuantos elementos hemos encontrado?" + inputs);

        for(int i = 0; i < inputs.size(); i++){
            if (i==0){
                inputs.get(i).sendKeys(username);
            }else if(i == 1){
                inputs.get(i).sendKeys(password);
            } else{
                inputs.get(i).click();
            }
        }
        
        
        
		
	}
	
	@Test
	public void Test_3() {
		String username = "standard_user";
        String password = "secret_sauce";

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));

        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        System.out.println("Cuantos elementos hemos encontrado?" + inputs);

        for(int i = 0; i < inputs.size(); i++){
            if (i==0){
                inputs.get(i).sendKeys(username);
            }else if(i == 1){
                inputs.get(i).sendKeys(password);
            } else{
                inputs.get(i).click();
            }
        }
        
        
        
		
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}

