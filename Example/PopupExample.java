
import java.awt.*;

class PopupExample extends Frame{

    public PopupExample() {
        final Frame f = new Frame("Popup Menu Example");
        final PopupMenu pop = new PopupMenu("Edit");
        MenuItem Copy = new MenuItem("Copy");
        Copy.setActionCommand("Copy");
        MenuItem Paste = new MenuItem("paste");
        Copy.setActionCommand("Paste");
        pop.add(Copy);
        pop.add(Paste);
        f.add(pop);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[])
    {
        new PopupExample();
    }
    
}