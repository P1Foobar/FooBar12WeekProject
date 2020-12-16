package Main;


import javax.swing.*;
import java.awt.*;

public class SettingsView extends JFrame {

    JSlider population = new JSlider();
    JSlider infectionRate = new JSlider();
    JSlider immunePeople = new JSlider();


    JButton startSimulation = new JButton();
    //needs to activate timer and send settings to main


public SettingsView() {

    getContentPane().setBackground(Color.lightGray);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setBounds(0, 0, 300, 800);

   population.setBounds(20, 0, 260, 50);
    getContentPane().add(population);



    getContentPane().add(infectionRate);


    getContentPane().add(immunePeople);

}


}
