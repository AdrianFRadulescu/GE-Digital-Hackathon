import javax.swing.*;
import java.awt.*;

/**
 * Created by Ciprian on 03/11/17.
 */
public class DrawTriangle extends JComponent {
    int ax,ay,bx,by,cx,cy;
    public DrawTriangle(int ax,int ay,int bx,int by,int cx,int cy){
        super();
        this.ax=ax;
        this.ay=ay;
        this.bx=bx;
        this.by=by;
        this.cx=cx;
        this.cy=cy;

    }


    public void paintComponent(Graphics g)
    {

        Graphics2D g2=(Graphics2D) g;
        g2.drawLine(ax,ay,bx,by);
        g2.drawLine(bx,by,cx,cy);
        g2.drawLine(ax,ay,cx,cy);
    }
}
