package class23;

public class WebDriverTester {
    public static void main(String[] args) {


       // WebDriver webDriver = new FireFox();//upcasting
        //we can create a variable of type webdriver(parent class)
        //and we are creating a new object of the child class Chrome
        //we can change the subclass after the new keyword and then the methods of that subclass will run
        //webDriver.startBrowser();
        //webDriver.openURL();
        //webDriver.testLoginPage();
        //webDriver.closeBrowser();
//polymorphism allows us to create objects of child class in the type of the parent
        //this allows us to more easily call methods of child classes without changing a lot of code

        //below is an array of type parent class can hold the objects of all the child classes
        WebDriver[] browsers={new Chrome(),new Safari(),new FireFox()};//storing objects of children classes
        //in an array of the parent class type

        for (int i = 0; i < browsers.length; i++) {//iteratoring thru the array to call each method on each object in the array
            browsers[i].startBrowser();
            browsers[i].openURL();
            browsers[i].testLoginPage();
            browsers[i].closeBrowser();
            System.out.println("***********");
        }

        System.out.println("*********Enhanced for loop example below**********");
        for (WebDriver browser:browsers) {
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
            System.out.println();
        }

        /*
        System.out.println("*****************");

        Safari sf=new Safari();
        sf.startBrowser();
        sf.openURL();
        sf.testLoginPage();
        sf.closeBrowser();

        FireFox ff=new FireFox();
        ff.startBrowser();
        ff.openURL();
        ff.testLoginPage();
        ff.closeBrowser();
*/




    }
}
