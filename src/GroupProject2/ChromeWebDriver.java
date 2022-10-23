package GroupProject2;

public class ChromeWebDriver implements RemoteWebDriver {
    @Override
    public void navigate()
    {
        System.out.println(" ChromeDriver navigate method");
    }

    @Override
    public void getScreenshot()
    {
        System.out.println(" ChromeDriver getScreenshot method");
    }

    @Override
    public void open()
    {
        System.out.println(" ChromeDriver Test open method");
    }

    @Override
    public void close()
    {
        System.out.println(" ChromeDriver close method");
    }

    @Override
    public String getTitle()
    {
        return "Chrome";
    }
}
