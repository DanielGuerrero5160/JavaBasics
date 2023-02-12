package class24;

public class FileTester {
    public static void main(String[] args) {
      File[] files={new JavaFile(1),new PDFFile(2),new WordFile(3)};
      for(File f:files){
          f.open();
      }
        System.out.println("**************");

        for (int i = 0; i < files.length; i++) {
           File f= files[i];
           f.open();
           f.close();
           f.edit();

        }
    }
}
