package display;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class Grid extends JPanel{

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public Image img=null;
public int counter;
  protected void paintComponent(Graphics g)
  {
	 
	  super.paintComponent(g);
		 g.drawImage(img,0, 0, null);
	 
  }

}
