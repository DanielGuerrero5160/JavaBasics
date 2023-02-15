package class25;

public interface characteristics {

    void turnOn();
    void wash();

        }

 class SmartWatch implements characteristics {
   public void turnOn() {
        System.out.println("Smartwatch turns on");
    }
       public void wash(){
            System.out.println("I am IP65 rated so you can wash me");
        }
    }


class Phone implements characteristics {
   public void turnOn() {
        System.out.println("Phone turns on");
    }
   public void wash(){
        System.out.println("I am IP65 rated so you can wash me");
    }
}
class Microphone implements characteristics {
   public void turnOn() {
        System.out.println("Mic turns on");
    }
   public void wash(){
        System.out.println("I am IP65 rated so you can wash me");
    }
}
