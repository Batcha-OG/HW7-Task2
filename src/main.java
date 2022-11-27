public class main {

    public static void main(String[] args) {
        TeamLeaf taekwondo = new TeamLeaf("Taekwondo",1, 2);
        TeamLeaf waterpolo = new TeamLeaf("Waterpolo",3, 4);
        TeamLeaf gymnastics = new TeamLeaf("Artistic Gymnastics",5, 6);
        TeamLeaf shooting = new TeamLeaf("Shooting",7, 8);
        TeamLeaf cycling = new TeamLeaf("Cycling",9, 10);
        TeamLeaf tennis = new TeamLeaf("Tennis",11, 12);
        TeamLeaf tableTennis = new TeamLeaf("Table Tennis",13, 14);
        TeamLeaf football1 = new TeamLeaf("Football",15, 16);
        TeamLeaf alpineSky = new TeamLeaf("Alpine Sky",17, 18);
        TeamLeaf football2 = new TeamLeaf("Football",19, 20);
        TeamLeaf swimming = new TeamLeaf("Swimming Team",21, 22);
        TeamLeaf southAmerica = new TeamLeaf("South America Team", 23, 24);
        TeamLeaf afghanistan = new TeamLeaf("Afghanistan Team", 25, 26);
        TeamLeaf africa = new TeamLeaf("Africa Team", 27, 28);


        TeamComposite women1 = new TeamComposite("Women's Team");
        TeamComposite men1 = new TeamComposite("Men's Team");
        TeamComposite women2 = new TeamComposite("Women's Team");
        TeamComposite men2 = new TeamComposite("Men's Team");
        TeamComposite women3 = new TeamComposite("Women's Team");
        TeamComposite men3 = new TeamComposite("Men's Team");

        TeamComposite china = new TeamComposite("China Team");
        TeamComposite germany = new TeamComposite("Germany Team");
        TeamComposite italy = new TeamComposite("Italy Team");

        TeamComposite asia = new TeamComposite("Asia Team");
        TeamComposite europe = new TeamComposite("Europe Team");

        TeamComposite olympicsTeams = new TeamComposite("Olympics Teams");


        women1.addTeam(taekwondo);
        women1.addTeam(waterpolo);
        women1.addTeam(gymnastics);
        men1.addTeam(shooting);
        women2.addTeam(cycling);
        women2.addTeam(tennis);
        men2.addTeam(tableTennis);
        men2.addTeam(football1);
        women3.addTeam(alpineSky);
        men3.addTeam(football2);
        men3.addTeam(swimming);

        china.addTeam(women1);
        china.addTeam(men1);
        germany.addTeam(women2);
        germany.addTeam(men2);
        italy.addTeam(women3);
        italy.addTeam(men3);

        asia.addTeam(china);
        asia.addTeam(afghanistan);
        europe.addTeam(germany);
        europe.addTeam(italy);

        olympicsTeams.addTeam(asia);
        olympicsTeams.addTeam(africa);
        olympicsTeams.addTeam(europe);
        olympicsTeams.addTeam(southAmerica);

        // subtask 4
        System.out.println(germany.getName()); // a.
        men2.getNumAth();
        System.out.println("----------");

        germany.getNumGold(); // b.
        System.out.println("----------");

        asia.getNumGold(); // c.
        System.out.println("----------");

        olympicsTeams.getNumGold(); // d.

    }
}
