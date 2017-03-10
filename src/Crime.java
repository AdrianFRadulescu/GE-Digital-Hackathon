/**
 * Created by Ciprian on 03/10/17.
 */
public class Crime {
    
	
	
	private Location locationName;
	private OutcomeStatus outcomeStatus;
	private String category;
	private String persistentId;
	private String id;
	private String locationSubtype;
	private String date;
	
    public Crime(Location locationName, OutcomeStatus outcomeStatus, String category, String persistentId, String id, String locationSubtype, String date )
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
            case ("AntiSocialbehaviour"):
                return 1;
            case ("burglary"):
                return 5;
            case ("robbery"):
                return 20;
            case "vehicleCrime":
                return 5;
            case "violentCrime":
                return 30;
            case "otherCrime":
                return 10;
             default:
                return 0;
        }
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}