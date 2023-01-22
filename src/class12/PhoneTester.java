package class12;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphone=new Phone();
        iphone.brand="Iphone";
        iphone.color="Gold";
        iphone.price=1500 ;
        iphone.version=11 ;
        iphone.storage= 256;
        iphone.isUnlocked=true;

        Phone phone2=new Phone();
        phone2.brand="Pixel";
        phone2.color="black";
        phone2.price=900 ;
        phone2.version=7 ;
        phone2.storage=512 ;
        phone2.isUnlocked=false;
        phone2.sendingMessages();


        Phone phone3=new Phone();
        phone3.brand="Samsung ";
        phone3.color="Silver";
        phone3.price=700 ;
        phone3.version=9;
        phone3.storage=64 ;
        phone3.isUnlocked=false;
        phone3.ringing();



    }
    }

