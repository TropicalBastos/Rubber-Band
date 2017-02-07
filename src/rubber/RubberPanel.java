
package rubber;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;


public class RubberPanel extends JPanel{

    private Point point1 = null, point2 = null;

    public RubberPanel(){
      //set up configurations for JPanel component
        setPreferredSize(new Dimension(400,300));
        setBackground(Color.black);
        LineListener listener = new LineListener();
        addMouseListener(listener);
        addMouseMotionListener(listener);
    }

//draw method
    @Override
    public void paintComponent(Graphics g){
      //clears panel for redraw
        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        /*if both points are initialised then draw the line
          the points are initialised by the mouselisteners
        */
        if(point1 != null && point2 != null)
            g.drawLine(point1.x, point1.y, point2.x, point2.y);
    }

/*private inner class that initialises and changes the value of the points
depending on where the mouse has been clicked or dragged
*/
    private class LineListener implements MouseListener, MouseMotionListener{


        @Override
        public void mousePressed(MouseEvent e) {
            point1 = e.getPoint();
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            point2 = e.getPoint();
            repaint();
        }


        //Unimplemented override methods from interfaces
        @Override
        public void mouseClicked(MouseEvent e) {
        }
        @Override
        public void mouseReleased(MouseEvent e) {
        }
        @Override
        public void mouseEntered(MouseEvent e) {
        }
        @Override
        public void mouseExited(MouseEvent e) {
        }
        @Override
        public void mouseMoved(MouseEvent e) {
        }

    }

}
