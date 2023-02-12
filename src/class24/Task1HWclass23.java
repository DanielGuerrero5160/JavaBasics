package class24;

public class Task1HWclass23 {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override
some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array.
Loop through each object and execute available methods.

     */

    public static void main(String[] args) {
        // int a=(int)12.5;
        Computer [] computers={new Apple(),new HP()};
        for (Computer c: computers) {
            c.playVideo();
            c.browseInternet();
            if( c instanceof Apple) {//we are checking if the variable c contains the object of an Apple class
                //this if statement will return false for HP
                Apple apple = (Apple) c;//converting variable c back to an Apple object to call Apples own methods
                apple.installApp();
                apple.editVideos();
            }

        }
    }
}
class Computer{
int ram;
int storage;
String os;


    void playVideo(){
        System.out.println("Video is playing");
    }
    void browseInternet(){
        System.out.println("Browing the internet");
    }


}
class Apple extends Computer{
    @Override
    void playVideo() {
        System.out.println(" Apple Playing the video on Quick Time Player");
    }

    @Override
    void browseInternet() {
        System.out.println(" Apple Browsing the internet with safari");
    }
    void editVideos(){
        System.out.println("Editing video with iMovies");
    }
    void installApp(){
        System.out.println("Installing apps from the app store");
    }
}
class HP extends Computer{
    @Override
    void browseInternet() {
        System.out.println("HP is browsing internet with google chrome");
    }

    @Override
    void playVideo() {
        System.out.println("HP playing video using VLC player");
    }
    void installApps(){
        System.out.println("You can install any app on an HP using Microsoft store");
    }
}

