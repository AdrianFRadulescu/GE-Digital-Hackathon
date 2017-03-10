/**
 * Created by Ciprian on 03/10/17.
 */
public class Location {
    public String nameLocation;
    Crime[] listOfCrimes;
    public Location(String nameLocation,Crime[] listOfCrimes)
    {
        this.listOfCrimes=listOfCrimes;
        this.nameLocation=nameLocation;
    }

    public void displayAllCrimes()
    {
        String allCrimes="";
        for(int i=0;i<listOfCrimes.length;i++)
            listOfCrimes[i];
    }
}
