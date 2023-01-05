package steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import setups.Capabilities;

public class BuyProductTest extends Capabilities {
    @Before({"@StartScenario"})
    public void setup() throws Exception {
        preparation();
    }

    @Given("^I am in Products Page$")
    public void i_am_in_Products_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementById("com.saucelabs.mydemoapp.android:id/productTV");
            System.out.println("In Products Page");
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @Then("^I should see the list of the products$")
    public void i_should_see_the_list_of_the_products() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Container for fragments\"]/android.view.ViewGroup");
            System.out.println("List of Product");
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @When("^I click on the backpack product$")
    public void i_click_on_the_backpack_product() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementByXPath("//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]/android.view.ViewGroup[1]/android.widget.TextView[1]");
            System.out.println("Found Backpack Product");
            androidDriver.findElementByAccessibilityId("Sauce Lab Back Packs").click();
            System.out.println("Click Backpack Product");
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @When("^I choose color blue$")
    public void i_choose_color_blue() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementByAccessibilityId("Blue color").click();
            System.out.println("Choose Blue color");
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @When("^I click plus to make qty into (\\d+)$")
    public void i_click_plus_to_make_qty_into(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Add to cart\").instance(0))");
            System.out.println("Scroll down");
            try{
                androidDriver.findElementByAccessibilityId("Increase item quantity").click();
                System.out.println("Add the qty");
            } catch (NoSuchElementException e) {
                System.out.println("An Exception Occurred: " + e);
            }
        }
        catch (NoSuchElementException e) {
            System.out.println("An Exception Occurred: " + e);
        }
    }

    @When("^I click Add to cart")
    public void i_click_add_to_cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementByAccessibilityId("Tap to add product to cart").click();
            System.out.println("Add item to the cart");
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @When("^I click my cart$")
    public void i_click_my_cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementById("com.saucelabs.mydemoapp.android:id/cartIV").click();
            System.out.println("Click My Cart");
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @Then("^I should see my order in my cart$")
    public void i_should_see_my_order_in_my_cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementById("com.saucelabs.mydemoapp.android:id/infoCL");
            System.out.println("Item in cart list");
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @When("^I click Proceed To Checkout$")
    public void i_click_Proceed_To_Checkout() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementByAccessibilityId("Confirms products for checkout").click();
            System.out.println("Click Proceed to checkout");
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @When("^I put username \"([^\"]*)\"$")
    public void i_put_username(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementById("com.saucelabs.mydemoapp.android:id/nameET").sendKeys(arg1);
            System.out.println("Input username");
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @When("^I put password \"([^\"]*)\"$")
    public void i_put_password(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementById("com.saucelabs.mydemoapp.android:id/passwordET").sendKeys(arg1);
            System.out.println("Input password");
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @When("^I click Login$")
    public void i_click_Login() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementByAccessibilityId("Tap to login with given credentials").click();
            System.out.println("Click login");
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @Then("^I should be redirected to Shipping Address Page$")
    public void i_should_be_redirected_to_shipping_address_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementById("com.saucelabs.mydemoapp.android:id/enterShippingAddressTV");
            System.out.println("Shipping Address Page");
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @When("^I enter the shipping address$")
    public void i_enter_the_shipping_address() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementById("com.saucelabs.mydemoapp.android:id/fullNameET").sendKeys("SpongeBob");
            System.out.println("Input fullname");
            androidDriver.findElementById("com.saucelabs.mydemoapp.android:id/address1ET").sendKeys("Pineapple Hut");
            System.out.println("Input address");
            androidDriver.findElementById("com.saucelabs.mydemoapp.android:id/cityET").sendKeys("Bikini Bottom");
            System.out.println("Input city");
            androidDriver.findElementById("com.saucelabs.mydemoapp.android:id/stateET").sendKeys("Sea");
            System.out.println("Input state");
            androidDriver.findElementById("com.saucelabs.mydemoapp.android:id/zipET").sendKeys("12345");
            System.out.println("Input zipcode");
            androidDriver.findElementById("com.saucelabs.mydemoapp.android:id/countryET").sendKeys("SEA");
            System.out.println("Input country");
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @When("^I click To Payment$")
    public void i_click_To_Payment() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"To Payment\").instance(0))").click();
            System.out.println("Click To Payment");
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @Then("^I should be redirected to Payment Info Page$")
    public void i_should_be_redirected_to_payment_info_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementById("com.saucelabs.mydemoapp.android:id/enterPaymentMethodTV");
            System.out.println("Payment Info Page");
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @When("^I enter the payment card info$")
    public void i_enter_the_payment_card_info() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementById("com.saucelabs.mydemoapp.android:id/nameET").sendKeys("SpongeBob Squarepant");
            System.out.println("Input fullname");
            androidDriver.findElementById("com.saucelabs.mydemoapp.android:id/cardNumberET").sendKeys("1234432112344321");
            System.out.println("Input card number");
            androidDriver.findElementById("com.saucelabs.mydemoapp.android:id/expirationDateET").sendKeys("0324");
            System.out.println("Input expired date");
            androidDriver.findElementById("com.saucelabs.mydemoapp.android:id/securityCodeET").sendKeys("123");
            System.out.println("Input security code");
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @When("^I click Review Order$")
    public void i_click_Review_Order() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementByAccessibilityId("Saves payment info and launches screen to review checkout data").click();
            System.out.println("Click Review order");
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @Then("^I should see the checkout info page$")
    public void i_should_see_the_checkout_info_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"© 2021 Sauce Labs All Rights Reserved. Terms of Service | Privacy Policy\").instance(0))").click();
            System.out.println("Checkout info page");
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @When("^I click Place Order$")
    public void i_click_Place_Order() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementByAccessibilityId("Completes the process of checkout").click();
            System.out.println("Click Place Order");
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void i_should_see(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            androidDriver.findElementById("com.saucelabs.mydemoapp.android:id/completeTV");
            System.out.println("See " + arg1);
        } catch (NoSuchElementException e){
            System.out.println("An Exception Occurred: " + e);
        };
    }

    @After({"@StartScenario"})
    public void stop(){
        stopServer();
    }
}