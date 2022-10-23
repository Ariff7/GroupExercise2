package GroupProject2;

public class FirefoxWebDriver implements RemoteWebDriver {

    @Override
    public void navigate()
    {
        System.out.println("FireFox navigate method");
    }

    @Override
    public void getScreenshot()
    {
        System.out.println(" FireFox getScreenshot method");
    }

    @Override
    public void open()
    {
        System.out.println(" FireFox open method");
    }

    @Override
    public void close()
    {
        System.out.println(" FireFox close method");
    }

    @Override
    public String getTitle()
    {
        return "FireFox";
    }
}
