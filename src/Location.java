/**
 * Created by Ciprian on 03/10/17.
 */
public class Location {
	
    public Street streetName;
    Crime[] listOfCrimes;
    int dangerQuantum;
    private String latitude;
    private String longitude;
    
    public Location(Street streetName,Crime[] listOfCrimes, String latitude, String longitude)
    {
    	this.latitude = latitude;
    	this.longitude = longitude;
        this.listOfCrimes=listOfCrimes;
        this.streetName =streetName;
        this.dangerQuantum=dangerZone();
    }

    public int dangerZone()
    {
        int danger=0;
        for (int i=0;i<listOfCrimes.length;i++)
        {
         danger+=listOfCrimes[i].danger();
        }
        return danger;
    }
    public String toStringAllCrimes()
    {
        String allCrimes="";
        for(int i=0;i<listOfCrimes.length;i++)
            allCrimes+=listOfCrimes[i]+"\n";
        return allCrimes;

    }
    public int getDangerQuantum()
    {
        return this.dangerQuantum;

    }

}
