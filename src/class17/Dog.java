package class17;

public class Dog {
    String name;
    String breed;
    int age;
    double weight;

    Dog(String dogName,String dogBreed,int dogAge, double dogWeight){
        name=dogName;
        age=dogAge;
       breed=dogBreed;
      weight=dogWeight;
    }
    void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" age "+age+" weight "+weight);
    }


    public static void main(String[] args) {
Dog dog1=new Dog("hank","golden",12,28);
        Dog dog2=new Dog("bill","pomeranian",1,2);
        Dog dog3=new Dog("tom","papillon",3,9);
        Dog dog4=new Dog("jim","dalmatian",4,22);
        Dog dog5=new Dog("spot","chihuahua",7,2);

     dog1.printInfo();
     dog2.printInfo();
     dog3.printInfo();
     dog4.printInfo();
     dog5.printInfo();
    }
}
