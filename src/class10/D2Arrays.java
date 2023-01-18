package class10;

public class D2Arrays {
    public static void main(String[] args) {

        String[] cabin0={"Adam","Zafar","Daniel",};
        String[] cabin1={"Nabi","Saud","Abeera",};
        String[] cabin2={"Sam","Natalie","Hiral",};
        String[][] train1=new String [3][3];// 2D array which can hold 3 rows of 3 1D arrays each of size 3
        train1[0]=cabin0;
        train1[1]=cabin1;
        train1[2]=cabin2;

        System.out.println(train1[1][2]);

    }
}
