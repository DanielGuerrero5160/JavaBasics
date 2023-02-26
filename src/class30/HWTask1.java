package class30;

import java.util.LinkedHashSet;

public class HWTask1 {
    public static void main(String[] args) {
        /*
        Create a Set of cities in which you want to
        make sure that insertion order is maintained.
        Then remove any city that starts with “A”;
         */

        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Esat Brunswick");
        cities.add("Marlboro");
        cities.add("Albany");
        cities.add("Manalapan");
        cities.add("Arlington");
        cities.add("Linden");
        cities.add("Atlanta");
        cities.add("Trenton");
        cities.add("Amed");
        cities.add("Ankara");
        cities.add("Boston");
        cities.add("Dersim");
        cities.add("Chicago");
        cities.add("New Delhi");
        cities.add("Kiev");
        cities.add("Mardin");
        cities.add("Silopi");

        cities.removeIf(s->s.startsWith("A")||s.startsWith("a"));
        System.out.println(cities);

    }
    }

