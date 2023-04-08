package steps;



import org.openqa.selenium.By;
//import org.openqa.selenium.support.PageFactory;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import pages.TecfiosClickPage;
import pages.TestBase;

public class TechFiosStepDefintion extends TestBase {
	//TecfiosClickPage tecfiosClickPage;
	
	@Before
	public void BeforeRun() {
		initDriver();
	
		
	
	}
	
	 
	 @Given("Set SkyBlue Background button exists")
		public void Set_SkyBlue_Background_button_exists() {
		 
		 driver.get("https://techfios.com/test/107/");
	 }
	 
	 @When("I click on the button")
		public void I_click_on_button() throws InterruptedException {
		 //tecfiosClickPage = PageFactory.initElements(driver, TecfiosClickPage.class);
		 //tecfiosClickPage.ClickOnButton();
		 Thread.sleep(3000);
       }
		
	 
	 @Then ("the background color will change to sky blue")
		public void The_background_color_will_change_to_sky_blue() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]")).click();
		 Thread.sleep(3000);
	 
	 }

       
	 @Given("Set SkyWhite Background button exists")
		public void set_SkyWhite_Background_button_exists() {
		 driver.get("https://techfios.com/test/107/");
		}

		@When("I click on the button;")
		public void i_click_on_the_button() throws InterruptedException {

			 driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]")).click();
					 Thread.sleep(3000);

		}
		

		@Then("the background color will change to white")
		public void the_background_color_will_change_to_white() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"extra\"]/button[2]")).click();
			 Thread.sleep(3000); 
		}


		
	 
	 
	 
	 
	 
	   @After
       public void TearDown() {
    	   driver.close();
    	   driver.quit();
    	   
    	   
       }













}
