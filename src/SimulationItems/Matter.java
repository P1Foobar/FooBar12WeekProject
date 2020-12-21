package SimulationItems;

import java.awt.*;

public class Matter {

    int x;
    int y;
    int length;
    int height;
    Rectangle rect;

    public void setDimensions(int x, int y, int length, int height) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.height = height;
        this.rect = new Rectangle(x, y, length, height);

    }

    public boolean collide(Rectangle otherRect) {
        if (this.rect.getBounds().intersects(otherRect.getBounds())) {
            return true;
        }

        return false;
    }

}
