package class12;

public class SkateboardTester {
    public static void main(String[] args) {
        Skateboard real=new Skateboard();
        real.color="Red";
        real.size=8.25;
        real.brand="Real";

        real.ollie();
        real.grind();
    }
}
