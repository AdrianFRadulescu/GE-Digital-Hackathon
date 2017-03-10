/**
 * Created by Ciprian on 03/10/17.
 */
public class Area {
    public String nameLocation;
    Crime[] listOfCrimes;
    int dangerQuantum;
    public Area(String nameLocation,Crime[] listOfCrimes)
    {
        this.listOfCrimes=listOfCrimes;
        this.nameLocation=nameLocation;
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