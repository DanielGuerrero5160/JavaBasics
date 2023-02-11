package class23;

public class WebDriver {

    public void startBrowser(){
        System.out.println("starting the browser");
    }
    public void openURL(){
        System.out.println("opening a URL");
    }
    public void testLoginPage(){
        System.out.println("checking if login page works");
    }
    public void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting google chrome");
    }

    @Override
    public void openURL() {
        System.out.println("opening the url in chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing login page in chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing chrome browser");
    }
}
class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting safari");
    }

    @Override
    public void openURL() {
        System.out.println("opening the url in safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("opening the url in safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing safari browser");
    }
}
class FireFox extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("Starting firefox");
    }

    @Override
    public void openURL() {
        System.out.println("opening the url in firefox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("opening the url in firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing firefox browser");
    }
}
