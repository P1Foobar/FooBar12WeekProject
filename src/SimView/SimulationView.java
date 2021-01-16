package SimView;

import Simulation.SimulationControl;
import SimulationItems.Human;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Timer;

public class SimulationView implements ActionListener {

    ArrayList<Human> People = new ArrayList<>();
    int population;
    int currentTime = 0;


    private Panel viewPanel;
    javax.swing.Timer timer;
public SimulationView(SimulationControl Control) {

    People = Control.People;
    population = Control.population;

    JFrame frame = new JFrame();
    //frame.getContentPane().setBackground(Color.lightGray);
    //frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    //frame.getContentPane().setLayout(null);
    //frame.setBounds(0, 0, 800, 800);

    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent event) {
            frame.dispose();
            System.exit(0);
        }
    });

    viewPanel = new Panel(People, population);

    frame.add(viewPanel);


    frame.pack();
    frame.setLocationByPlatform(true);
    frame.setVisible(true);

    timer = new javax.swing.Timer(5, this::actionPerformed);
    timer.start();

}




    @Override
    public void actionPerformed(ActionEvent e) {

        for (Human person : this.People) {
            person.updatePosition();
            viewPanel.repaint();
           /* if (person.collide() == true) {

            }*/

        }

        currentTime = currentTime + 5;
        if (currentTime > 100000) {
            timer.stop();
        }

    }





}
