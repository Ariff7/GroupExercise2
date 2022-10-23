package GroupProject2;

public class WebDriverTest {
    public static void main(String[] args)
    {
        RemoteWebDriver [] arr = {new ChromeWebDriver(), new FirefoxWebDriver(), new SafariWebDriver()};

        for (RemoteWebDriver run : arr)
        {
            System.out.println(run.getTitle());
            run.open();
            run.navigate();
            run.getScreenshot();
            run.close();
            System.out.println();
        }
    }
}
