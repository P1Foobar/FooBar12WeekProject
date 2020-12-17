package Main;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SettingsView extends JFrame {






    JButton startSimulation = new JButton();
    //needs to activate timer and send settings to main


public SettingsView() {

    getContentPane().setBackground(Color.lightGray);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
    immunePeople.setBounds(0, 0, 20, 50);
    getContentPane().add(immunePeople);



}


}
