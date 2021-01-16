package Simulation;

import SimView.SimulationView;
import SimulationItems.Human;

import java.util.ArrayList;
import java.util.Timer;

public class SimulationControl {



SimulationView MainSim;
public ArrayList<Human> People = new ArrayList<>();


public int population;
int immunePeople;
double infectionRate;



public SimulationControl() {

    People.clear();
   // MainSim = new SimulationView(this);


}

    public void setValues(int population, int infectionRate, int immunePeople) {
        this.population = population;
        this.immunePeople = immunePeople;
        this.infectionRate = infectionRate;




    }

    public void createPeople() {
     for (int i = 0; i < 2; i++) {
         People.add(new Human(this));

     }
    }

    public void start() {
        createPeople();
        MainSim = new SimulationView(this);
        //MainSim.repaint();

    }





}
