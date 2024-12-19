import javax.swing.*;
class MenuExample{
    JMenu menu,submenu;
    JMenuItem i1,i2,i3,i4;
    public MenuExample() {
    JFrame f = new JFrame("Menu and MenuItem Example");
    JMenuBar mb = new JMenuBar();
    //add menu item
    menu= new JMenu("Menu");
    //add submenu
    submenu = new JMenu("Sub Menu");
    //submenu items
    i1 = new JMenuItem("Item 1");
    i2 = new JMenuItem("Item 2");
    i3 = new JMenuItem("Item 3");
    i4 = new JMenuItem("Item 4");
    //add submenu items
    submenu.add(i1);
    submenu.add(i2);
    submenu.add(i3);
    submenu.add(i4);
    //add submenu to menu
    menu.add(submenu);
    //add menu to menu bar
    mb.add(menu);
    //add menu bar to frame
    f.setJMenuBar(mb);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
}
public static void main(String args[]){
    new MenuExample();
}
}