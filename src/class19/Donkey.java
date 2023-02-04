package class19;

public class Donkey {
    String name;
    int age;
    double weight;

/*Donkey(){

}

 */
    Donkey(String name, int age, double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    void print(){
        System.out.println("Name: "+name+" age: "+age+" weight: "+weight);
    }
}
