package blitzcrank;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.imageio.ImageIO;

/**
 *
 * @author theboshy
 */
public class Blitzcrank {

    /**
     * @param args the command line arguments
     * @throws java.awt.AWTException
     * @throws java.lang.InterruptedException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws AWTException, InterruptedException, IOException {
        String stringfyCurrent = String.valueOf(System.currentTimeMillis());
        String path = "{path}";
        String name = "capture" + stringfyCurrent;
        String type = ".jpg";
        //--
        File file = new File(path + name + type);
        BufferedImage imagexd = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(imagexd, type.replace(".", ""), baos);
        byte[] bytes = baos.toByteArray();

        OutputStream out = new FileOutputStream(file);

        out.write(bytes);
        
    }

}
