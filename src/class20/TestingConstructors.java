package class20;

public class TestingConstructors {
    public static void main(String[] args) {
      SubClass sub=new SubClass();//When we run thi code, we see the
        // constructor from the parent class, even when we are creating an object of the child/subClass
        //default constructor is being called since we do not have a constructor in SubClass
        //ex; compiler creates default constructor which is SubClass(){}
        //compiler also created a super(); in the subclass constructor above//check this example in SuperClass
        //even if we don't have super, compiler will still use super when the class is inherited

    }
}
