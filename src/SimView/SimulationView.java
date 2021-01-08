package SimView;

import Simulation.SimulationControl;
import SimulationItems.Human;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;

public class SimulationView extends JPanel implements ActionListener {

    ArrayList<Human> People = new ArrayList<>();


public SimulationView(SimulationControl Control) {

    JFrame frame = new JFrame();
    frame.getContentPane().setBackground(Color.lightGray);
    frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    frame.setBounds(0, 0, 800, 800);
    frame.setVisible(true);


}


public void Peopleinit(SimulationControl Control) {
    People = Control.People;
    javax.swing.Timer gameTimer = new javax.swing.Timer(10, this);
}

    @Override
    public void actionPerformed(ActionEvent e) {


        for (Human person : this.People) {
            person.updatePosition();
           /* if (person.collide() == true) {

            }*/

        }
        repaint();
    }





    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponents(g);

        Graphics2D gui = (Graphics2D) g;

       for (Human person : this.People) {
           gui.setColor(Color.black);
           gui.fillRect(person.getX()+400, person.getY()+400, 10, 10);

           System.out.println(String.valueOf(person.getX()));
        }

        //gui.fillRect(50, 50, 10, 10);

    }
}
