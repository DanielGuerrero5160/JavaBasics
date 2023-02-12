package class24;

public final class FinalDemo {//when we use final for a class, nothing can inherit the class
    public static void main(String[] args) {
        final int num;
       // num=20; can not change th value of num as it is a final variable and cannot be changed
        num=20; //if we do not assign the value at first, we can assign it once, but then cannot be
        //changed after that first declaration.
        //the variable is basically immutable, but the correct word is "constants"-like in math
        // we created a constant variable
    }
   final void noOneShouldOverrideIt(){
        System.out.println("This method should never be overridden, otherwise, it might break the code base");
    }
}
//class Nelson extends FinalDemo{
    //cannot override a final method
   /* void noOneShouldOverrideIt() {
        System.out.println("Let me do that");
    } */
//}
