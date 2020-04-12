package day54.selenium;

public interface WebDriver {

    //create WebDriver interface
    //add behaviors:
    //openBrowser()
    //navigateTo(String url) // we need parameter since we need to know where to go
    //void closeBrowser()
    //void maximize();


    public abstract void openBrowser () ;
    public abstract void navigateTo(String url) ;
    public abstract void maximize () ;
    public abstract void closeBrowser ();


    //create two implementing classes :
    // ChromeDriver
    // FirefoxDriver


}
