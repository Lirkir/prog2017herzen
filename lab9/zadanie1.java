package lab9;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by kiril on 29.10.2017.
 */
    public class zadanie1 extends Applet {
        public void paint(final Graphics g)

        {

            g.drawLine(0, 0, 500, 0);

            g.drawLine(0, 0, 0, 500);

            g.drawLine(500, 0, 500, 500);

            g.drawLine(500, 500, 0, 500);

            final Color oldColor = g.getColor();

            Color newColor = new Color(0, 0, 255);

            newColor = new Color(200, 50, 200);

            g.drawLine(150, 480, 350, 480);

            g.drawLine(150, 480, 150, 250);

            g.drawLine(350, 480, 350, 250);

            g.setColor(newColor);

            g.drawLine(150, 250, 350, 250);

            g.drawLine(150, 250, 250, 200);

            g.drawLine(350, 250, 250, 200);

            g.setColor(oldColor);

        }
    }
