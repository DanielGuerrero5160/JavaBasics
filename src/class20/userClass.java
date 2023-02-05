package class20;

public class userClass {//the parent of all classes is object class. Every class is a subclass of the onject class
    /*
    Write program: userClass  that has a constructor that initializes
    instance variable name and mobile number. Create a subclass  userInfo that
    will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */

    String name;
    String mobileNumber;
    userClass(String name,String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }

}
class userInfo extends userClass{
    String userAddress;

    userInfo(String name,String mobileNumber,String userAddress){
        super(name,mobileNumber);
        this.userAddress=userAddress;
    }
    void printInfo(){
        System.out.println("Users name is: "+name+" user mobile# is "+mobileNumber+" user address is "+userAddress);


    }

    public static void main(String[] args) {
        userInfo ui=new userInfo("Daniel","8144415223","123 5th Street");
        ui.printInfo();
        ui.hashCode();//this is a method of the obejct class
        //methods in parent class-0
        //methods in child/subclass-1
        //ALL CLASSES IN JAVA HAVE A PARENT CLASS
        //WHO IS THE PARENT?-PARENT OF ALL CLASSES IS OBJECT CLASS
        ui.toString();

    }
}
