package class13;

public class HWTask1 {
    public static void main(String[] args) {
        String str="bye";
        if(!str.isEmpty()){
            if(str.length()%2!=0&&str.length()>=3){
                System.out.println(str.charAt(str.length()/2));
            }
        }
    }
}
