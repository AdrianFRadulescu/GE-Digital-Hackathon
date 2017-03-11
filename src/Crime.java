/**
 * Created by Ciprian on 03/10/17.
 */
public class Crime {
    
	
	
	private Location locationName;
	private OutcomeStatus outcomeStatus;
	private String category;
	private String persistentId;
	private Integer id;
	private String locationSubtype;
	private String date;
	
    public Crime(Location locationName, OutcomeStatus outcomeStatus, String category, String persistentId, Integer id, String locationSubtype, String date )
    {
        this.locationName = locationName;
        this.outcomeStatus = outcomeStatus;
        this.date = date;
        this.category = category;
        this.id = id;
        this.locationSubtype = locationSubtype;
    }

    public int danger()
    {
        switch (this.category)
        {
            case ("anti-social-behaviour"):
                return 1;
            case ("burglary"):
                return 5;
            case ("robbery"):
                return 20;
            case "vehicle-crime":
                return 5;
            case "violent-crime":
                return 30;
            case "other-crime":
                return 10;
            case "other-theft":
            	return 3;
            case "criminal-damage-arson":
            	return 15;
             default:
                return 0;
        }
    }
    
    public String toString(){
    	String toString = locationName.toString()  + "\n" + "CrimeId: " + id + "\n"+ outcomeStatus.toString()+ "\n " + "category: " + category + "\n" + "persistentId: " + persistentId + "\n" + "locationSubtype: " + locationSubtype +"\n"+ "date " + date + "\n";
    	//System.out.println(toString);
    	return toString;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setDate(String date) {
		this.date = date;
	}
    public void setId(Integer id) {
		this.id = id;
	}
    public void setLocationName(Location locationName) {
		this.locationName = locationName;
	}
    public void setLocationSubtype(String locationSubtype) {
		this.locationSubtype = locationSubtype;
	}
    public void setOutcomeStatus(OutcomeStatus outcomeStatus) {
		this.outcomeStatus = outcomeStatus;
	}
    public void setPersistentId(String persistentId) {
		this.persistentId = persistentId;
	}
    public String getDate() {
		return date;
	}
    public Integer getId() {
		return id;
	}
    public Location getLocationName() {
		return locationName;
	}
    public String getLocationSubtype() {
		return locationSubtype;
	}
    public OutcomeStatus getOutcomeStatus() {
		return outcomeStatus;
	}
    public String getPersistentId() {
		return persistentId;
	}
}