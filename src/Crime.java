/**
 * Created by Ciprian on 03/10/17.
 */
public class Crime implements CrimeCathegory {
    int category;
    float latitude,longitude;
    String streetName,streetID;
    public Crime(int category,float latitude,float longitude,String streetName,String streetID)
    {
        this.category=category;
        this.latitude=latitude;
        this.longitude=longitude;
        this.streetName=streetName;
        this.streetID=streetID;
    }

    public int danger(int category)
    {
        switch (category)
        {
            case (AntiSocialbehaviour):
                return 1;
            case (burglary):
                return 5;
            case (robbery):
                return 20;
            case vehicleCrime:
                return 5;
            case violentCrime:
                return 30;
            case otherCrime:
                return 10;
             default:
                return 0;

        }
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public int getCategory() {
        return category;
    }

    public String getStreetID() {
        return streetID;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setStreetID(String streetID) {
        this.streetID = streetID;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
