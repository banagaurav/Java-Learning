import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class MyGrid {
    JFrame f;
    MyGrid(){
        f = new JFrame();

        JCheckBox c1 = new JCheckBox("Married");

        JRadioButton r1= new JRadioButton("Male");

        Border bdr = new LineBorder(Color.ORANGE,4,true);

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("1");
        JButton b3 = new JButton("1");
        JButton b4 = new JButton("1");
        JButton b5 = new JButton("1");
        JButton b6 = new JButton("1");
        JButton b7 = new JButton("1");
        
        c1.setBounds(100,100,50,50);
        f.add(c1);

        f.add(r1);

        

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.setLayout(null);
        f.setSize(300,300);
        f.setVisible(true);

    }
    public static void main(String args[])
    {
        new MyGrid();
    }
}
