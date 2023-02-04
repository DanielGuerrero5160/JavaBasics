package class19;

public class Furniture {
    String type;
    double price;
    String color;

    //with the help of constructor, we can initialize objects with specific values
    Furniture(String type, double price, String color){
        this.type=type;
        this.price=price;
        this.color=color;
    }
    void printInfo(){
        System.out.println(type+" price is "+price+" color is "+color);
    }
}
