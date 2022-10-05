package integration;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import ucb.koddy.report.ReportManager;
import ucb.koddy.testServices.utils.ScreenShot;

public class BaseTest {

    protected WebDriver webDriver;

    @BeforeSuite
    public static void setUpSuite() throws Exception {
        ReportManager.init("Reports", "LoginSite.html");
    }

    @BeforeMethod
    public void setUp(ITestResult iTestResult){
        ReportManager.getInstance().startTest(iTestResult.getMethod().getMethodName());

        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com/");
    }


    @AfterMethod
    public void tearDown(ITestResult iTestResult){
        try {
            switch (iTestResult.getStatus()){
                case ITestResult.FAILURE:
                    ReportManager.getInstance().getTest().log(Status.FAIL, "Test failed");
                    break;
                case ITestResult.SKIP:
                    ReportManager.getInstance().getTest().log(Status.SKIP, "Test skipped");
                    break;
                case ITestResult.SUCCESS:
                    ReportManager.getInstance().getTest().log(Status.PASS, "Test passed");
                    break;
                default:
                    ReportManager.getInstance().getTest().log(Status.FAIL, "Test incomplete");
            }

           if(iTestResult.getStatus() != ITestResult.SUCCESS && iTestResult.getThrowable() != null){
                ReportManager.getInstance().getTest().log(Status.FAIL, iTestResult.getThrowable().getMessage());
                ScreenShot.takeScreenShotAndAdToHTMLReport(webDriver, Status.FAIL, "Failure Image");
            } else {
               ScreenShot.takeScreenShotAndAdToHTMLReport(webDriver, Status.PASS, "Test passed");
           }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(webDriver != null)
                webDriver.quit();
        }
    }

    @AfterSuite
    public static void tearDownSuite() {
        ReportManager.getInstance().flush();
    }

}
