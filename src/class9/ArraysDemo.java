package class9;

public class ArraysDemo {
    public static void main(String[] args) {
        String name="Daniel";
        String name2="Julia";
        String name3="Sardar";

        String [] names={"Daniel","Julia","Sardar"};


        System.out.println(names[1]);//Prints Julia
        System.out.println(names[0]);//prints Daniel
        System.out.println(names[0]+" Loves "+names[1]);
        //System.out.println(names[500]); This will make an error as there is no name on index 500
        System.out.println("**************");
        for(int i=0; i<3;i++){
            System.out.println(names[i]);
        }
    }
}
