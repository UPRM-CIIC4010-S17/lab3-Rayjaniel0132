
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
     * 
     */
    private static final long serialVersionUID = 7057541440811488699L;
            /**
     * 
     */
            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.white);
                        g.fillRect(x1, y1, width + 1, height +1);
                        g.setColor(Color.red);
                        g.fillRect(x1, y1 ,width+1, 53 );
                        g.setColor(Color.white);
                        g.fillRect(x1, 53 ,width+ 1, 53  );
                        g.setColor(Color.red);
                        g.fillRect(x1, 106 ,width+ 1, 53 );
                        g.setColor(Color.white);
                        g.fillRect(x1, 159 ,width+ 1, 53  );
                        g.setColor(Color.red);
                        g.fillRect(x1, 212,width+ 1, 53 );              
                       
                        g.setColor(Color.blue);
                        
                        Polygon p = new Polygon();
                        p.addPoint(0, 0);
                        p.addPoint(getWidth()/2 , getHeight()/2 );	
                        p.addPoint(0 , getHeight());
                      	g.setColor(Color.blue);
                      	g.fillPolygon(p);

                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 55, y1 + 128);
                        p2.addPoint(x1 + 71, y1 + 128);
                        p2.addPoint(x1 + 77, y1 + 113);
                        p2.addPoint(x1 + 83, y1 + 128);
                        p2.addPoint(x1 + 99, y1 + 128);
                        p2.addPoint(x1 + 86, y1 + 138);
                        p2.addPoint(x1 + 91, y1 + 153);
                        p2.addPoint(x1 + 77, y1 + 143);
                        p2.addPoint(x1 + 64, y1 + 153);
                        p2.addPoint(x1 + 68, y1 + 138);
                        g.setColor(Color.white);
                        g.fillPolygon(p2);
                       
            }
}
