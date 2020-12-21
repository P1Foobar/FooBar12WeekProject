package Simulation;

import SimulationItems.Human;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;

public class SimulationControl {



SimulationView MainSim;
ArrayList<Human> People = new ArrayList<>();


int population;
int immunePeople;
double infectionRate;



public SimulationControl() {

    People.clear();
    MainSim = new SimulationView(this);


}

    public void setValues(int population, int infectionRate, int immunePeople) {
        this.population = population;
        this.immunePeople = immunePeople;
        this.infectionRate = infectionRate;
        createPeople();
        MainSim.drawPeople(People);
        MainSim.repaint();



    }

    public void createPeople() {
     for (int i = 0; i < 2; i++) {
         People.add(new Human(this));

     }
    }

    public void start() {


    }





}
