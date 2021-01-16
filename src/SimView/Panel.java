package SimView;

import SimulationItems.Human;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Panel extends JPanel {

    private ArrayList<Human> People;
    private int numOfPeople;

    public Panel(ArrayList<Human> Peoples, int population) {
        this.People = Peoples;
        this.numOfPeople = population;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < numOfPeople; i++) {
            Human currentHuman = People.get(i);
            currentHuman.draw(g);
        }

    }
}
