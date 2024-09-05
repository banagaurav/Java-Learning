import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class SliderExample1 {
    public SliderExample1(){
        JFrame f = new JFrame("Slider");
        JSlider slider = new JSlider(JSlider.HORIZONTAL,0,50,25);
        JPanel panel = new JPanel();
        panel.add(slider);
        f.add(panel);
        f.pack();
        f.setVisible(true);
    }
    public static void main(String [] args)
    {
        SliderExample1 se = new SliderExample1();
    }
}