/**
 * Created by Ciprian on 03/11/17.
 */
public class User {
    float longitude,latitude;
    String areaName;
    public User(float longitude,float latitude,String areaName)
    {
    this.latitude=latitude;
    this.longitude=longitude;
    this.areaName=areaName;
    }

    public boolean isInGivenArea(Area area)
    {
        return area.triangle.PointInTriangle(new Triangle.fPoint(latitude,longitude),area.triangle.x,area.triangle.y,area.triangle.z);
    }
}
