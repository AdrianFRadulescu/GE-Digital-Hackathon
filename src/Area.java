/**
 * Created by Ciprian on 03/10/17.
 */
public class Area {
    Location location;
    Crime[] listOfCrimes;
    int dangerQuantum;

    public Area(Location location,Crime[] listOfCrimes)
    {
        this.listOfCrimes=listOfCrimes;
        this.location=location ;
        this.dangerQuantum=dangerZone();
    }
    public boolean isDangerous(int dangerThreshold)
    {
        if(this.dangerQuantum<dangerThreshold)
            return false;
        return true;
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
