import java.util.ArrayList;
import java.util.List;

public class TeamComposite implements OlympicsTeams{

    private String name;
    List<OlympicsTeams> olympics = new ArrayList<>();

    public TeamComposite(String name){
        this.name = name;
    }

    public void addTeam(OlympicsTeams team){
        olympics.add(team);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getNumGold() {
        System.out.println(name);
        for(OlympicsTeams c: olympics){
            c.getNumGold();
        }
    }

    @Override
    public void getNumAth() {
        System.out.println(name);
        for(OlympicsTeams c: olympics){
            c.getNumAth();
        }
    }
}
