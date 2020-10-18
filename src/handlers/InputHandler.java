package handlers;

import main.Game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputHandler implements KeyListener {

    public void keyPressed(KeyEvent arg0) {
        // TODO Auto-generated method stub
        if (Game.key == 0) {
            System.out.println(arg0.getKeyCode());
            if (arg0.getKeyCode() == KeyEvent.VK_UP)
                Game.key = 1;
            else if (arg0.getKeyCode() == KeyEvent.VK_DOWN)
                Game.key = 2;
            else if (arg0.getKeyCode() == KeyEvent.VK_RIGHT)
                Game.key = 3;
            else if (arg0.getKeyCode() == KeyEvent.VK_LEFT)
                Game.key = 4;
            else if (arg0.getKeyCode() == KeyEvent.VK_R)
                Game.key = 10;
        }
    }

    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

    public void keyTyped(KeyEvent arg0) {


    }


}
