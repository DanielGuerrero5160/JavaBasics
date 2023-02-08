package class21;

public class AreaTask {



    void AreaMethod(int length){
        System.out.println("Length of the square is " +length*length);
    }
    void AreaMethod(int length, int width){
        System.out.println("Length of the rectangle is " +length*width);
    }
    void AreaMethod(double length){
        System.out.println("Length of the square is " +length*length);
    }
    void AreaMethod(double length, double width){
        System.out.println("Length of the rectangle is " +length*width);
    }

    public static void main(String[] args) {
        AreaTask area=new AreaTask();
        area.AreaMethod(6.5);
        area.AreaMethod(6.8,8.1);
    }

}
