/**
 * Created by Ciprian on 03/10/17.
 */
public class Location {
	
    private Street streetName;
    private String latitude;
    private String longitude;
    
    public Location(Street streetName, String latitude, String longitude) {
    	this.latitude = latitude;
    	this.longitude = longitude;
        this.streetName =streetName;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public Street getStreet() {
        return streetName;
    }
}