import javax.swing.*;
import java.awt.*;

/**
 * Created by Ciprian on 03/11/17.
 */
public class Visualisation  {

    public void drawTriangle(int ax, int ay, int bx, int by, int cx, int cy, Graphics g)
    {
        g.drawLine(ax,ay,bx,by);
        g.drawLine(bx,by,cx,cy);
        g.drawLine(ax,ay,cx,cy);

    }
    public static void main()
    {
        JFrame frame=new JFrame("Visualisation");
        frame.setSize(800,800);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        DrawTriangle triangle=new DrawTriangle(100,100,100,200,200,100);
        frame.add(triangle);

    }
}
