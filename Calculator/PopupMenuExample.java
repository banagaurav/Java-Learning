import java.awt.*;
import javax.swing.JFrame;
public class PopupMenuExample {

    public PopupMenuExample() {
     final JFrame f = new JFrame("Popup Menu Example");
     final PopupMenu popupmenu = new PopupMenu("Edit");

        MenuItem copy = new MenuItem("Copy");
        copy.setActionCommand("copy");
        MenuItem paste = new MenuItem("Paste");
        copy.setActionCommand("Paste");
        popupmenu.add(copy);
        popupmenu.add(paste);
        

        f.add(popupmenu);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
        public static void main(String args[])
        {
            new PopupMenuExample();
        }
    }

