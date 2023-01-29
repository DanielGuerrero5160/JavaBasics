package class15;

public class Task1 {
    /*
    Create a method createEmail(). Based on values of users name,
    lastName and email type, your method should return
     complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     */
    String createEmail(String firstname,String lastname,String emailType){
        return firstname.toLowerCase()+lastname.toLowerCase()+"@"+emailType.toLowerCase()+".com";
    }

    public static void main(String[] args) {
        Task1 test=new Task1();
        String newEmail= test.createEmail("julia","conde","outlook");
        System.out.println(newEmail);
        System.out.println(test.createEmail("daniel","guerrero","gmail"));
    }
}
