package class25;

public interface Movable {
void move();

}
interface Ownable{
    void own();
}
class Car implements Movable,Ownable{
    public void move(){
        System.out.println("Car is moving");
    }

    @Override
    public void own() {
        System.out.println("Car can be owned");
    }
}
class Dog implements Movable,Ownable{
    public void move(){
        System.out.println("Car is moving");
    }

    @Override
    public void own() {
        System.out.println("Dog can be owned");
    }
}

