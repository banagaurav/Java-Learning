import javax.swing.*;
import java.awt.*;

class ToolBadrDemo extends JFrame
{
    JToolBar tb;
    JButton b;

    ToolBadrDemo()
    {
        setSize(300,150);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        tb= new JToolBar("Formatting");
        tb.setPreferredSize(new Dimension(300,25));
        add(tb, BorderLayout.NORTH);
        b= new JButton(new ImageIcon("rem.gif"));
        tb.add(b);
        setVisible(true);
    }
    public static void main(String args[])
    {
        ToolBadrDemo frame= new ToolBadrDemo();
    }
}
