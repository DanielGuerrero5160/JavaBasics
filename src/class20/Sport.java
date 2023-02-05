package class20;

public class Sport {
    String name;
    String country;

    Sport(String name,String country){
        this.name=name;
        this.country=country;
    }
    public void display(){
        System.out.println(name+" is played in: "+country);
    }
}
class Cricket extends Sport {
    String helmet;

    Cricket(String name, String country, String helmet) {//local variable in child constructor also need to have the
        // variables from parent constructor
        super(name, country);//we need to add the variables of the parent class constructor
        //makes a call to the immediate super class constructor
        //super always must be on the first line of the constructor

        this.helmet = helmet;
    }
}
    class Soccer extends Sport{
        int numberOfPlayers;
        String team;
        Soccer(String name, String country,String team,int numberOfPlayers){
            super(name,country);
            this.numberOfPlayers=numberOfPlayers;
            this.team=team;
        }
        void displayTeam(){
            System.out.println(team+" consists of "+numberOfPlayers+" players");
        }

    }




