package check;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class web {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.priceline.com/");
		
		driver.findElement(By.xpath(".//*[.//*[@id='search-products']/div/div[1]/button[1]")).click();
		driver.findElement(By.xpath(".//*[.//*[@id='search-products']/div/div[2]/div[1]/div/div/div[1]/div[1]/div[2]/div[1]/input")).sendKeys("Dallas, TX - Dallas/Fort Worth Intl Airport (DFW)");
        
		driver.findElement(By.xpath(".//*[.//*[@id='search-products']/div/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div[1]/div/div/input")).sendKeys("04/27/2017");
		driver.findElement(By.xpath(".//*[.//*[@id='search-products']/div/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/div[1]/div/div/input")).sendKeys("05/17/2017");
				driver.findElement(By.xpath(".//*[@id='flexdates']")).click();
		driver.findElement(By.xpath(".//*[.//*[@id='search-products']/div/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/div/select")).click();
		//driver.get("https://www.priceline.com/m/fly/search/DFW-SFO-20170427/SFO-DFW-20170517/?cabin-class=ECO&alt-dates=true&num-adults=1");
				driver.findElement(By.xpath("html/body/main/section[1]/div/fly-filters-component/div/fly-filters-stops/fly-mobile-checkbox[1]/div")).click();
			    driver.navigate().to("https://www.priceline.com/m/fly/search/DFW-SFO-20170427/SFO-DFW-20170517/?cabin-class=ECO&alt-dates=true&num-adults=1");
			    
			    /*driver.findElement(By.xpath("html/body/main/section[1]/div/fly-filters-component/div/fly-filters-stops/fly-mobile-checkbox[2]/div")).click();
			    driver.navigate().to("https://www.priceline.com/m/fly/search/DFW-SFO-20170428/SFO-DFW-20170517/?cabin-class=ECO&num-adults=1&num-of-stops=1");
			    
			    driver.findElement(By.xpath("html/body/main/section[1]/div/fly-filters-component/div/fly-filters-stops/fly-mobile-checkbox[3]/div")).click();
			    driver.navigate().to("https://www.priceline.com/m/fly/search/DFW-SFO-20170428/SFO-DFW-20170517/?cabin-class=ECO&num-adults=1");
			    */
		
		*/
	}

}
