package SimulationItems;

import Simulation.SimulationControl;

import javax.naming.ldap.Control;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Human extends Matter {


    int x;
    int y;
    double vx;
    double vy;

    public enum InfectionState{none, infected, survived, immune, dead}


public Human(SimulationControl Control) {
        setRandomPos();
        //setRandomV();
   //collision(Control);
}

    public void setRandomV() {
        double velocityx = Math.random()*10;
        double velocityy = Math.random()*10;

        double NoPx = Math.random();
        double NoPy = Math.random();

        if (NoPx < 0.5) {
            this.vx = velocityx*-1;
        }
        else {
            this.vx = velocityx;
        }

        if (NoPy < 0.5) {
            this.vy = velocityy*-1;
        }
        else {
            this.vy = velocityy;
        }

    }

    public void setRandomPos() {
        this.x = (int) (Math.random()*100);

        this.y = (int) (Math.random()*100);

        double NoPx = Math.random();
        double NoPy = Math.random();

        if (NoPx < 0.5) {
            this.x = this.x*-1;
        }
        else {
            this.x = this.x;
        }

        if (NoPy < 0.5) {
            this.y = this.y*-1;
        }
        else {
            this.y = this.y;
        }


    }



    public void updatePosition() {
    this.x = x+(int)vx;
    this.y = y+(int)vy;
    }

    public void collision(SimulationControl Control) {
        Human temp = new Human(Control); //temporary rectangle until I figure out a way to handle collisions
        if (collide(temp.rect) == true) {

            if (this.x > temp.rect.x) {

            }

        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
