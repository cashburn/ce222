import org.imgscalr.Scalr;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
public class ImageResize {
    public static void main(String[] args) {
        if (args.length != 2) {
            return;    
        }
        try {
            File fd = new File(args[0]);
            File newFile = new File(args[1]+"/"+
                args[0].substring(args[0].lastIndexOf('/')+1));
            BufferedImage srcImage = ImageIO.read(fd);
            BufferedImage resized = Scalr.resize(srcImage, srcImage.getWidth() / 2);
            ImageIO.write(resized, getExtension(fd), newFile);
        } catch (Exception e) {
            e.printStackTrace();    
        }
    }
    private static String getExtension(File f) {
        String s = f.toString().toLowerCase();
        return s.substring(s.lastIndexOf('.') + 1);
    }
}
