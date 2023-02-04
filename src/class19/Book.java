package class19;

public class Book {
    /*
    Write Book class that will have instance
    variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed

     */
    int numOfPages;
    String title;

    Book(String title){
        this.title=title;

    }
    Book(String title, int numOfPages){
        this(title);
        this.numOfPages=numOfPages;
    }
    void printInfo(){
        System.out.println("Title: "+title+"-number of pages: "+numOfPages);
    }

    public static void main(String[] args) {
        Book b1=new Book("Brave new world",355);
        b1.printInfo();
        Book b2=new Book("Fahrenheit 451");
        b2.printInfo();

        new StringBuilder();
        new StringBuilder("hello");
                //we can create these StringBuilders in
        // different ways as the Stringbuilder method has multiple constructors
    }
}
