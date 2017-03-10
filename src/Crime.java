/**
 * Created by Ciprian on 03/10/17.
 */

/**
 * Class that structures the information of a crime that has been comitted
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

    /**
     *
     * @return what the quantum of danger for that crime is
     */
    public int danger()
    {
        switch (this.category)
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

    /**
     *
     * @return latitute
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     *
     * @return longitude
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     *
     * @return category of the crime
     */
    public int getCategory() {
        return category;
    }

    /**
     *
     * @return streeID
     */
    public String getStreetID() {
        return streetID;
    }

    /**
     *
     * @return streetName
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * setter for category
     * @param category
     */
    public void setCategory(int category) {
        this.category = category;
    }

    /**
     * setter for latitude
     * @param latitude
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    /**
     * setter longitude
     * @param longitude
     */

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    /**
     * setter for streetID
     * @param streetID
     */
    public void setStreetID(String streetID) {
        this.streetID = streetID;
    }

    /**
     * setter for streetName
     * @param streetName
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
