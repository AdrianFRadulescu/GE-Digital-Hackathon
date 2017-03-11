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

    public String toString() {
    	return "StreetName: " + streetName + "\n" + "longitude: " + longitude + "\n" + "latitude: " + latitude ;
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
    
    public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
    
    public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
    
    public void setStreetName(Street streetName) {
		this.streetName = streetName;
	}
    
    public Street getStreetName() {
		return streetName;
	}
    
    
}