package handlers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.Game;

public class InputHandler implements KeyListener {

	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(Game.key == 0)
		{
		
		if(arg0.getKeyCode() == KeyEvent.VK_UP)
			Game.key = 1;
		if(arg0.getKeyCode() == KeyEvent.VK_DOWN)
			Game.key = 2;
		if(arg0.getKeyCode() == KeyEvent.VK_RIGHT)
			Game.key = 3;
		if(arg0.getKeyCode() == KeyEvent.VK_LEFT)
			Game.key = 4;
		}
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		
		
	}
	

}
