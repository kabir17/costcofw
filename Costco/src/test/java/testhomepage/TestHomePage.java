package testhomepage;

import homepage.LogInPage;
import homepage.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class TestHomePage {

    WebDriver driver;
    String baseUrl = "https://www.costco.com/";

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.com","C:\\Framework\\COSTCO\\Costco\\src\\main\\java\\utility\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    SignUpPage signUpPage;
    LogInPage logInPage;

    public void accessSignUp(){
        this.signUpPage= PageFactory.initElements(driver,SignUpPage.class);
    }
    public void accessLogIn(){
        this.logInPage=PageFactory.initElements(driver,LogInPage.class);
    }
    public void toLogIn(){
        accessLogIn();
        signUpPage.signUp("kajol11377@yahoo.com","kajolcostco123");
    }

    public void
//    public void logIn(){
//        accessTwitterLogIn();
//        twitterLoginPage.twitterLogIn("kajol11377@yahoo.com","roushan5151");
//    }
//    @Test //test login method
//    public void testLogIn(){
//        logIn();
//    }
//
//    @Test //Only One search test method
//    public void testSearchPage(){
//        logIn();
//        accessSearchPage();
//        searchPage.search("Trump"); //search is method from SearchPage class
//    }
//    @Test //test multiple search from list
//    public void testSearchFromList(){
//        logIn();  // need to first login
//        accessSearchPage();  // calling Pagefactory method
//        searchPage.searchFromList();  //searchPage =SearchPage class object,
//    }
//
//    @Test(dataProvider ="logInFunctionality",dataProviderClass = DataSource.class)
//    public void testLogInFunctionalityUsingDataProvider(String name,String password){
//        accessTwitterLogIn();
//        twitterLoginPage.twitterLogIn(name,password);
//    }
//
//    @AfterMethod
//    public void cleanUp(){
//        driver.close();
//    } //close = after running close only this page
//}

}
