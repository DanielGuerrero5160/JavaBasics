package class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {

        for(int i=0;i<=10;i++){
            if(i%3==0&&i!=9){
                continue;// skips the value
            }else{
                System.out.println(i);
            }
            System.out.println("Hello java");
        }
    }
}
