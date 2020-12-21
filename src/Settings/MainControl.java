package Settings;

public class MainControl {

int population;
int immunePeople;
int infectionRate;


    public static void main(String[] args) {
        SettingsView Settings = new SettingsView();
        Settings.setVisible(true);
    }

    public MainControl(int population, int infectionRate, int immunePeople) {
        this.population = population;
        this.immunePeople = immunePeople;
        this.infectionRate = infectionRate;


    }





}
