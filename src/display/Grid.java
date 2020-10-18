package display;

import javax.swing.*;
import java.awt.*;

public class Grid extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public Image img = null;
    public int counter;

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.drawImage(img, 0, 0, null);

    }

}
