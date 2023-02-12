package class24;

public abstract class Phone {
    /*
    Create a phone class, lets create abstract methods like displayPictures,
    unlock phone, send text. Then create 2 child classes and provide specific implementation of the methods.
     */
    abstract void displayPictures();
    abstract void unlockPhone();
    abstract void sendText();

}
class IPhone extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Iphone is displaying pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("Iphone is being unlocked");
    }

    @Override
    void sendText() {
        System.out.println("Iphone is sending a text");
    }
}
class Samsung extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Samsung is displaying pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("Samsung is being unlocked");
    }

    @Override
    void sendText() {
        System.out.println("Samsung is sending a text");
    }
}
