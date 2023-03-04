import java.util.*;
public class Main {
    public static void main(String[] args){
        Map<String,String> lhm=new LinkedHashMap<>();
        lhm.put("Street","Patrick ST");
        lhm.put("Suite","265");
        lhm.put("City","Vienna");
        lhm.put("Zip","22180");
        lhm.put("Country","United State");

        Iterator<String> i=lhm.values().iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }

}