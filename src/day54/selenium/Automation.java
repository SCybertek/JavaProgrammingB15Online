package day54.selenium;

public class Automation {
    public static void main(String[] args) {

        WebDriver a1 = new ChromeDriver();
        //referring sub type with super type : this is POLYMORPHISM in here

        a1.openBrowser();
        a1.maximize();
        a1.navigateTo("www.cybertekschool.com");
        a1.closeBrowser();
        ChromeDriver c1 = new ChromeDriver();

    }
}
