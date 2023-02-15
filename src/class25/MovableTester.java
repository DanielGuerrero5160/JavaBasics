package class25;

public class MovableTester {
    public static void main(String[] args) {
        //first way to implement polymorphism
        Movable[] arr={new Car(),new Dog()};
        for(Movable x:arr){
            x.move();
        }
        //second way to implement polymorphism
        for (int i = 0; i < arr.length; i++) {
            arr[i].move();

        }




        characteristics [] cArr={new Phone(),new Microphone(), new SmartWatch()};
        for(characteristics x:cArr){
            x.turnOn();
            x.wash();
        }
    }

}
