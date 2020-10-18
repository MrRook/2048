package display;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Textures {
    static Image[] textures = new Image[14];

    public static void initialize() {
        for (int i = 0; i < textures.length; ++i) {
            try {
                textures[i] = ImageIO.read(new File(String.format("Texture//%d.png", i)));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static Image getTexture(int val) {
        if (val == 0) {
            return textures[0];
        } else {
            //System.out.println((int)(Math.log(val)/Math.log(2)));
            return textures[(int) (Math.log(val) / Math.log(2))];
        }
    }
}
