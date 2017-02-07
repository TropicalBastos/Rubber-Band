
import javax.swing.JFrame;
import rubber.RubberPanel;


public class RubberBanding {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Rubber Band");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new RubberPanel());
        //pack frame around the rubberpanel window
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
