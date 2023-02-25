package class29;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create an arraylist of cars and retrieve all the values using 3 different ways.
         */

        ArrayList<String> cars=new ArrayList<>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Tesla");
        cars.add("Rolls Royce");

        System.out.println(cars);

        for (String s:cars) {
            System.out.println(s);
        }

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

    }
}
