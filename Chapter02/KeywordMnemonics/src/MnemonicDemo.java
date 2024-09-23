import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MnemonicDemo{
    public static void main(String [] args){
    //Create the main frame
    JFrame frame = new JFrame("Mnemonic Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,300);

    //Create a menu bar
    JMenuBar menuBar = new JMenuBar();

    //Create a file menu
    JMenu fileMenu = new JMenu("File");
    fileMenu.setMnemonic('F'); // Mnemonic for the File menu

    //Create menu items
    JMenuItem openItem = new JMenuItem("Open");
    openItem.setMnemonic('O'); // Mnemonic for the Open Menu item
    openItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed (ActionEvent e){
            JOptionPane.showMessageDialog(frame, "Open seleted");
        }
    });

    JMenuItem saveItem = new JMenuItem("Save");
    saveItem.setMnemonic('S'); // Mnemonic for the Save Menu item
        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Save selected");
            }
        });

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic('X'); // Mnemonic for the Exit Menu item
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Add menu items to the file menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        //Add the file menu to the menu bar
        menuBar.add(fileMenu);

        //Set the menu var for the frame
        frame.setJMenuBar(menuBar);

        //Display the frame
        frame.setVisible(true);
}
}