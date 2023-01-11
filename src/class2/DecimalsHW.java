package class2;

public class DecimalsHW {
    public static void main(String[] args) {
        double decimal1=11.25;
        double decimal2=20.32;
        System.out.println("The Addition of 2 numbers 11.25 and 20.32 is equal to " + (decimal1+decimal2));
        System.out.println("The Multiplication of 2 numbers 11.25 and 20.32 is equal to "+ decimal1*decimal2);
        System.out.println("The Division of 2 numbers 11.25 and 20.32 is equal to "+ decimal1/decimal2);
        System.out.println("The Subtraction of 2 numbers 11.25 and 20.32 is equal to "+ (decimal1-decimal2));

        double number=3.9;
        double squareOfNumber=number*number;
        System.out.println("The square of the 3.9 is " + squareOfNumber);

        double rectangleWidth=5.0;
        double rectangleHeight=8.0;
        double area=rectangleWidth*rectangleHeight;
        double perimeter=rectangleWidth*2+rectangleHeight*2;
        System.out.println("The perimeter of a rectangle with width " +rectangleWidth+ " and height " +rectangleHeight+ " is equal to "+perimeter+ " and the area is "+area);

    }
}
