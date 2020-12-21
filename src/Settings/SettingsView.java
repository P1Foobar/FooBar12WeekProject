package Settings;


import Simulation.SimulationControl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SettingsView extends JFrame {



    //needs to activate timer and send settings to main


public SettingsView() {

    getContentPane().setBackground(Color.lightGray);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    getContentPane().setLayout(null);
    setBounds(0, 0, 400, 800);


    JSlider population = new JSlider(0, 100, 1);
    population.setMajorTickSpacing(10);
    population.setMinorTickSpacing(1);
    population.setPaintTicks(true);
    population.setPaintLabels(true);
    population.setBounds(0, 0, 400, 50);
    getContentPane().add(population);

    JSlider infectionRate = new JSlider(0, 100, 1);
    infectionRate.setMajorTickSpacing(10);
    infectionRate.setMinorTickSpacing(1);
    infectionRate.setPaintTicks(true);
    infectionRate.setPaintLabels(true);
    infectionRate.setBounds(0, 70, 400, 50);
   getContentPane().add(infectionRate);

  // getContentPane().add(infectionRate, BorderLayout.NORTH);


    JSlider immunePeople = new JSlider(0, 100, 1);
    immunePeople.setMajorTickSpacing(10);
    immunePeople.setMinorTickSpacing(1);
    immunePeople.setPaintTicks(true);
    immunePeople.setPaintLabels(true);
    immunePeople.setBounds(0, 140, 400, 50);
    getContentPane().add(immunePeople);

    JButton startSimulation = new JButton("Start the Simulation!");
    startSimulation.setBounds(125, 600, 150, 30);
    getContentPane().add(startSimulation);

    startSimulation.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            SimulationControl SimCon =  new SimulationControl();
             SimCon.setValues(population.getValue(), infectionRate.getValue(), immunePeople.getValue());


        }
    });


}


}
