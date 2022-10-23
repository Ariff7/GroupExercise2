package GroupProject2;

public class SafariWebDriver implements RemoteWebDriver {
    @Override
    public void navigate()
    {
        System.out.println(" Safari navigate method");
    }

    @Override
    public void getScreenshot()
    {
        System.out.println(" Safari getScreenshot method");
    }

    @Override
    public void open()
    {
        System.out.println(" Safari  open method");
    }

    @Override
    public void close()
    {
        System.out.println(" Safari close method");
    }

    @Override
    public String getTitle()
    {
        return "Safari";
    }
}
