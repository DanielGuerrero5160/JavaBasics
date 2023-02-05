package class20;

public class SportTest {
    public static void main(String[] args) {
        Cricket cricket=new Cricket("Cricket","Pakistan","Blue Helmet");
        cricket.display();
        Soccer soccer=new Soccer("Soccer","UK","Manchester United",45);
        soccer.displayTeam();
        soccer.display();
    }
}
