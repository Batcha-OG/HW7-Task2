public class TeamLeaf implements OlympicsTeams{

    private String name;
    private int numAth;
    private int numGold;

    public TeamLeaf(String name, int numAth, int numGold){
        super();
        this.name = name;
        this.numAth = numAth;
        this.numGold = numGold;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getNumGold() {
        System.out.print("Team: " +  name + ", Number of Athletes: "  + numAth);
        System.out.println();
    }

    @Override
    public void getNumAth() {
        System.out.print("Team: " + name + ", Number of Gold: "  + numAth);
        System.out.println();
    }
}
