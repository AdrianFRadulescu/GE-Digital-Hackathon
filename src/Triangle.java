/**
 * Created by Ciprian on 03/11/17.
 */
public class Triangle {
    fPoint x,y,z;
    public  Triangle(float ax,float ay,float bx,float by,float cx, float cy)
    {
        x=new fPoint(ax,ay);
        y=new fPoint(bx,by);
        z=new fPoint(cx,cy);
    }
    float sign (fPoint p1, fPoint p2, fPoint p3)
    {
        return (p1.x - p3.x) * (p2.y - p3.y) - (p2.x - p3.x) * (p1.y - p3.y);
    }


    boolean PointInTriangle (fPoint pt, fPoint v1, fPoint v2, fPoint v3)
    {
        boolean b1, b2, b3;

        b1 = sign(pt, v1, v2) < 0.0f;
        b2 = sign(pt, v2, v3) < 0.0f;
        b3 = sign(pt, v3, v1) < 0.0f;

        return ((b1 == b2) && (b2 == b3));
    }
    
static class fPoint
{
    float x,y;
    fPoint(float x, float y)
    {
        this.x=x;
        this.y=y;
    }

}

}
