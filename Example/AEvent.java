import java.awt.*;
import java.awt.event.*;

public class AEvent extends Frame implements  ActionListener {
    TextField tf;
    public AEvent() {
    //create components
    tf = new TextField();
    tf.setBounds(60,50,170,20);
    Button b = new Button("Click me");
    b.setBounds(100,120,80,30);

    //Resgister Listener
    b.addActionListener(this); //passing current instance

    //add components & setSize , Layout and visibility
    add(tf);
    add(b);
    setSize(300,300);
    setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
    tf.setText("Welcome");
}
    public static void main(String[] args) {
    new AEvent();    
    }
}
