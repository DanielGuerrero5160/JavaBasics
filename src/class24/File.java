package class24;

public abstract class File {
    /*
    Create a class File that will have the following behaviors:
    open, edit, close. Edit and close are implemented method while open is an abstract.
     Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation
     of open behaviour: Example: to open .java file
    we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
     */
    int size;
    File(int size){//Although we cannot create an instance/object of the abstract super/parent class
        //we can make a constructor in the super/parent class, and create constructors in child classes which will refer to the
        //instance variables in the parent class
        this.size=size;
    }
    abstract void open();
     void edit(){
        System.out.println("Editing file");
    }
     void close(){
         System.out.println("Closing the file");
     }
}
class JavaFile extends File{
    JavaFile(int size) {
        super(size);
    }

    void open(){
        System.out.println("To open .java file");
    }
}
class WordFile extends File{
    WordFile(int size) {
        super(size);
    }

    void open(){
    System.out.println("To open word file, we need to have word installed");
}
}
class PDFFile extends File{
    PDFFile(int size) {
        super(size);
    }

    void open(){
    System.out.println("To open a PDF, we need some PDF viewer app installed");
}
}

