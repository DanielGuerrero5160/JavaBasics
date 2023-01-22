package class12;

public class Task6 {
    /*
    Create 2D array of countries: north america countries, south america countries,
europe countries, asian countries, african countries.
Then print all values from that array using 2 different loops and
calculate how many total countries been stored.
     */
    public static void main(String[] args) {


        String[][] countries = {{"USA", "Mexico", "Canada"},
                {"Brazil", "Argentina", "Colombia", "Chile"},
                {"Germany", "Spain", "UK", "France"},
                {"China", "India", "Japan"},
                {"Egypt", "Nigeria", "South Africa"},
        };
        int sum = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                sum++;
                System.out.print(countries[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("The sum of the countries is "+sum);
        System.out.println("*************");
        int count=0;
        for(String[] x:countries){
            for(String y:x){
                count++;
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of countries in array is "+count);
    }
}
