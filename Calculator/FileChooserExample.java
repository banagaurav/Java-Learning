
import java.awt.Component;
import javax.swing.JFileChooser;

public class FileChooserExample {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
    int result = fileChooser.showOpenDialog(parent);
}
